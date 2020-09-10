/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.Scanner;
public class occuance_Of_Number {
    public static void main(String arr[])
    {
        long number,Occurance_Number,remainder,count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        number=input.nextInt();
        System.out.println("Enter the digit to counting:");
        Occurance_Number=input.nextInt();
        while(number!=0)
        {
            remainder=number%10;
            if(remainder==Occurance_Number) count++;
            number=number/10;
        }
        System.out.println("The  digit "+Occurance_Number+" is occure "+count+" times:");
    }
    
}
