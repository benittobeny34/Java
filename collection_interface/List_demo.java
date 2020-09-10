
package collection_interface;
import java.util.*;
public class List_demo 
{
    public static void main(String args[])
    {
        List l = new ArrayList();
        l.add("hi");
        l.add(5);
        l.add(56.65);
        l.add("Mani");
        l.add('m');
        l.remove("Mani");
        
           System.out.println("THe size of the list is:"+l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("hi"));
        System.out.println(l);
        System.out.println("THe last element in the List is:"+l.lastIndexOf('m'));
        System.out.println(l.remove(2));
        
    }
    
}
