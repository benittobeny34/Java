
package anormious_demo;

/**
 *
 * @author Benitto Raj
 */
@FunctionalInterface
interface google
{
    public void FrontendApp();
    
}
@FunctionalInterface //it allows exactly only one method to declare in the interface
interface yahoo 
{
    public void BackendApp();
}
public class lambda_Expression 
{
    public static void main(String[] args) {
        google g = ()-> System.out.println("Front end application is used by end user:");
        g.FrontendApp();//lambda expression is used for only for functional interfacce
        
        System.out.println("The hash code value  for google is:"+g.hashCode());
        yahoo y = () -> System.out.println("Back end appication is maintain by the company:");
        y.BackendApp();
        System.out.println("The hashcode for yahoo is:"+y.hashCode());
    }
   
}
