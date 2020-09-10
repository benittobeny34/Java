
package CN_lab_problems;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_ex1
{
   public static void main(String args[])  throws Exception
   {
       ServerSocket ss = new ServerSocket(9898);
       System.out.println("Server is ready for acceptin client request:");
       Socket s = ss.accept();
       System.out.println("Server is succefully accepted:");
       Scanner input = new Scanner(s.getInputStream());
       int number = input.nextInt();
       int ans = number*number;
       System.out.println("Server side is successfully executed:");

       PrintStream p = new PrintStream(s.getOutputStream());
       p.println(ans);
       
              
       
   }
}
