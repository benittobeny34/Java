
package CN_lab_problems;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Talk_client
{
    public static void main(String args[])
    {
        try
        {
            
            Socket con = new Socket("LocalHost",8200);
            System.out.println("Connected with server iP "+con.getInetAddress().getHostAddress());
            
            ObjectOutputStream oos = new ObjectOutputStream(con.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(con.getInputStream());
            
            Scanner input = new Scanner(System.in);
            
            while(true)
            {
                System.out.println("Client;");
                String message = input.next();
                oos.writeObject(message);
                
                message = (String)ois.readObject();
                System.out.println(message);
                
                
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println("The exception is:"+e);
        }
    }
}
