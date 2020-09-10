
package multi_threading;

public class using_interface_threading
{
    public static void main(String arr[])
    {
      Runnable obj1 = new Am();
       Runnable obj2 = new Was();
       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);
       t1.start();
       t2.start();
       
    }
}
class Am implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("HI");
            try{Thread.sleep(1000);}catch(Exception e){};
        }
    }
}

class Was implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++){
        System.out.println("Hello");
        try{Thread.sleep(1000);}catch(Exception e){};}
    }
}