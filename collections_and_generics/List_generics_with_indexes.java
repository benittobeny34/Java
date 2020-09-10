
package collections_and_generics;

import java.util.ArrayList;
import java.util.List;

/*Essential methods for ArrayList is
add(obj),addAll(collection),add(index,obj),indexOf(obj),
lastIndexOf(obj),subList(start,endindex);
remove(obj),get(index);

set(index,obj);


*/




public class List_generics_with_indexes 
{
    public static void main(String args[])
    {
        List beni = new ArrayList();
        beni.add(0);
        beni.add("beni");
        beni.add(12.22);
        beni.add(88);
        beni.add(1993343);
        beni.add(3,"mani");
        //System.out.println(beni);
        beni.forEach(System.out::println);//it is new method introduced in java 1.8
    }
}
