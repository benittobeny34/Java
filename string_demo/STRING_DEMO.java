package string_demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
import java.util.Scanner;
public class STRING_DEMO {
    public static void main(String arr[])
    {
        String str1;
        String  str2;
        char a[]= {'j','a','v','a'};
       Scanner input=new Scanner(System.in);
        System.out.println("Enter the string one:");
        str1=input.nextLine();
        System.out.println("Enter the string two:");
        str2=input.nextLine();
        String str3=new String(a);
        System.out.println("The string one is:"+str1);
        System.out.println("The strinng two is:"+str2);
        System.out.println("The string three is:"+str3);
        
        
        
    }
    
}

