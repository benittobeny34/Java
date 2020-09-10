
package java_rejex_demos;

import java.util.regex.Pattern;


public class split_token 
{
    public static void main(String args[])
    {
      //Pattern p = Pattern.compile("\\s");//it prints accordinng to space charaters
        //Patternn p  = Pattern.compile("a") //it prints except a characters
        Pattern p = Pattern.compile("o");
        String []s = p.split("The benitto arockia raj");
        for(String i: s)
        {
          System.out.println(i);//it prints except o charcters 
        }
    }
}
