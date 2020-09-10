
package java_rejex_demos;

import java.util.regex.Pattern;


public class important_example
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[.]"); //we can also use [.] this method.
       String a[] = p.split("www.benitto.com");
        for(String i:a)System.out.println(i);
    }
}
