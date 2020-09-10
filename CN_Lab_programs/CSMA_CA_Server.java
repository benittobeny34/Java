
package CN_Lab_programs;

import java.net.ServerSocket;


public class CSMA_CA_Server 
{
 public static void main(String args[]) throws Exception
 {
  try{
      System.out.println("=============Server=============");
      while(true){
          ServerSocket ss = new ServerSocket(656);
          System.out.println("Waiting for connection :");
          ss.accept();
          ss.close();
          System.out.println("Connected");
      }
  }catch(Exception e){System.out.println(e);
 }
  
 }
}
