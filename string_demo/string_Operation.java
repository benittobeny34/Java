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
public class string_Operation
{
    public static void main(String arr[])
    {
        String s1,s2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two strings:");
        s1=s.nextLine();
        s2=s.nextLine();
        //step 1
        String s3=s1 .concat(s2);//s1 + s2;
        System.out.println("The string concatination is:"+s3);
        //step 2
        int l1=s1.length();
        int l2=s2.length();
        System.out.println("The length of the sting s1 is:"+l1);
        System.out.println("The length of the string s2 is:"+l2);
        //step 3
        s1=s1.toUpperCase();
        System.out.println("The uppper case string  of string s1 is:"+s1);
        s2=s2.toUpperCase();
        System.out.println("The upper case string of string s2 is:"+s2);
        //step 4
        s1=s1.toLowerCase();
        System.out.println("The Lower case string of string s1 is:"+s1);
        s2=s2.toLowerCase();
        System.out.println("The Lower case strig of string s2 is :"+s2);
    }
    
    
    
}
