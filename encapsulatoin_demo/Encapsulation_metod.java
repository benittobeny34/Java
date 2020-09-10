package encapsulatoin_demo;

/*
ENCAPSULATION is acheived by declare the class variables as private and access those variables by setter and 
getter method .methods are in the public area.this is also called as DATA HIDING in concept
 */
public class Encapsulation_metod 
{
    public static void main(String arr[])
    {
       test obj=new test();
      // obj.i=5;
      //  System.out.println("The value of i is:"+obj.i);
      obj.setI(5);
      int k=obj.getI();
        System.out.println("The value of i is:"+k);
      
    } 
}
class test
{ 
    private
    int i;
    public
    void setI(int j)
    {
        i=j;
    }
    int getI()
    {
        return i;
    }
    
}
