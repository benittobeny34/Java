package file_demo;



import java.io.*;
public class file_available_method{
    public static void main(String arr[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("c++ and c programs orders.txt");
        int i;
        i=fis. available();
        System.out.println("The availabe bytes are:"+i);
        System.out.println();
       while((i=fis.read())!=-1) // READ mehod to read a chaacter one by one
        {
          // System.out.print(i+" "); //Ascii values of the character
            System.out.print((char)i);
        }//while close
       
    }//static main close
}//class close
