package constructor_demo;


public class constructor_overloading
{
    public static void main(String arr[])
    {
        Test t=new Test();//it access default constructor
        Test t1=new Test(4);//it access parameterished constructor which is have one argument
        Test t2=new Test(5,6);//it access parameterished constructor which is have two argument   
    }
}
class Test
{
 public
         Test()//default constructor
         {
             System.out.println("it is a dafault constructor:");
         }
         Test(int i)//parameterished constructor with one argument
         {
             System.out.print("The value of i is:"+i+"  ");
             System.out.println("from the parametersished constructor it holds one argument:");
         }
         Test(int i,int j)//parameterished constructor with two arguments
         {
             int sum=i+j;
             System.out.print("The sum is:"+sum+" ");
             System.out.println("It is from parametersihded constructor it holds two arguments:");
         }
}
