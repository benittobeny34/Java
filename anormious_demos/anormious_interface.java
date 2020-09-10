
public class anormious_interface
{
    public static void main(String arr[])
    {
       mobile m=new mobile()                       //not understand this concept completely workout later
       {
         public void show()
         {
             System.out.println("message, calling.....");
         }
       };
       
    }
}

interface mobile
{
   void show(); 
}
