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
public class fibonacci_series   //fibonacci series is the next number is the  sum of previous two numbers
{
    public static void main(String arr[])
    {
        int n,x=0,y=1,temp;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for( int i=0;i<n;i++)
        {
            System.out.print(x+" "+y+" ");
           temp=y;
           x=x+y;
           y=temp+x;
        }
        
    }
}
