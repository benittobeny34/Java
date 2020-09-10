
package interface_demos;


public class interface_with_anormous 
{
    public static void main(String arr[])
    {
      Abc obj = new Abc()
      {
         public void show()
          {
              System.out.println("in show");
          }
      };
      obj.show();
    }
}

interface Abc
{
   public abstract void show();//interface are always by default abstract and public no need to mention
}
