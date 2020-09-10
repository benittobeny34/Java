
package java_Regex;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Benitto Raj
 */
public class Regex_creation 
{
    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher(s);
        while(m.find()) System.out.println(m.group()+m.start()+m.end());
        
    }
}
