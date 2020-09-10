import java.io.*;
public class serialaization 
{
    public static void main(String arr[]) throws Exception,NotSerializableException
    {
try{
        FileOutputStream fos=new FileOutputStream("des.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student s=new Student();
        oos.writeObject(s);
        FileInputStream fis=new FileInputStream("des");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object o=ois.readObject();
        Student s1=(Student)o;
        System.out.println(s1.sid);
}
catch(Exception e){
System.out.println("The error is:"+e);
}
    }
}
class Student implements java.io.Serializable
{
    int sid=101;
    String name="ram";
    int sage=29;
    double sfee=2500;
    String scourse="java";
    String insname="NIT";
}
