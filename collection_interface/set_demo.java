
package collection_interface;

import java.util.HashSet;

public class set_demo
{
    public static void main(String args[])
    {
        HashSet<Object> h = new HashSet<>();
        h.add("hi");
        h.add("ani");
        h.add(5);
        h.add(45);
        h.add(45.54);
        h.remove("ani");
        System.out.println(h.contains(45));//it will returns true or false
        System.out.println(h);//it pritns all the elements in the hash set
        System.out.println(h.getClass());// it returns the class which hashset present
        System.out.println(h.hashCode());
        System.out.println(h.size());//returns the size of the hashset
        
    }
}
