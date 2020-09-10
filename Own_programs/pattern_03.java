/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Own_programs;

import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
public class pattern_03 
{
    public static void main(String[] args) {
        int i=0,j;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print(1);
                else
                    System.out.print(" ");
                
            }System.out.println();
        }
    }
}
