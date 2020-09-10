
package File_demos;

import java.io.DataInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Benitto Raj
 */
public class File_handling_concept_with_excepton_handling 
{
    public static void main(String args[]) throws Exception
    {
    DataInputStream dis = new DataInputStream(System.in);
    FileOutputStream fos = new FileOutputStream("Text.txt",true); //where true means file is an append mode
    char ch;
        System.out.println("Enter the data(@ at the end)");
        while((ch=(char)dis.read())!='@')
        {
            fos.write(ch);
        }
        dis.close();
        fos.close();
}
}
