
package Abstract_demo;


public class Abstract_Class
{
    public static void main(String args[])
    {
        Workplace obj = new Workplace();
       
         obj.laptop();
         obj.mobile();
    }
}

abstract class College
{
   abstract void mobile();
   void laptop()
   {
       System.out.println("In our colege laptop should be allowed");
   }
}

class Workplace extends College
{ 
    @Override
    void mobile()
    {
        System.out.println("In our Company mobile should be allowed");
    }
}