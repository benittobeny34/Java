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
public class factorial {
    public static void main(String arr[])
    {
        int n,i;
        long fact=1;
        System.out.println("Enter the number to find facorial:");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=1;i<n;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of "+n+"is: "+fact);
    }
    
}
