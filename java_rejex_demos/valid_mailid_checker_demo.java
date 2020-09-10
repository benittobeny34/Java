
package java_rejex_demos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class valid_mailid_checker_demo 
{
    public static void main(String args[])
    {  //To CHECK THE GIVEN GMAIL ID IS IN THE PROPER PATTERN OR NOT
        System.out.println("Enter the mail id you check:");
        Scanner input = new Scanner(System.in);
        String mail = input.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@gmail[.]com");
        Matcher m = pattern.matcher(mail);
        if(m.find() && m.group().equals(mail))
        {
            System.out.println("It is a valid gmail id:");
        }
        else 
        {
            System.out.println("It is not a valid gmail . please check your mail id:");
        }
                
    }
}
