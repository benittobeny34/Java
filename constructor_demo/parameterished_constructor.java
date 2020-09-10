//package constructor_demo;

public class parameterished_constructor {
    public static void main(String arr[])
    {
    mani obj=new mani(5,5.5,"beni");    
    }
    
    
}                //constructor overloading concept with many arguments
class mani
{
   public
                 mani()
                 {
                     System.out.println("welcome");
                 }
         mani(int i){
       System.out.println("welcome budy glad to meet you");
   }
         mani(int i,double j,String s)
         {
             System.out.println("the number:"+i);
             System.out.println("the double is:"+j);
             System.out.println("the string is:"+s);
         }
}
