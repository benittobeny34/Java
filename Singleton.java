
public class Singleton 
{
    public static void main(String args[])
    {
      Object instance =AB.getInstance();
        System.out.println(instance);
      AB.getInstance(); 
      Object obj=AB.getInstance();
        System.out.println(obj);
    }}


class AB
{
    public static AB obj;
   public static  AB getInstance()
    {
        if(obj==null){
        obj =  new AB();
        System.out.println("Object created successfully:");}
      return obj;
    }
}