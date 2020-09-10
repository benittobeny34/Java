
package CN_Lab_programs;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Exp_2_server 
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket s;
        DataInputStream dis;
        PrintStream p;
        try
        {
            ss = new ServerSocket(8889);
            System.out.println("Connection is successfully established:");
            s =ss.accept();
            Date d = new Date();
            p = new PrintStream(s.getOutputStream());
            p.println(d);
             dis = new DataInputStream(s.getInputStream());
            String ip = dis.readLine();
           
           
            
            System.out.println("The ip address of this system is:"+ip);
            s.close();
            ss.close();
            p.close();
            dis.close();
            
        }
        catch(Exception e)
        {
            
        }
    }
}
