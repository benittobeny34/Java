
package CN_Lab_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class Echo_Client
{
    String data;
        ObjectInputStream dis;
      
        ObjectOutputStream dos;
         
        public void run(){
              //InetAddress inet;
        try{        
        //inet=InetAddress.getLocalHost();
        Socket s = new Socket("Localhost",9550); 

            System.out.println("Connection established:");
            try{
        
        dos = new ObjectOutputStream(s.getOutputStream());
            System.out.println("Output Strema connected:");
            dis = new ObjectInputStream(s.getInputStream());
            System.out.println("Input Stream connected:");
            }catch(Exception e){System.out.println(e);}
        //dos.flush();
         BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the data to be send:");
         data  = br.readLine();
            System.out.println("THe data you entered is:"+data);
       
           
        dos.writeObject(data);
        String echo = (String)dis.readObject();
        System.out.println("The received data is:"+echo);
        }
        catch(Exception e){
            System.out.println(e);}
        finally{
            try{
                dis.close();
                dos.close();
                
            }catch(Exception e){}
                
        }
        }
   
    public static void main(String []args) 
    {
       Echo_Client ec = new Echo_Client();
       ec.run();
      
                
    }
}
