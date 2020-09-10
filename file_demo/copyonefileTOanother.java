
package file_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class copyonefileTOanother 
{
   public static void main(String args[]) throws Exception
   {
       FileInputStream fis = new FileInputStream("beni1.txt");
       FileOutputStream fos = new FileOutputStream("beni2.txt");
       int data;
       while((data=fis.read())!=-1)
       {
           fos.write(data);
       }
       System.out.println("successfully copied :");
       fis.close();
       fos.close();     
               
   }
}
