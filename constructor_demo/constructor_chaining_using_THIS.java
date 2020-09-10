//package constructor_demo;


public class constructor_chaining_using_THIS {
    public static void main(String arr[])
    {
        chaining c=new chaining("welcome",5);
    }
    
}
class chaining
{
    chaining()
    {   
        System.out.println("from default constructor");
        System.exit(0);
    }
    chaining(String s)
    {
        this();
        System.out.println("the string in parametersished constructor is:"+s);
    }
    chaining(String s,int i)
    {
       //System.out.println("Hello");
        this("hey");  //it must be first statement like super keyword
        System.out.println("the string and integer parameterished constructor:"+s+i);
    }
}
