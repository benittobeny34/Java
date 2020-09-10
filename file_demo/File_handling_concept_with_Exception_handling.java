package file_demo;


import java.io.*;

public class File_handling_concept_with_Exception_handling 
{
public static void main(String arr[]) throws IOException
{
    DataInputStream dis=new DataInputStream(System.in);
    FileOutputStream fos=new FileOutputStream("DText.txt",true);//where true means file is in append mode
    char ch;
    System.out.println("enter the data(@ at the end):");
    try
    {
    while((ch=(char)dis.read())!='@')
    {
        fos.write(ch);
    }//end of while
    }//end of try
    finally
    {
        dis.close();
        fos.close();
    }//end of finally
}//end of static
}//end of class