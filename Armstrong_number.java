
import java.util.Scanner;


public class Armstrong_number
{
    public static void main(String args[])
    {
        int n,i,sum=0,temp,r,r1,count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = input.nextInt();
        temp = n;
        while(n>0)
        {
           n= n/10;
           count++;          
        }n=temp;
        while(n>0)
        {
            r=n%10;
            r1=r;
            for( i=0;i<count-1;i++)
            {
                r=r1*r;
            }sum+=r;
            System.out.println("The sum is :"+sum);
            n=n/10;
        }
         n=temp;
         if(sum==n) System.out.println("The given number is armstrong number;");
         else System.out.println("The given number is not armstrong number");
    }
}
