
package CN_lab_problems;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class server2_address 
{
    public static void main(String args[])
    {  
        ServerSocket ss;
        Socket s;
        PrintStream ps;
        DataInputStream dis;
        String inet;
        try
        {
            ss = new ServerSocket(8020);
            while(true)
            {
                s= ss.accept();
                ps = new PrintStream(s.getOutputStream());
                Date d = new Date();
                ps.println(d);
                dis=new DataInputStream(s.getInputStream());
                inet = dis.readLine();
                System.out.println("The client System Adddress is:"+inet);
                ps.close();
                
            }
        }
        catch(Exception e)
        {
            System.out.println("The exception is:"+e);
        }
    }
}
