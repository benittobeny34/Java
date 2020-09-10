
package java_rejex_demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class simple_pattern_matching 
{
    public static void main(String args[])
    {
        int count=0;
        Pattern p = Pattern.compile("ab");
        Matcher m  = p.matcher("abaaababbbab");
        while(m.find())
        {
            count++;
            System.out.println(m.start()+"   "+m.end()+"  "+m.group());
       //where m.start  returns starting index number and m.end()return ending plus one index group returns group of matching characters     
        }
        System.out.println("The number of occurances in this pattern matching is :"+count);
    }
}
