
package CN_Lab_programs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Exp_2_client 
{
    public static void main(String args[])
    {
        DataInputStream dis;
        PrintStream p;
        String date;
        try
        {
            Socket s = new Socket("localhost",8889);
         InetAddress d = InetAddress.getLocalHost();
          p= new PrintStream(s.getOutputStream());
         dis = new DataInputStream(s.getInputStream());
         date = dis.readLine();
         p.println(d);
            System.out.println("The System date is:"+date);
            
            
            p.close();
            s.close();
            dis.close();
                    
        }
        catch(Exception e)
        {
            System.out.println("The exception in the program is:"+e);
        }
    }  
}
