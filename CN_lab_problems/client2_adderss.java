
package CN_lab_problems;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class client2_adderss
{
    public static void main(String args[]) throws Exception
    {
        Socket soc;
        DataInputStream dis;
        String sdate;
        PrintStream ps;
        try
        {
          InetAddress ia = InetAddress.getLocalHost();
            System.out.println("The Local Host of this system is:"+ia);
          soc  = new Socket(ia,8020);
          dis = new DataInputStream(soc.getInputStream());
          sdate = dis.readLine();
            System.out.println("The system date in the sever is:"+sdate);
            ps = new PrintStream(soc.getOutputStream());
            ps.println(ia);
        }
        catch(Exception e)
        {
            System.out.println("The exceptin name is;"+e);
        }
    }
}
