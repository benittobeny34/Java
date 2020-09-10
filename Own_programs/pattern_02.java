/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Own_programs;

import java.util.Scanner;

public class pattern_02 
{
    public static void main(String ...arsg){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int i=0,j;
        int a=1;
        for(;i<n;i++){
            for(j=0;j<=i;j++){
                if(j==i) System.out.println(a);
                else System.out.print(0);
            }
            a++;
        }
    }
}
