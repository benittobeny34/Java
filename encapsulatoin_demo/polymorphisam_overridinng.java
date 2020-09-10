
package encapsulatoin_demo;
public class polymorphisam_overridinng 
{
    public static void main(String arr[])
    {
      monster obj=new monster();
      obj.show();
    }
}
class angel
{
    public void show()
    {
        System.out.println("hello:");
    }
}
class monster extends angel
{
    public void show() //mehtod overridinng, late binding,dynamic binding, Runtime polymorphisam
    {
        System.out.println("welcome:");
    }
}