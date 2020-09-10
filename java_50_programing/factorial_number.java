
package java_50_programing;

import java.util.Scanner;


public class factorial_number 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer to find factorial :");
        int number = input. nextInt();
        long factorial=1;
        while(number!= 0)
        {
           // System.out.println(number);
            factorial=factorial*number;  
            System.out.println("Factorial is:"+factorial);
            number--;
        }
        System.out.println("The factorial of given number is:"+factorial);
    }
}
