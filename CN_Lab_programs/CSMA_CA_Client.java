
package CN_Lab_programs;

import java.net.Socket;

public class CSMA_CA_Client 
{
    public static void main(String args[])
    {
        try{
            System.out.println("===========Client============");
            CSMA_CA_Client obj = new CSMA_CA_Client();
            int R = 0 ;
            boolean b = false;
            for(int k=1;k<=15;k++)
            {
                System.out.println("attempt:"+k);
                //is idle channel or not?
                System.out.println("is channel idel?");
                int i= 0;
                while(true)
                {
                    System.out.print(i=i+1);
                    if(obj.isidle())
                    {
                        System.out.println("\n channel idle");
                        System.out.println("Wiat IFS time 5000");
                        Thread.sleep(1000);
                        System.out.println("Is still idle??");
                        if(obj.isidle())
                        {
                            System.out.println("Still idle");
                            //choose random number
                            R=2^k+1;
                            System.out.println("Selected Random number is:"+R);
                            System.out.println("Waiting for R slot time:"+R*6000);
                            Thread.sleep(R*6000);
                            System.out.println("The message sent:");
                            System.out.println("Wait for time out:"+5000);
                            Thread.sleep(5000);
                            if(obj.isidle())
                            {
                                System.out.println("Ack received");
                                b=true;
                                break;
                            }
                            else
                            {
                                System.out.println("Busy ,goes to channel idel and check again:");
                                
                            }
                        }
                    }                     
                }
                if(b==true) break;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    boolean isidle()
    {
        try{
         Socket s = new Socket("localhost",656);
         s.close();
         return true;
        }catch(Exception e){
            return false;
        }
        }
    }

