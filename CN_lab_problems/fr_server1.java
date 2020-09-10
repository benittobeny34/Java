
package CN_lab_problems;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class fr_server1 
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(8787);
        System.out.println("Server is waiting for connectioin:");
        Socket s = ss.accept();
        Scanner stream = new Scanner(s.getInputStream());
        int nf = stream.nextInt();
        System.out.println("The number of frames in the sender side is:"+nf);
        String rmsg[] = new String[nf];
        int i=0;
        while(i<nf)
        {
           rmsg[i]=stream.nextLine();
            System.out.println("The "+i+" received:"+rmsg[i]);
            i++;
        }
        System.out.println("Server side successfully excuted:");
        
    }
}
