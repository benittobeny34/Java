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
public class object_creation_in_inheritance 
{
    public static void main(String arr[])
    {
       // nandhu n=new nandhu();  //it calls only nandhu default constructor because it is super class
       // nandhu n=new nandhu(3); //it calls only nandhu parameterished constructor because it super class
       // kumar k=new kumar();//it calls both default constructor because it is subclass object
        kumar k=new kumar(3);//it calls kumar parameterished and nandhy default constructor
        nandhu n=new kumar(3); //      "  "     "    "        "       "     "     "    "   "
    }
}
class nandhu
{
   nandhu()
   {
       System.out.println("default constructor in nandhu class:");
   }
   nandhu(int a)
   {
       System.out.println("parameterished constructor in nandhu class;");
   }
}
class kumar  extends nandhu
{
    kumar()
    {  //  super();//by default it will come by the compiler  whether you mention or not
        System.out.println("default constructor from kumar class");
    }
    kumar(int a)
    {
        System.out.println("parameterished constructor from kumar class:");
    }
}