
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_demos;

import java.io.FileInputStream;

/**
 *
 * @author Benitto Raj
 */
public class File_reading_data 
{
    public static void main(String args[]) throws Exception
    {
        
        int k;
        FileInputStream fis = new FileInputStream("Text.txt");
        while((k=fis.read())!=-1)//read data from file dynamcally
        {
            System.out.print((char)k);
        }
        fis.close();
    }
}
