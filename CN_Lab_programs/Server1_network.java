
package CN_Lab_programs;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server1_network 
{
    public static void main(String args[])
    {
        try{
            System.out.println("===========Server1================");
            ServerSocket ss = new ServerSocket(234);
            System.out.println("Waiting for connection:");
            Socket s = ss.accept();
            
            System.out.println("Connected with System IP:"+s.getInetAddress().getHostAddress());
            
            ObjectInputStream in =new ObjectInputStream(s.getInputStream());
            String message =(String) in.readObject();
            System.out.println("The message received from client is:"+message);
            //close all connection
            in.close();
            ss.close();
            s.close();
            
        }catch(Exception e){System.out.println("eroor:"+e);}
    }
}
