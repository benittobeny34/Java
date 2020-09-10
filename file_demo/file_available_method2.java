package file_demo;

import java.io.*;
public class file_available_method2 {
    public static void main(String arr[]) throws Exception
    {
        int i;
        FileInputStream fis=new FileInputStream("DEmo.txt");
        i=fis.available();
        System.out.println("the total available bytes are:"+i);
    }
    
}
