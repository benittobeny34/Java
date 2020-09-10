import java.util.Scanner;
import java.math.*;
public class Scanner_class_methods 
{
    public static void main(String args[]) throws Exception
     {
        Scanner input  = new Scanner(System.in);
         System.out.println("Enter the integer value:");
        int n=input.nextInt();
         System.out.println("Enter double value:");
        double d = input.nextDouble();
         System.out.println("Enter the float value:");
         float f=input.nextFloat();
         
        BigInteger b = input.nextBigInteger();
        
    }
}
