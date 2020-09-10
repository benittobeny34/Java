import java.util.Scanner;
public class faq 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the value of a and b :");
        
        int a=s.nextInt();
        int b=s.nextInt();

       int mul=a*(-b);
        System.out.println("The multiplication of a and b  is:"+a*(-b));
    }
}
