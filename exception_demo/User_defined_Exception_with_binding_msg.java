package exception_demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */ 
import java.util.*;
public class User_defined_Exception_with_binding_msg extends Exception{
   //static String msg;
   User_defined_Exception_with_binding_msg (String msg){
     //  this.msg=msg;
     super(msg);
   }
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        try
        {
            System.out.println("Enter the employee id:");
           String EmpId=s.nextLine();
           if(EmpId.length()!=4)
           {
            throw new  User_defined_Exception_with_binding_msg("Invalid employee id"); 
           }
            System.out.println("Enter the basic salary:");
            int BSal=s.nextInt();
            if(BSal<5000)
            {
                throw new User_defined_Exception_with_binding_msg( "invalid basic salary");
            }
            System.out.println("EmpId="+EmpId+" "+" employee salary="+BSal);
            
        }
        
       catch(User_defined_Exception_with_binding_msg obj)
       {
           System.out.println(obj.getMessage());
           //System.out.println(msg);
          // System.out.println(obj);
       }
    }
    
    
}
