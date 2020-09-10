/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
  import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.*;
import java.io.*;
public class echo_client {
  



   
    public static void main(String []args) throws ClassNotFoundException
    {
         String data;
        ObjectInputStream dis=null;
        DataInputStream dii=null;
        ObjectOutputStream dos=null;
        try{
        InetAddress inet=InetAddress.getLocalHost();
        Socket s = new Socket(inet,9999);

        dii = new DataInputStream(System.in);
        dis = new ObjectInputStream(s.getInputStream());
        
        dos = new ObjectOutputStream(s.getOutputStream());

        System.out.println("Enter the data to be send:");
        data  = dii.readLine();
        dos.writeObject(data);
        String echo =(String)dis.readObject();
        System.out.println("The received data is:"+echo);
        }
        catch(IOException e){}
        finally{
            try{
                dis.close();
                dos.close();
                dii.close();
            }catch(Exception e){}
                
                }
    }
}

    

