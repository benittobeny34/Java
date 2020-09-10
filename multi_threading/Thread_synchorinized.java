
package multi_threading;


public class Thread_synchorinized 
{
    public static void main(String arr[]) throws Exception
    {
       Runnable obj1 = new sync();
       Thread t1,t2;
       Runnable obj2 = new sync();
       t1 = new Thread(obj1);
       t2= new Thread(obj2);
    
           t1.start();
           t1.sleep(1000);
           t2.start();
    }
}
class sync implements Runnable
{ 
    int count;
    public  void run()
    {
       count++;
        System.out.println(count);
    }
}
