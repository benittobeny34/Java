
package anormious_demos;

public class static_inner_class 
{
    public static void main(String arr[])
    {
     Z.i=5;  
     Z.Y y=new Z.Y(); //Z is outer class .to create obj of static inner class only use outer class naem
    }                 //don't required obj of outer class
}
class Z
{
   static int i;
    static class Y
    {
        int j;
    }
}
