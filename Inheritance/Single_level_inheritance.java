/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author PAULRAJ
 */
public class Single_level_inheritance {
    public static void main(String arr[])
    {
       sub_class s=new sub_class();
       s.set();
       s.show();
    }
}
class main
{
 int a=10;
 void set()
 {
     System.out.println("The value of a is:"+a+" from main class");
 }
}

class sub_class extends main
{
    void show()
    {
        System.out.println("the value of a is:"+a+" from sub_class");
    }
}