
package serialaizable_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serializable_1st
{
    public static void main(String arr[]) throws  Exception
    {
    demo obj = new demo();
    obj.i=5;
    
    File f = new File("demobeni.txt");
    FileOutputStream fos = new FileOutputStream(f);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(obj);
    
     FileInputStream fis = new FileInputStream(f);
     ObjectInputStream ois = new ObjectInputStream(fis);
     demo obj1 = (demo)ois.readObject();
     
        System.out.println("The value of i is:"+obj.i);
     
    }
    
    
}
class demo implements Serializable
{
    int i;
}
