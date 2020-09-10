
package java_50_programing;

import java.util.Scanner;


public class prime_number_logic 
{
    public static void main(String arr[])
    {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int count = 0;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1) System.out.println("The number "+n+" is a prime number:");
        else System.out.println("The number "+n+"is  not a prime number");
        
    }
}
