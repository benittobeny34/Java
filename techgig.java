/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */ import java.io.*;
import java.util.*;

public class techgig
{
 
    public static void main(String args[] ) throws Exception {

    	Scanner input = new Scanner(System.in);
    	String original = input.nextLine();
        System.out.println("The reverse stirng is:"+original.Reverse());
    	String complement = "";
    	for(int i=original.length()-1;i>=0;i--)
    	{
    	    char c = original.charAt(i);
    	    if(c == 'A')
    	    {
    	        complement+="T";
    	    }
    	    else if(c=='C')
    	    {
    	        complement+="G";
    	    }
    	    else if(c=='T')
    	    {
    	        complement+="A";
    	    }
    	    else if(c=='G')
    	    {
    	       complement+="C"; 
    	    }
    	}
    	System.out.println(complement);
   }
}
  
