
package MultiThreading;

public class Thread1_example 
{
    public static void main(String args[]) throws Exception
    {
        HI obj1 = new HI();
        HELLO obj2 = new HELLO();   
        obj1.start();
        Thread.sleep(10);
        obj2.start();
    }
}
class HI extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
        try
        { Thread.sleep(500);} 
        catch(Exception e){}
        }
    }
}

class HELLO extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++) 
        {
            System.out.println("Hello");
            try{ Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}
