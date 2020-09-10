
package java_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Benitto Raj
 */
public class valid_ip_checker 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
         String num="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
           Pattern p = Pattern.compile(num);
        String pattern = num+"."+num+"."+num+"."+num;
        
          
                 
          if (s.matches(pattern)) System.out.println("Valid Ip address ");
          
          else System.out.println("Invalid Ip address Please enter correct Ip address");
    }
}
