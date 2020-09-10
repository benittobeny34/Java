/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

public class abstract_class_demo 
{
    public static void main(String arr[])
    {
       dog d=new dog();
       d.sound();
       new cat().sound(); //anonimous object 
       new cow().sound();//anonimous object
       d.legs();
    }    
}
abstract class animal
{
     abstract public void sound();
     public void legs()
     {
         System.out.println("All the animals have four legs:");
     }
}
class dog extends animal
{
    public void sound()
    {
        System.out.println("The dog sound is wow:");
    }
}
class cow extends animal
{
   public void sound()
   {
       System.out.println("The cow sound is !may maj mah mah!");
   }
}
class cat extends animal
{
    public void sound()
    {
        System.out.println("The cat sound is meah meah meah");
    }
}
