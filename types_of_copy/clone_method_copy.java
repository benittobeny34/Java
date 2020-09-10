
package types_of_copy;


public class clone_method_copy 
{
    public static void main(String arr[]) throws CloneNotSupportedException
    {
     beni obj = new beni();
     obj.a=5;
     obj.b=6;
        System.out.println("The value of a is:"+obj.a);
        System.out.println("The value of b is:"+obj.b);
    //    beni.obj1=obj.clone();//it is not work
    beni obj1=obj;//it is SHALLOW COPY
    obj1.a=7;//it reflects the obj.b reference also
    obj1.b=8; //it reflects the obj.a reference also
        System.out.println("The value of a is:"+obj.a);
        System.out.println("The value of b is:"+obj.b);
    }
}
class beni
{
    int a,b;
    
}