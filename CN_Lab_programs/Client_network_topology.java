
package CN_Lab_programs;

import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client_network_topology 
{
   public static void main(String args[])
   {
       try{
           System.out.println("======client============");
           //Server1 connection
           Socket con1 = new Socket("localhost",234);
           System.out.println("Connected with  server1 IP:"+con1.getInetAddress().getHostAddress());
            ObjectOutputStream out1 = new ObjectOutputStream(con1.getOutputStream());
            
            String message = "Network Lab";
            out1.writeObject(message);
            System.out.println("Message send to server1 is>"+message);
            //Server 2 connection
            Socket con2 = new Socket("localhost",799);
            System.out.println("Connected with Server2 IP:"+con2.getInetAddress().getHostAddress());
            
            ObjectOutputStream out2 = new ObjectOutputStream(con2.getOutputStream());
            
            message = "CN Lab";
            out2.writeObject(message);
            System.out.println("Message sent to server2 is:"+message);
            
            //close all the connection
            out1.close();
            out2.close();
            con1.close();
            con2.close();
       }catch(Exception e){System.out.println("Error:"+e);}
   }
}
