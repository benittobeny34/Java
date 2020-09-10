
package MultiThreading_demo;


public class Extends_Thread 
{
    public static void main(String argsp[])
    {
        chair c = new chair();
        bench b = new bench();
        
        c.start();
        try
        {
            c.wait(10);
        }catch(Exception e){}
        b.start();
         try
        {
            b.wait(15);
        }catch(Exception e){}
    }
}

class chair  extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("The value is:"+i);
         try{
            Thread.sleep(10);}catch(Exception e){}
         }
        
        System.out.println("The chair class successfully executed");
    }
    
    
}

class bench extends Thread
{
      public void run()
    {
        for(int i=11;i<=20;i++)
        {
            System.out.println("The value is:"+i);
            try{
            Thread.sleep(10);}catch(Exception e){}
        }
        System.out.println("The bench class succefully executed");
        
    }
}