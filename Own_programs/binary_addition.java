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
public class binary_addition 
{
    public static void main(String args[])
    {
     int carry=0;
     int rem1,rem2;
     int a[]=new int[20];
     int i=0;
     Scanner s=new Scanner(System.in);
     int n1=s.nextInt();
     int n2=s.nextInt();
     while(n1 > 0 || n2 >0 ){
         if(n1 !=0 ) rem1=n1 % 10;
         else  rem1=0;
         if(n2 != 0) rem2= n2 % 10; 
         else
             rem2=0;
         if(rem1==1 && rem2==1)
         {
            if (carry==1) a[i]=1;
            else a[i]=0;
           carry=1;        
         }
         else if(rem1==0 && rem2==0)
         {
             if(carry==1)
                 a[i]=1;
             else 
                 a[i]=0;
            carry=0;
         }
         else{
             if(carry==1)
             {
                 a[i]=0;
                 carry=1;
             }
             else{
                 a[i]=1;
                 carry=0;
             }
         }
         System.out.println(i);
         n1=n1/10;
         n2=n2/10;       
         i++; 
     }
     if (carry==1) a[i]=1;
   for(int j=i;j>=0;j--)
             System.out.printf("%d",a[j]);   
        
    }
}
