package string_demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
 import java.util.Scanner;
public class newlinestring {
    public static void main(String arr[])
    {
        int number;
        String name;
        Scanner input=new Scanner (System.in);
        System.out.println("enter the integer:");
       number= input.nextInt();
        System.out.println("Enter the name:");
      input.nextLine();
      name=input.nextLine();
        System.out.println("You entered :"+number);
        System.out.println("You entered name is "+name);
        
    }
    
}
