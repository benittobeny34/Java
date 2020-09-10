
package encapsulatoin_demo;

public class dynamic_method_dispatch 
{
    public static void main(String arr[])
    {
        M obj1=new M();
        N obj2=new N();
        M a;
            //where M is a reference of super class eventhough we call a.show it will call the subclass.this is called dynamic dispatch .
        //reference is not important obj is considered.
        a=obj2;
        a.show();
    }
}
class M
{
    public void show()
    {
        System.out.println("In class M:");
    }
}
class N extends M
{
    public void  show()
    {
        System.out.println("In class N:");
    }
}