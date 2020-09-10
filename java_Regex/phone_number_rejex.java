
package java_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Benitto Raj
 */
public class phone_number_rejex 
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the phone number");
        String mob_no=input.nextLine();
        Pattern p = Pattern.compile("(0|[9][1])?[6789][0-9]{9}");
        Matcher m = p.matcher(mob_no);
        if (m.matches()) System.out.println("Valid phone number");
        else System.out.println("InValid phone number");
    }
}
