/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Photon_Preparation;

/**
 *
 * @author Benitto Raj
 */
public class String_Methods 
{
    public static void main(String[] args) {
        String str=new String("Hello World! I am benitto");
        System.out.println("The str Stirng lenght is:"+str.length());
        System.out.print("The Lower Case String:");
        System.out.println(str.toLowerCase());
        System.out.println("The UPper CAse string is:"+str.toUpperCase());
        System.out.println("Fetching one character from the String:"+str.charAt(3));
        System.out.println("Strig replace method:"+str.replace('o','M'));
        System.out.println(str);
        System.out.println(str+" Welcome");
    } 
}
