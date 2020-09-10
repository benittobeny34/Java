package file_demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
import java.io.*;
public class File_reading_daata 
{
    public static void main(String arr[]) throws Exception
    {
        int k;
        FileInputStream fis=new FileInputStream("DEmo.txt");   
       while((k= fis.read())!=-1)    //read data from file in dynamically
   System.out.print((char)k);
       fis.close();
    }
}
