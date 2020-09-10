/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_50_programing;

import java.util.Scanner;

/**
 *
 * @author PAULRAJ
 */
public class Armstrong_number_logic 
{
    public static void main(String arr[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int remainder;
        int original_number=num,ans=0;
        num=original_number;
        while(num!=0)
        {
            remainder=num%10;
            ans=ans+remainder*remainder*remainder;
            num=num/10;
           
        }
        if(ans==original_number)
            System.out.println("The given number "+original_number+" is armstrong number:");
        else
            System.out.println("The given number "+original_number+" is not armstrong number:");
    }
}
