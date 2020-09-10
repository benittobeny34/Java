
package encapsulatoin_demo;
//poly means many 
//morphisam means behavior
public class polymorphisam_demo
{
      public static void main(String arr[])
      {
          johan obj=new johan();
          obj.show(5.5);
      }
}
 //  polymorphism is defined as the number of mehtods inside the any class either super class or subclass
//this is called polymorphisam becuase we create many number of function inside those classes.
class johan  //mehtod overloading ,early  binding,static binding, 
{            //it is also called polymorphisam
    public void show()
    {
        System.out.println("Hello");
    }
    public void show(int i)
    {
        System.out.println("welcome");
    }
    public void show(double i)
    {
        System.out.println("It is double type:");
    }
}