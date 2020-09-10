
package anormious_demo;

/**
 *
 * @author Benitto Raj
 */
@FunctionalInterface // This is annotation which is used to decalre a method with the interface . functional interface
interface Yahoo      //allows only one abstract method
{
    public void show();
    
}
public class functional_interface 
{
    public static void main(String[] args) 
    {
        Yahoo y = () -> System.out.println("This is the demo for functional interface:");
        y.show();
    }
}
