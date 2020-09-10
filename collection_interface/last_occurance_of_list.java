
package collection_interface;

import java.util.ArrayList;
import java.util.List;


public class last_occurance_of_list 
{
    public static void main(String args[])
    {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");
        list.add("zzz");
        list.add("mmm");
        list.add("mmm");
        list.add("nnn");
        System.out.println("The size of the list is:"+list.size());
        System.out.println("The Index  of aaa is:"+list.indexOf("aaa"));
        System.out.println("The last  index of aaa is:"+list.lastIndexOf("aaa"));
        System.out.println("The Last Index of mmm is:"+list.lastIndexOf("mmm"));
        System.out.println("The class of the list is:"+list.getClass());
    }
}
