
package file_demo;

import java.io.FileOutputStream;

public class write_a_data_into_file
{
    public static void main(String arr[]) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("beni2.txt");
        fos.write(3);
        fos.write(4);
       
        fos.write(00);
        System.out.println("writing data into the file successfully generated:");
        fos.close();
        
        
    }
}
