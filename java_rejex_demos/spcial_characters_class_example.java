
package java_rejex_demos;

import java.util.regex.Matcher;//[ab],[abc],[^abc],[a-zA-Z],[0-9],[^0-9],[^a-zA-Z0-9]
import java.util.regex.Pattern;


public class spcial_characters_class_example
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[^a-zA-Z]");
        Matcher m = p.matcher("a#%A35a3qM?5bz|E#b");
        while(m.find())
        {
            System.out.println("The starting index is:"+m.start()+" The group matchi is:"+m.group());
        }
    }
}
