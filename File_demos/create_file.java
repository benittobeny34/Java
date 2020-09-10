
package File_demos;

import java.io.File;
import java.io.FileOutputStream;


public class create_file
{
    public static void main(String args[]) throws Exception
    {
        File f = new File("java.txt");
        String msg = "java is a object oriented programming"+" this is my firt program for file operation";
        byte buffer[] = msg.getBytes();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(buffer);
        fos.close();
        
        
    }
}
