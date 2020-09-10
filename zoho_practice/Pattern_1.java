/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoho_practice;

import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
public class Pattern_1 
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        
        while(s.hasNext()){
            char ch = s.next().charAt(0);
            int val = s.nextInt();
            for(int i=0;i<val;i++) System.out.print(ch);
        }
                
        
        
    }
}
