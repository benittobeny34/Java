package string_demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.*;
public class string_sorting_in_java {
    public static void main(String arr[]){
        Scanner input=new Scanner(System.in);
        String a[]=new String[10];
        
        System.out.println("Enter the four string is:");
        for(int i=0;i<4;i++){
            a[i]=input.nextLine();
            }
        for(int i=0;i<4;i++)
        {
            System.out.println("The string "+i+" is:"+a[i]);
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
               
               if(a[j].compareTo(a[j+1])>1)
               {
                   String temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               } 
               
            }
        }
            System.out.println("The sorted string by length is given below:");
            for( int i=0;i<4;i++)
                System.out.println("String "+i+"is "+a[i]);
            
        
    }
    
}
