
package java_rejex_demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class quantifiers_example 
{
    public static void main(String args[])
    {  
        // Pattern p = Pattern.compile("a"); to check match is present or not 
        // Pattern p = Pattern.compile("a+");
        // Pattern p = Pattern.compile("a*");//including 0 also
           Pattern p = Pattern.compile("a?");
        Matcher m = p.matcher("0abaabbaa0aabaaaab");
        while(m.find())
        {
            System.out.println("The index start is:"+m.start()+" the group is;"+m.group());
        }
    }
}
