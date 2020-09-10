/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Own_programs;

import java.util.Scanner;


public class pattern_01 
{
    public static void main(String args[]){
        int i=0;
        int n,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        n = s.nextInt();
        int flag=1;
        for(;i<n;i++){
            for(j=0;j<=i;j++)
            {
                System.out.print(flag);
                flag = flag==0?1:0;
                
            }
            System.out.println();
        }
    }
}
