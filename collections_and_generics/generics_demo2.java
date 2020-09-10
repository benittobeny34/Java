
package collections_and_generics;


public class generics_demo2 
{
    public static void main(String args[])
    {
        container<Integer> obj = new container();
        obj.setValue(3);
        obj.show();
    }
}
class container <T extends Object>
{
   T value;

    public T getValue() 
    {
        return value;
    }

    public void setValue(T value) {
        this.value = value ;
    }
   
   public void show()
   {
       System.out.println(value.getClass().getName());
       System.out.println("The value of value is:"+value);
   }

}
