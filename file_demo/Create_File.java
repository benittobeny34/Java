//package file_demo;

import java.io.*;
public class Create_File {
    public static void main(String arr[]) throws IOException
    {
        File f=new File("java.txt");
        String msg="java is a object oriented programming Language "
                + " this is my first program  in file  succesfully  i am feel glad"
                +"welcome to the java programing  i am benitto thank you naresh i techonolgies all credits goes to you";
        byte buffer[]=msg.getBytes();
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(buffer);
        fos.close();
      
        
    }
    
}
