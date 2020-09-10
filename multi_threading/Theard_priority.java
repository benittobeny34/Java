

package multi_threading;

public class Theard_priority 
{
    public static void main(String arr[])
    {
     one obj1= new one();
     two obj2= new two();
     Thread t1,t2;
     t1=new Thread(obj1);//new thread for class one;
     t2=new Thread(obj2);//new thread or class two 
     t1.setPriority(1);//min priority == 1   priority integer must be 1 to 10 only not other integer not allowed
     t2.setPriority(10); //max priority ==10
     t1.start();
     t2.start();
     
     
    }
}
class one implements Runnable
{
    public void run()
    {
        System.out.println("class one executes :");
        for(int i=0 ;i<5;i++)
            System.out.println("In class one Thread:"+i);
        System.out.println("class one ENDS SUSSESSFULLY:");
    }
}
class two implements Runnable
{
    public void run()
    {
        System.out.println("class two executes:");
        for(int i=0;i<5;i++)
            System.out.println("In class two Thread:"+i);
        System.out.println("class two ENDS SUSSESSFULLY:");
    }
}
