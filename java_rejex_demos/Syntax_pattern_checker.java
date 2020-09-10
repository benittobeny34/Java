/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_rejex_demos;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author PAULRAJ
 */
public class Syntax_pattern_checker 
{
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            try
            {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
            testCases--;
          	//Write your code
		}
	}
}
