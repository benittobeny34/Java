/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hacker_rank;

import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
public class Find_Digits_Problem_Solvin 
{
    public static void main(String args[])
    {
        int n;
        Scanner input  = new Scanner(System.in);
        n = input.nextInt();
      
        int instant = n;
        int remainder,count=0;
        while(instant>0)
        {
           remainder = instant%10;
           if(n%remainder==0) count++;
           instant = instant%10;
            System.out.println("hi");
        }
        System.out.println("The value of count is:"+count);
    }
}
