/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.Scanner;
class out
{
    int a,b;
    public
    void get()
    {
    in i=new in();
    System.out.println("Enter the a and b value:");
    Scanner input=new Scanner(System.in);
    a=input.nextInt();
    b=input.nextInt();
            i.put();
    }
           class in
           {
             public
             void put()
             {
             System.out.println("The a value is: "+a+"The b value is:"+b);
             } 
           }
}
public class INNER_CLASS {
    public static void main(String arr[])
    {
        out o=new out();
        o.get();
        
    }
    
}
