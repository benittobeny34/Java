/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.Scanner;
public class palindrome {
    public static void main(String arr[])
    {
        long number,remainder,reverse_Number=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        number=input.nextInt();
        long temp=number;
        while(number!=0)
        {
            remainder=number%10;
            reverse_Number=remainder+reverse_Number*10;
            number=number/10;
        }
        System.out.println("The reverse Number is "+reverse_Number);
        if(reverse_Number==temp) System.out.println("The number "+temp+" is a palindrome Number:");
        else System.out.println("The number "+temp+" is not a palindrome Number:");
    }
    
}
