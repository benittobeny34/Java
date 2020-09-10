
package Exception_demos;

import java.util.Scanner;


public class User_defined_exception_with_binding_msg extends Exception  //this extends Exception keyword is important while working with user defined Exception
{

    public User_defined_exception_with_binding_msg(String msg) {
        super(msg);
    }
    public static void main(String args[]) throws Exception
    {
        Scanner s= new Scanner(System.in);
        try{
            System.out.println("Enter the employee id:");
            String EmpId=s.nextLine();
            if(EmpId.length()!=4)
            {
                throw new User_defined_exception_with_binding_msg("Invalid employee Id");
            }
            System.out.println("Enter the basic salary");
            int BSal=s.nextInt();
            if(BSal<5000)
            {
                throw new User_defined_exception_with_binding_msg("Invalid salary");
                
            }
            System.out.println("The "+EmpId+" "+" employeee salary"+BSal);
            
        }catch(User_defined_exception_with_binding_msg  obj)
        {
            System.out.println(obj.getMessage()); 
            System.out.println(obj);
            
        }
        catch(Exception e)// this is for input mismatch exception when you enter the string 
        {
            System.out.println(e);
        }
    }
    
}
