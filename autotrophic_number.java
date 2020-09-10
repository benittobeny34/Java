
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
public class autotrophic_number 
{
    public static void main(String arr[])
    {
       int n;
       Scanner input = new Scanner(System.in);
       n=input.nextInt();
       int ans=n*n;
        System.out.println("The  answer is:"+ans);
       int t=10,remainder;
       int num=n;
       boolean equal=false;
       while(n!=0)
       {
        remainder=ans%t;
        if(remainder==num)  
        {
            equal=true;
            break;
        }
        n=n/10;
        t=t*10;   
       }

       if(equal == true) System.out.println(num+"is a autotrophic number:");
       else  System.out.println(num+"is  not a autotrophic number:");
       
    }
}
