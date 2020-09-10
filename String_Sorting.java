/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */import java.util.*;
public class String_Sorting 
{
 public static void main(String args[]){   
    Scanner input = new Scanner(System.in);
     String s = input.nextLine(); 
     char []a=s.toCharArray();
    for(int i=0;i<s.length();i++)
    { //zyxnmb
        for(int j=0;j<s.length()-1;j++)
        {
       if((int)a[j]>(int)a[j+1]) {
           char temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
           // System.out.print(a[i]);
       }
       }
    }
     System.out.println();
    
    for(int i=0;i<a.length;i++)
         System.out.print(a[i]);
 }
}
