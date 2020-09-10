
package Calc_practice;

import java.util.Scanner;


public class first 
{
    public  first(String s){
        calculate(s);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression:");
        String ex=input.nextLine();
        first obj = new first(ex);
        
    }
    
   public void calculate(String ex)
    {
        System.out.println("The string expression is:"+ex);
        int i=0;
        int len=ex.length();
        char arr[]=ex.toCharArray();
        //arr=ex.toCharArray();
        System.out.println("The array is:"+arr[2]);
        while(i<arr.length)
        {
            char ch=arr[i];
            if (ch=='*'|| ch=='/'){
                
                
                char fir=arr[i-1];
                System.out.println("the first:"+fir);
                char sec=arr[i+1];
               double result= evaluate(ch,fir,sec);
                System.out.println("The answer final answer is:"+result);
               // precedence=1;
            }
            
            else if(ch=='+'||ch=='-')
            {
                char fir=arr[i-1];
                char sec=arr[i+1];
               double result= evaluate(ch,fir,sec); //precedence=0;
               System.out.println("The answer final answer is:"+result);
            }
            i++;
        }
    }
   private int evaluate(char ch,char fir,char sec)
   {
       if(ch=='*') return (fir-48)*(sec-48);// char 2 corresponding ascii value is 50  so 50-48=2
       else if(ch=='/') return (fir-48)/(sec-48);
       
       if(ch=='+') return (fir-48)+(sec-48);
       else return (fir-48)-(sec-48);
   }
}
