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
public class reverse_string_array
{
    public static void main(String arr[])
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of names you entered in this String array;");
        int n = input.nextInt();
        String []a = new String[n];
        for(int i = 0; i <n ;i++)
        {
           
            a[i]=input.nextLine();
          
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]); 
        }
    }
}
