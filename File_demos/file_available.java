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
public class file_available 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("java.txt");
        int i;
        i=fis.available();
        System.out.println("The available bytes are in the file is:"+i);
        System.out.println();
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }
    }
}
