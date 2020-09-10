package file_demo;

 import java.io.*;
 import java.util.*;
public class file_output_two {
public static void main(String arr[]) throws IOException{
    Scanner s=new Scanner(System.in);
    String str;
    FileOutputStream fos=new FileOutputStream("DEmo.txt");
    try{
    while((str=s.nextLine())!="beni")
    {
        byte buffer[]=str.getBytes();
        fos.write(buffer);
    }//end of while
    }//end of try
    finally{
        fos.close();
    }//end of finally
}
    
}
