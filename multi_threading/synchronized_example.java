
package multi_threading;


public class synchronized_example
{
    public static void main(String arr[]) throws Exception
    {
   counter obj = new counter();
   Thread t1 = new Thread(new Runnable()
   {
      public void run()
      {
          for(int i=0;i<1000;i++)
          {
              obj.increment();
          }
      }
   });
   //t1.start();
   Thread t2 = new Thread(new Runnable()
   {
      public void run()
      {
          for(int i=0;i<1000;i++)
          obj.increment();
      }
   });
////   t1.setPriority(10);
////   t2.setPriority(3);
    t1.start();
   t2.start();
t1.join();
t2.join();
        System.out.println("The counter value is:"+obj.count);
    }
}

class counter
{
int count;
   public synchronized  void increment()
   {
    count++;
   }
}
