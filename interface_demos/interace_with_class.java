package interface_demos;
public class interace_with_class
{
    public static void main(String arr[])
    {
         A obj = new C();// obj is the reference of A class so only access A interface methods
        obj.show();
        B obj1 = new C();//obj1 reference of B class 
       // obj.display();//it shows error because the reference is interface show only access interface method
         obj1.display();             //in order to access display() we create obj reference for class B or Class C
    }
}
interface A
{
    public void show();
    
}
abstract class B implements A     //interfaces are uses IMPLEMENTS not extends
{
    public void show()
    { 
        System.out.println("show method");
    }
   abstract public void display();
}

class C extends B
{
    public void display()
    { 
        System.out.println("display method");
    }
}
