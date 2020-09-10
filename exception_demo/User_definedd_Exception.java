//package exception_demo;

import java.util.*;
public class User_definedd_Exception extends Exception {
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
        try{
        
        System.out.println("Enter the RollNo:");
        String rollno=s.nextLine();
       
        if(rollno.length()!=7)//exception checked
        {
            throw new User_definedd_Exception();
        }
            System.out.println("The rollno is;"+rollno);
            break;
        }
        catch(User_definedd_Exception obj)
        {
            System.out.println("Enter the valid roll no");   
        }
        }
    }
}
