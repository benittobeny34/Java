
package java_Regex;

/**
 *
 * @author Benitto Raj
 */
//import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.*;

public class trim_method 
{
    public static void main(String args[]){
        Pattern p = Pattern.compile("[,<>'\"]+");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
       // System.out.println("The entered string is:"+s);
        if (s.trim().equals(""))
                {
                    System.out.println("There is no content in the string:"); 
                                   }
        else 
        {
                 System.out.println("The message is:"+s);
                  String a[]=p.split(s);
                    for (String k:a){
                        System.out.print(k+" ");
                    }

        }
                    
    }
}
