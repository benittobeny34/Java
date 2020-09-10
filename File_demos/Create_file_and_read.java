

package File_demos;

import java.io.File;
import java.io.FileInputStream;

public class Create_file_and_read 
{
    public static void main(String args[]) throws Exception
    {
        File f =new File("java.txt");
        int i;
        System.out.println("THe data are in  the file:");
        FileInputStream fis = new FileInputStream(f);
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
            
        }
    }
}
