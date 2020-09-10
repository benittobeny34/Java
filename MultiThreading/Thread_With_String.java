package MultiThreading;





public class Thread_With_String 
{
    public static void main(String args[])  throws Exception
    {
        String myName = "benitto";
        String friendName = "Infy";
        int mylen = myName.length();
        int frlen = friendName.length();
        System.out.println(mylen);
        System.out.println(frlen);
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run(){
                             for(int i=0;i<mylen;i++)
                              {
                                  System.out.print(myName.substring(i,i+1));
                                }
                          }
        });
           Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run(){
                             for(int i=0;i<frlen;i++)
                              {
                                  System.out.print(friendName.substring(i,i+1));
                                }
                          }
        });
        //t2.start();
        t1.start();
        
       t2.start();
    }
}