package exception_demo;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Try_Catch_EXCEPTION {
    public static void main(String arr[]) throws Exception
    {
        while(true)
                {
        try
        {
        int i;
        Scanner s=new Scanner(System.in);
        i=s.nextInt();
        int k=44/i;
        System.out.println("the value of  k is:"+k);
        break;
                }
        catch(ArithmeticException ae)
                {
                    System.out.println("Enter only non zero value");
                }
        catch(InputMismatchException ie)
        {
            System.out.println("enter only nonzero interger:");   
        }
                }
    }
    
}
