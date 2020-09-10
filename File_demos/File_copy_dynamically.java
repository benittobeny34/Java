
package File_demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class File_copy_dynamically 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("java.txt");
        FileOutputStream fos = new FileOutputStream("benitto.txt");
        int data;
        while((data=fis.read())!=-1)
        {
            fos.write(data);
           
            System.out.print((char)data);
        }
        System.out.println("The file copy successfully:");
    }
}
