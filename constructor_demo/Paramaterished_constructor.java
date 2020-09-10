package constructor_demo;

/*
passing arguments to the constructor is called paramaterished constructor.

 */
public class Paramaterished_constructor {
    public static void main(String arr[])
    {
     math m1=new math(6);
     math m2=new math(7);
     m1.mathsqure();
     m2.mathcube();
    }
}
class math
{ 
    private final
    int num;
    public
    math(int i)//parameterished constructor
    {
        num=i;
    }
    void mathsqure()
    {
       int i=num*num;
        System.out.println("The squre of the "+num+" is:"+i);
    }
    void mathcube()
    {
        int i=num*num*num;
        System.out.println("The cube of the number "+num+" is "+i);
    }
    
}
