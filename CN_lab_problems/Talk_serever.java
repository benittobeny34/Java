
package CN_lab_problems;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Talk_serever
{
    public static void main(String args[])
    {
      
        try
        {
            ServerSocket ss = new ServerSocket(8200);
            System.out.println("Waiting for connection .........");
            
            Socket s = ss.accept();
            System.out.println("Connected with the ip address;"+s.getInetAddress().getHostName());
            
              ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            
            while(true)
            {
                String message  = (String)ois.readObject();
                System.out.println(message);
                
                System.out.println("Server:");
                Scanner input =new Scanner(System.in);
                message = input.next();
                oos.writeObject(message);
            }
        }
        catch(Exception e)
        {
            System.out.println("The exception is :"+e);
        }
    }
}
