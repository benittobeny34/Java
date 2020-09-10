
package double_colon_java8;

@FunctionalInterface
interface Y{
    public void m1(int x); //by default pulbic abstract
}

class beni{
    public void test(int y){
        System.out.println("Implementation for m1-Y:"+y);
    }
}
public class Method_reference_interanlly 
{
    public static void main(String args[]){
        Y obj = new beni()::test;
        obj.m1(3);
    }
}
