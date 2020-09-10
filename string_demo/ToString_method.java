package string_demo;

public class ToString_method
{
    public static void main(String arr[])
    {
        Students s=new Students();
//        System.out.println("The rollno is:"+s.rollno);
//        System.out.println("The name is:"+s.name);
        System.out.println(s.toString());//or simply use s only 
    }
}
class Students  extends Object//its not compulsary extends object
{
    int rollno;
    String name;
    public
    Students()
    {
        rollno=300;
        name="benitto";
     }
    public String toString()
    {
        return rollno +":"+ name;
    }
}
