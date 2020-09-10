
package types_of_copy;


public class object_cloning  {
    public static void main(String arr[])throws CloneNotSupportedException
    {
        Abc obj=new Abc();
        obj.i=5;
        obj.j=7;
       Abc obj1=(Abc)obj.clone();
        System.out.println(obj);
    }
}
class Abc extends Object
{
    int i,j;
    public String toString()
    {
        return "Abc{"+ "I="+i+",j="+j+'}';
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
