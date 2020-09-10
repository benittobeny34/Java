/*
 String Buffer is mutable object
 */
package Photon_Preparation;

/**
 *
 * @author Benitto Raj
 */
import java.io.*;
public class String_Buffer {
   public static void main(String args[]) throws Exception
   {
    StringBuffer stbuf=new StringBuffer("Beni");
    stbuf.append(" Raj");
       System.out.println("The String is:"+stbuf);
   }
}
