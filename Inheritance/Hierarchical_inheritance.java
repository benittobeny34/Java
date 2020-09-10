/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
class superclass
{
    //by default it is public mode if we don't mention the access specifier
    int a=10,b=20;
}
class B extends superclass
{
    void sum()
    {
        int sum=a+b;
        System.out.println("The sum of a and b is :"+sum);
    }
}
class C extends superclass                             //by default public if we don't mention access specifier
{
    void multiply()
    {
        int mul=a*b;
        System.out.println("The multiplicatin of a and b is :"+mul);
    }
    
}
public class Hierarchical_inheritance
{
    public static void main(String arr[])
    {
      B b=new B();
      C c=new C();
      b.sum();
      c.multiply();
    }
}
