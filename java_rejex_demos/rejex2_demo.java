
package java_rejex_demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rejex2_demo 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("beni");
        Matcher m = p.matcher("benitto raj");
        System.out.println(m.find()+" "+m.start()+" "+m.end());
        
    }
}
