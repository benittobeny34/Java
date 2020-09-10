
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
public class clientStudy 
{
    public static void main(String argsp[]) throws Exception
    {
        try{
            System.out.println("Request Send:");
       Socket s = new Socket("localhost",3123);
      // Scanner input  = new Scanner(System.in);
             ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
              ObjectOutputStream ps = new ObjectOutputStream(s.getOutputStream());
             String date  =(String)ois.readObject();
            InetAddress d = InetAddress.getLocalHost();
       
            System.out.println("The System date is:"+date);
            ps.writeObject(d);
       
       
        }
        catch(Exception e){
            System.out.println("The error is:"+e);
        }
        
        
       
    }
}
