
package CN_Lab_programs;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Decryption 
{
    public static void main(String args[])
    {
        try{
            System.out.println("=======Decryption=============");
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("Waiting for connection:");
            Socket s = ss.accept();
            ObjectInputStream in  = new ObjectInputStream(s.getInputStream());
            int ascii = (int)in.readObject();
            char ch = (char)ascii;
            System.out.println("The received message is:"+ascii);
            System.out.println("The Decrypted message is:"+ch);
            ss.close();
            in.close();
            s.close();
        }catch(Exception e){
            System.out.println("error:"+e);
        }
    }
}
