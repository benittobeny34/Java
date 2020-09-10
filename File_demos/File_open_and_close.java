/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Benitto Raj
 */
public class File_open_and_close
{
    public static void main(String args[]) throws Exception
    {
        int  i;
        char c;
        byte [] bs= new byte[5]; // this is called byte array 
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File f1= new File("java.txt");
        File f2=new File("Text.txt");
        
        try{
            while(true)
            {
                fis =new FileInputStream(f1);
                fos = new FileOutputStream(f2,true);
                
                i=fis.available();
                System.out.println("The total bytes available in the f1 is:"+i);
                fis.read(bs);
                
                for(byte j:bs) //it reads only size of bytes   elements 
                {
                    c=(char)j;
                    fos.write(c);                   
                }
                fis.close();
                fos.close();
                break;
            }
        }
            catch(Exception e)
                    {
                    System.out.println(e+" enter the valid document");
                    }
        }
        
    }

