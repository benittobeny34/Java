
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
public class ServerStudy 
{
    public static void main(String args[]) throws Exception
    {
        try{
            ServerSocket ss = new ServerSocket(3123);
            System.out.println("Waiting for conection :");
            Socket s   = ss.accept();
            System.out.println("Connected");
            Date d = new Date();
            ObjectOutputStream ps = new ObjectOutputStream(s.getOutputStream());
            ps.writeObject(d);
            ObjectInputStream ois  = new ObjectInputStream(s.getInputStream());
            String inet = (String)ois.readObject();
            System.out.println("The server is connected to the System IP :"+inet);
        }catch(Exception e){
            System.out.println("The error is:"+e);
            
        }
    }
}
