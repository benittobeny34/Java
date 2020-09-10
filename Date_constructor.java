
import java.net.InetAddress;
import java.util.Date;


public class Date_constructor 
{
    public static void main(String args[]) //throws Exception
    {
        Date d = new Date();
        System.out.println("The System date is:"+d);
        try{
        InetAddress  ip = InetAddress.getLocalHost();
        System.out.println("The IP address of this system is:"+ip);
        }
        catch(Exception e)
        {
            System.out.println("The exception is:"+e);
        }
        
        
    }
}
