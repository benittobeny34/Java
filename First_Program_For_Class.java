/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.Scanner;
class beni
{
    public
    int a,b;
    Scanner input=new Scanner(System.in);
   void get(){
    System.out.println("Enter the a and b value:");
    a=input.nextInt();
    b=input.nextInt();
    System.out.println("The a value is: "+a+" "+"the b value is: "+b);}
}
public class First_Program_For_Class {
    public static void main(String arr[])
    {
        beni b=new beni();
        b.get();
    }
    
}
