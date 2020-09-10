/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
import java.util.Scanner;
public class Swapnumbers {
    public static void main(String arr[])
    {
            int a,b,temp;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the value of a:");
            a=input.nextInt();
            System.out.println("Etner the value of b:");
            b=input.nextInt();
            temp=a;
            a=b;
        b=temp;
        System.out.println("The value of a is : "+a+" The value of b is "+b);
    }
    
}


