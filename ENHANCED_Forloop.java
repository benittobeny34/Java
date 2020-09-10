/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.Scanner;
public class ENHANCED_Forloop {
    public static void main(String arr[])
    {
        int  a[]=new int[5];
        Scanner input=new Scanner(System.in);
        for(int  i=0;i<=4;i++)
            a[i]=input.nextInt();
        for(int i:a)
            System.out.print(i+" ");
            
            
    }
    
}
