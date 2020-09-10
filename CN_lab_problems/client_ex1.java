
package CN_lab_problems;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class client_ex1 
{
    public static void main(String arr[]) throws IOException
    {
        Socket s = new Socket("localhost",9898);
        int number,temp;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(number);
        Scanner sp=new Scanner(s.getInputStream());
        temp=sp.nextInt();
        System.out.println("The answer is:"+temp);
        
        
    }
}
