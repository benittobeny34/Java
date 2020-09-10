
package CN_Lab_programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ReceiverSWARQ
{
    ServerSocket receiver;
    Socket connection= null;
    ObjectOutputStream out;
    ObjectInputStream in;
    String packet,ack,data="";
    int i=0,sequence=0;
    ReceiverSWARQ(){}
    public void run(){
        try{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           receiver = new ServerSocket(2005,10);
            System.out.println("Waitng for connection:");
            connection = receiver.accept();
            sequence=0;
            System.out.println("Conection established:");
            out = new ObjectOutputStream(connection.getOutputStream());
            out.flush();
            in = new ObjectInputStream(connection.getInputStream());
            out.writeObject("connected");
            do{
                try{
                   packet = (String)in.readObject();
                   if(Integer.valueOf(packet.substring(0,1))==sequence)
                   {
                       data+=packet.substring(1);//data =data+packet.substring(1);
                       sequence=(sequence==0)?1:0;
                       System.out.println("\n \n receiver   >"+packet);
                   }
                   else 
                   {
                       System.out.println("\n \n \n >"+packet+" duplicate data:");
                   }
                   if(i<3)
                   {
                       out.writeObject(String.valueOf(sequence));
                       i++;
                   }
                   else
                   {
                       out.writeObject(String.valueOf((sequence+1)%2));
                       i=0;
                   }
                }  catch(Exception e){}
                
            }while(!packet.equals("end"));
            System.out.println("Data received ="+data);
            out.writeObject("connectin ended:");   
        }catch(Exception e){}
        finally{
        try{
            in.close();
            out.close();
            receiver.close();
        }catch(Exception e){}
    }
        
    }
    public static void main(String args[]) throws Exception
    {
        ReceiverSWARQ obj = new ReceiverSWARQ();
        while(true){
            obj.run();
        }
        
    }
}
