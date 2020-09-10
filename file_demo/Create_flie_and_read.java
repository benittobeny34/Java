package file_demo;



import java.io.*;
public class Create_flie_and_read {
    public static void main(String arr[]) throws IOException
    {
        File f=new File("java.txt");
        int i;
        System.out.println("The data are in the file:");
        FileInputStream fis=new FileInputStream(f);
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }
        fis.close();
    }
}
