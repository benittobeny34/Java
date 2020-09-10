
package java_rejex_demos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class valid_mobile_number_checking 
{
    public static void main(String args[])
    {
        System.out.println("Enter the phone number:");
        String phone;
        Scanner input = new Scanner(System.in);
        phone = input.nextLine();//(0|[9][1])?[789][0-9]{9}
        Pattern pattern = Pattern.compile("(0/91)?[789][0-9]{9}");
        Matcher m= pattern.matcher(phone);
        if(m.find() && m.group().equals(phone))
        {
            System.out.println("It is a valid phone number:");
        }
        else
        {
            System.out.println("It is not a valid phone number:");  
        }
        
    }
}
