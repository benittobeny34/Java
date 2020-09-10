
package CN_Lab_programs;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CSMA_CD_Receiver 
{
    public static void main(String args[]) throws Exception
    {
        try{
            
             System.out.println("=============server============");
              
                    ServerSocket ss = new ServerSocket(1569);
           
            
            System.out.println("Waiting for connection");
            Socket con = ss.accept();
            System.out.println("Connected");
            ObjectInputStream in = new ObjectInputStream(con.getInputStream());
            System.out.println((String)in.readObject());
            in.close();
            ss.close();
            
            
        }catch(Exception e){System.out.println(e);}
    }
}
