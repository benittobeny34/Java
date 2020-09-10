
package CN_Lab_programs;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class Encryption 
{
    public static void main(String args[])
    {
        try{
            System.out.println("=========Encryption===========");
            Socket con = new Socket("localhost",8888);
            ObjectOutputStream out = new ObjectOutputStream(con.getOutputStream());
            
            char ch ='a';
            int ascii = (int)ch;
            System.out.println("Message>"+ch);
            System.out.println("Generated ascii value is:"+ascii);
            out.writeObject(ascii);
            out.close();
            con.close();
        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
}
