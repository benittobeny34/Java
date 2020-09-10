
import java.util.ArrayList;
import java.util.Collections;


public class swapConsecutiveElements 
{
    public static void main(String args[])
    {
        ArrayList <String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println("Before swap:");
        System.out.println(list);
       for(int i=0;i<list.size();i+=2)
       {
           if(i+1<list.size())
           {
               Collections.swap(list,i,i+1);
           }
       }
       System.out.println("After swap");
       System.out.println(list);
    }
}
