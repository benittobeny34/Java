
package anormious_demo;

/**
 *
 * @author Benitto Raj
 */
interface ben
{
     void show();
     void show(int x);
}
public class anormious_demo 
{
    public static void main(String args[])
    {
        ben b = new ben(){
            @Override
            public void show()
            {
                System.out.println("This is demo for anonymious demo");
            }
            @Override
            public void show(int x)
            {
                System.out.println("from detail method");
            }
        };
        b.show();
        b.show(5);
        //lambda expresssion only support functional interface
//       ben obj = () -> System.out.println("This is demo for anonymous demo:");
//       obj.show();
//       ben ob= (4) ->System.out.println("the value of x is:"+x);
//       ob.show();
    }
}
