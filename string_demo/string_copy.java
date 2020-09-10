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
public class string_copy {
    public static void main(String arr[])
    {
        Scanner input=new Scanner(System.in);
        String s;
        String y;
        System.out.println("Enter the two strings;");
        s=input.nextLine();
        y=input.nextLine();
       y=y+s;
        System.out.println("the string s is:"+s);
        System.out.println("The string y is:"+y);
    }
    
}
