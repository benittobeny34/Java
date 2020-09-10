
package multi_threading;


public class thread_class_example2
{
    public static void main(String arr[])
    {
        Athread A = new Athread();
        A.start();
        Bthread B = new Bthread();
        B.start();
        Cthread C = new Cthread();
        C.start();
        Dthread D = new Dthread();
        D.start();
    }
}
class Athread extends Thread 
{
    public void run()
    {
        System.out.println("class Athreead executes sussessfully:");
    }
}
class Bthread extends Thread
{
    public void run()
    {
        System.out.println("class Bthread executes sussessfully:");
    }
}
class Cthread extends Thread 
{
    public void run()
    {
        System.out.println("class Cthread executes sussessfully:");
    }
}
class Dthread extends Thread 
{
        public void run()
        {
            System.out.println("class Dthread exectues sussessfully:");
        }
}
