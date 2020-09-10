
package Exception_demos;

import java.util.Scanner;


public class User_defined_Exception extends Exception
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            try{
                System.out.println("Enter the roll no:");
                String rollno=s.nextLine();
                if(rollno.length()!=7)
                {
                    throw new User_defined_Exception();
                }
                System.out.println("The rollno is:"+rollno);
                break;
                
            }catch(User_defined_Exception obj)
            {
                System.out.println("Enter the valid roll no:");
            }
        }
    }
}
