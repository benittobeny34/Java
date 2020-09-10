
package Exception_demos;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Try_catch_demo 
{
    public static void main(String args[]) 
    {
      while(true)
      {
          try{
              int i;
              Scanner input = new Scanner(System.in);
              i=input.nextInt();
              int k=44/i;
              System.out.println("The value of k is:"+k);
              break;
              
          }
          catch(ArithmeticException ae)
          {
              System.out.println(ae);  
          }
          catch(InputMismatchException ie)
          {
              System.out.println(ie);
          }
      }
    }
}
