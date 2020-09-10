
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
public class _check 
{
    public static void main(String args[])
    {
          // Stack for numbers: 'values' 
      String   expression = "-378-3-245-7+514+(9-2)";
         char[] tokens = expression.toCharArray(); 
        Stack<Integer> values = new Stack<Integer>(); 
  
        // Stack for Operators: 'ops' 
        Stack<Character> ops = new Stack<Character>(); 
  
                for (int i = 0; i < tokens.length; i++) 
               { 
                  
                                // Current token is a number, push it to stack for numbers 
                                if (( tokens[i]=='-')||tokens[i] >= '0' && tokens[i] <= '9') 
                                { 
                                    StringBuffer sbuf = new StringBuffer(); //"10*(2+12)+(6+1)+10"
                                    // There may be more than one digits in number 
                                    if(tokens[i]=='-'&&i==0)
                                        sbuf.append(tokens[i++]);
                                   // System.out.println("The value of i:"+i);
                                    while (i < tokens.length &&  (tokens[i] >= '0' && tokens[i] <= '9'))  
                               
 
                                    { 
                                        
                                        sbuf.append(tokens[i++]);
                                        
                                    }
                                    System.out.print(sbuf+" ");
                                   values.push(Integer.parseInt(sbuf.toString())); 
                                } 
            }
                                        System.out.println("The stack size is:"+values.size());
                                        System.out.println("The stack is:"+values);
    }
}
                            // Current token is a number, push it to stack for numbers 
//                                if ((i==0 && tokens[0]=='-')||tokens[i] >= '0' && tokens[i] <= '9') 
//                                { 
//                                    StringBuffer sbuf = new StringBuffer(); //"10*(2+12)+(6+1)+10"
//                                    // There may be more than one digits in number 
//                                    if(tokens[0]=='-'&&i==0) sbuf.append(tokens[0]);
//                                    while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')  
//                                        sbuf.append(tokens[i++]);
//                                    values.push(Integer.parseInt(sbuf.toString())); 
//
//                                } 