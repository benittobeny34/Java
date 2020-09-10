/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Own_programs;

import java.util.Scanner;

public class pattern_04 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k;
        for(i=n;i>=1;i--)
        {
            k=i;
            for(j=1;j<=i;j++,k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(i=2;i<=n;i++)
        {
            k=i;
            for(j=1;j<=i;j++,k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
