
package double_colon_java8;
@FunctionalInterface
interface I{
    public void m1();
}
class A{
    A(){
        System.out.println("This is the implementation for the CONSTRUCTOR reference");
    }
    
   public void test(){
        System.out.println("The is the NONSTATIC method reference to m1 method:");
    }
   public static void demo(){
       System.out.println("This is the STATIC method refereence to m1 method:");
   }
}
public class construtor_method_reference
{
    public static void main(String args[])
    {
       I obj = A::new; //constructor reference to m1 object
       obj.m1();
       I obj1 = new A()::test;
       obj1.m1();
       I obj2 = A::demo;
       obj2.m1();
    }
}
