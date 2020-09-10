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
public class super_keyword1 
{
    public static void main(String arr[])
    {
        madha obj=new madha();
       // obj.show();
       obj.abc();
    }
}
class jesus
{
    int i=5;
    void abc()
    {
        System.out.println("jesus abc:");
    }
}
class madha extends jesus
{
    int i=4;
    void show()
    {             //super.i indicates the value of i in the superclass
        System.out.println("The value of i is:"+super.i);
    }
    void abc()
    {
        super.abc();
        System.out.println("madha abc:");
    }
}