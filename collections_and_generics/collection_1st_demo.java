
package collections_and_generics;

import java.util.HashSet;
import java.util.Set;


public class collection_1st_demo {
    //when mention the type of collection it is called generics 
    //collection does not work with index numbers so we go to List or set Interface 
    public static void main(String arr[])
    {
       // Collection values = new ArrayList();//by default the type will be object type in collection
       // Collection <Integer> values = new ArrayList<>();//this is called generics 
        Set <Integer> values = new HashSet<>(); //it gives in sorted format
        values.add(4);
        values.add(5);
        values.add(42);
//        values.add(223.3);
//        values.add("mani");
//        values.add("purosth");
        values.add(89);
        values.add(39);
        values.remove(89);
        
        System.out.println(values);
    }
}            //Set values = new Treeset<>(); it gives in sorted format;
//Set values = new Hashset<>(); it does not allow duplicate element; and we can travel in ;order and random
