
package CN_Lab_programs;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server2_network 
{
    public static void main(String args[]) throws Exception
    {
        try{
            ServerSocket ss = new ServerSocket(799);
            System.out.println("Waiting for connnection:");
            Socket s =ss.accept();
            
            System.out.println("Connected with System IP:"+s.getInetAddress().getHostAddress());
             ObjectInputStream in =new ObjectInputStream(s.getInputStream());
            String message =(String) in.readObject();
            System.out.println("The message received from client is:"+message);
            //close all connection
            in.close();
            ss.close();
            s.close();
        }catch(Exception e){System.out.println("error:"+e);}
    }
}
