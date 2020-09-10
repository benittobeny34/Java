
package CN_Lab_programs;

import java.io.ObjectOutputStream;
import java.net.Socket;


public class CSMA_CD_Sender
{
    static int i=0;
    public static void main(String args[]) throws Exception
    {
        try{
            System.out.println("===========client===========");
          CSMA_CD_Sender  obj=  new CSMA_CD_Sender();
          int Tp=1000;
          int R=0;
          int Tb=0;
          
          for(int i=0;i<=10;i++)
          {
              System.out.println("Attempt>"+i);
              if(obj.send().equals("sent"))
              {
                  break;
              }
              else{
                  R=2^i+1;
                  System.out.println("Selected random number is:"+R);
                  Tb=R*Tp;
                  System.out.println("Waiting for next attempt with back time(in seconds):"+Tb);
                  Thread.sleep(Tb);
              }
          }
          
        }catch(Exception e){System.out.println(e);}
    }
    
    String send()
    {
        String str="Collision occured";
        try{
            
            Socket soc = new Socket("Localhost",1569);
            ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
            if(i==5){
            String msg = "CN lab";
            out.writeObject(msg); 
            System.out.println("Message sent:"+msg);
            str="sent";
            }
            i++;
            
        }catch(Exception e){
            
            }
 return str;
    }

    
}
