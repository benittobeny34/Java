
package java_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Benitto Raj
 */
public class Regex_creation2 
{
   public static void main(String ars[]){
    Scanner input = new Scanner(System.in);
      String s= input.nextLine();
//       Pattern p = Pattern.compile("[^a-z]"); // it reject the smaller alphabhetic letters
//       Matcher m = p.matcher(s);
//       while(m.find())
//           System.out.println(m.start()+" "+m.group()+" "+m.end());
//       s= input.nextLine();
//        p = Pattern.compile("[^a-zA-Z]"); // it reject the alphabhetic letters
//       m = p.matcher(s);
//       while(m.find())
//           System.out.println(m.start()+" "+m.group()+" "+m.end());
 Pattern p = Pattern.compile("a?");
 Matcher m = p.matcher(s);
 while(m.find()){
     System.out.println(m.group());
 }
 
       
   } 
}
