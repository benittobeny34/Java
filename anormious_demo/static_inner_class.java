/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anormious_demo;

/**
 *
 * @author Benitto Raj
 */


public class static_inner_class 
{
    public static void main(String arr[])
    {
     Z.i=5;  
        System.out.println("The value of i is:"+Z.i);
        Z obj = new Z();
        obj.i=6;
        System.out.println("we can use object also to change value:"+obj.i);
        
     Z.Y y; //Z is outer class .to create obj of static inner class only use outer class naem
        y = new Z.Y();
    }                 //don't required obj of outer class
}
class Z
{
   static int i;
   static class Y
   {
        int j;
    }
}

