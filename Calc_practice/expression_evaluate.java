
package Calc_practice;

import java.util.Stack;

/**
 *
 * @author Benitto Raj
 */
public class expression_evaluate
{
    public static int evaluate(String s)
    {
      //change the string into character array
      char tokens[]=s.toCharArray();
      //create stack of storing values
      Stack <Integer> values = new Stack<Integer>();
      //create stack for storing operators
      Stack <Character> ops = new Stack <>(); 
      
      for (int i=0;i<tokens.length;)
      {
         
                   // Current token is a number, push it to stack for numbers 
            if (tokens[i] >= '0' && tokens[i] <= '9') 
            { 
                StringBuffer sbuf = new StringBuffer(); 
                // There may be more than one digits in number 
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
                    sbuf.append(tokens[i++]); 
                values.push(Integer.parseInt(sbuf.toString())); 
                System.out.println("The values of sbuff is;"+sbuf);
            } 
  
            // Current token is an opening brace, push it to 'ops' 
            else if (tokens[i] == '(') 
                ops.push(tokens[i]); 
  
            // Closing brace encountered, solve entire brace 
            else if (tokens[i] == ')') 
            { 
                while (ops.peek() != '(') 
                    values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
                    System.out.println("values is:"+values.peek());
                ops.pop(); 
            } 
  
            // Current token is an operator. 
            else if (tokens[i] == '+' || tokens[i] == '-' || 
                     tokens[i] == '*' || tokens[i] == '/') 
            { 
                // While top of 'ops' has same or greater precedence to current 
                // token, which is an operator. Apply operator on top of 'ops' 
                // to top two elements in values stack 
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 
                {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
                    System.out.println("The values of preceedence:"+values.peek());
                }
  
                // Push current token to 'ops'. 
                ops.push(tokens[i]); 
            } 
        }    
       while (!ops.empty()) 
        {
            values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
            System.out.println("The values is:"+values.peek());
        }

      return values.pop();
    }
       public static boolean hasPrecedence(char op1, char op2) 
    { 
        if (op2 == '(' || op2 == ')') 
            return false; 
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
            return false; 
        else
            return true; 
    } 
   public static int applyOp(char op, int b, int a) 
    { 
        switch (op) 
        { 
        case '+': 
            return a + b; 
        case '-': 
            return a - b; 
        case '*': 
            return a * b; 
        case '/': 
            if (b == 0) 
                throw new
                UnsupportedOperationException("Cannot divide by zero"); 
            return a / b; 
        } 
        return 0; 
    } 
    
    public static void main(String args[])
    {
       int ans = expression_evaluate.evaluate("((3+3)*3)");
    }
}
