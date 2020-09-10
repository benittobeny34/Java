
package java_50_programing;

import java.util.Scanner;

public class reverse_number
{
    public static void main(String arg[])
    {
        long number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        number = input.nextLong();
        long remainder;
        while(number!=0)
        {
            remainder = number%10;
            System.out.print(remainder);
            number = number/10;
        }
    }
}
