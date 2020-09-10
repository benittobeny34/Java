/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

class A
{
    protected
 int a=10;
 int tot;
 public
 void total()
 {
     tot=a;
     System.out.println("The value of a is:"+a);
     System.out.println("The total value is:"+tot);
 }
}
class sub1 extends A
{  
    protected
   int b=20;
    public
   void totalsub1()
   {
    tot=a+b;   
       System.out.println("The value of a is:"+a);
       System.out.println("The value of B is:"+b);
       System.out.println("The total value is :"+tot);
   }
}
class sub2 extends sub1
{
    private
    int c=30;
    void totalsub2()
    {
        tot=a+b+c;
        System.out.println("The value of a is;"+a);
        System.out.println("The value of b is:"+b);
        System.out.println("The value fo c is:"+c);
        System.out.println("The total value is :"+tot);
    }
}

public class Multilevel_inheritance
{
    public static void main(String arr[])
    {
        sub2 s=new sub2();
        s.total();
        s.totalsub1();
        s.totalsub2();
    }
}
