
package Exception_demos;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo 
{
    public static void main(String args[])
	  {
		int i,j,k;
	  	try
	  	{
	 	   System.out.println("Enter the value of i and j:");
		   Scanner input = new Scanner(System.in);
		   i=input.nextInt();
		   j=input.nextInt();
		   k=i/j;
                   System.out.println("The value of k is:"+k);
		}

                catch(InputMismatchException ae)
	   	{
                  System.out.println(ae+">>>>>only integer are acceptable");
	 	}

		catch(ArithmeticException e)
	   	{
                  System.out.println(e+">>>>>>cannot divide by zero");
	 	}
		
	  }
}

