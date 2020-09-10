
import java.util.Scanner;


public class float_sum
{
    public static void main(String arr[])
    {
        float f1,f2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the float values:");
        f1 = input.nextFloat();
        f2 = input.nextFloat();
        float sum=fun(f1,f2);
        System.out.println("The sum of two float values:"+sum);
        
    }
    private static float fun(float a,float b)
    {
        float sum= a+b;
        return sum;
    }
       
}
