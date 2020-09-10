
package benitto.raj;

public class final_method 
{
 public static void main(String args[])
 {
     beni obj = new beni();
     obj.show();
 }
}

class beni
{
   final  public void show()
    {
        System.out.println("From method show in beni class");
    }
}

//class mani extends beni
//{
//    public void show() // this rise the erro becaue show method is already use the final keyword
//    {
//        System.out.println("From method show in mani class");
//    }
//}
