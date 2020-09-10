
package anormious_demo;

/**
 *
 * @author Benitto Raj
 */

interface beni
{
   default public void detail()
   {
        System.out.println("This is define a method inside the interface");
    }
}
class mani implements beni
{
    public void show()
    {
        System.out.println("this is demo for interface with define a method in it:");
    }
}
public class define_method_in_interface 
{
    public static void main(String args[])
    {
     mani m = new mani();
     m.detail();
     m.show();
    }
}
