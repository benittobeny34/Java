package file_demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.io.*;
public class file_read_byteARRAY {

    public static void main(String arr[]) throws Exception
    {
        int i;
       // char c;
        FileInputStream fis=null;
        byte[] bs=new byte[2000];
     try{   
         fis=new FileInputStream("DEmo.txt");
        i=fis.read(bs);
         System.out.println("Number of bytes read:"+i);
         System.out.println("Bytes read :");
         for(byte b:bs)
         {
           //  c=(char)b;
             System.out.print((char)b);
             
         }
     }
     finally
     {
         if (fis!=null)
         fis.close();
     }
    }//try close
}
