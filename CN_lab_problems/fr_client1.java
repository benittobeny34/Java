
package CN_lab_problems;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class fr_client1 
{
    public static void main(String args[]) throws Exception
    {
        Socket s = new Socket("localhost",8787);
        Scanner input = new Scanner(System.in);
        int nf;
        System.out.println("Enter the number of frmaes to be send:");
        nf= input.nextInt();
         String msg[]= new String[nf];
         Scanner stream = new Scanner(s.getInputStream());
         PrintStream ps = new PrintStream(s.getOutputStream());
         ps.println(nf);
         int i=0;
        while(i<nf)
        {
            System.out.println("Enter the "+i+" message to be send:"); 
            msg[i]=input.nextLine();
            ps.println(msg[i]);
            System.out.println(i+" acknowledgement received "+" send next message:");    
            i++;
        }
        System.out.println("Sender side all process successfully completed:");
        
    }
}
