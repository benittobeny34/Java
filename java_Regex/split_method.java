/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_Regex;

import java.util.regex.Pattern;

/**
 *
 * @author Benitto Raj
 */
public class split_method
{
   public static void main(String args[])
   {
       Pattern p =  Pattern.compile("[/*.]+");
       String a[] = p.split("https//WWw.hackerrank.com/brendonbeni42");
       for ( String s:a)
           System.out.println(s);
   }
}
