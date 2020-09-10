
package MultiThreading_demo;


public class Runnable_interface  
{
    public static void main(String args[]) throws Exception
    {
        counter obj = new counter();
        Thread t1 = new Thread(new Runnable()
        {
            public void run(){
                obj.decrement();
            }
        });
        
        Thread t2  = new Thread(new Runnable()
        {
            public void run()
            {
                obj.decrement();
                
            }
        });
        t1.start();
        
        t2.start();
        
        
        
        
    }
}

class counter 
{
    void decrement()
    {
        for (int i=10;i>=1;i--)
        System.out.println(i);
    }
}
