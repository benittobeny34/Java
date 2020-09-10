
package benitto.raj;


public class final_class 
{
    public static void main(String args[])
    {
        Beni obj= new Beni();
        obj.show();
    }
}
final class Beni
{
    void show()
    {
        System.out.println("From Beni class");
    }
}

//class Mani extends Beni // this rises error 
//{
//    @Override
//    void show()
//    {
//        System.out.println("From Mani class");
//    }
//}