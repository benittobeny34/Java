
package CN_Lab_programs;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Echo_Server 
{
    public static void main(String []args)
    {
        
        ObjectInputStream ois;
        ObjectOutputStream oos;
        
        try{
            ServerSocket ss = new ServerSocket(9550);
            System.out.println("Waiting for connection:");
           Socket s =ss.accept();
            System.out.println("connected");
            ois = new ObjectInputStream(s.getInputStream());
            oos= new ObjectOutputStream(s.getOutputStream());
            String data =(String)ois.readObject();
            System.out.println("The received data is:"+data);
            oos.writeObject(data);
            System.out.println("The sending data is:"+data);
           }
        catch(Exception e){}
      
           
    }
}
