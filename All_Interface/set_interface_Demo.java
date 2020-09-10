
//package All_Interface;


import java.util.*;


public class set_interface_Demo 
{
    public static void main(String args[])
    {
         // Collection values = new ArrayList();//by default the type will be object type in collection
       // Collection <Integer> values = new ArrayList<>();//this is called generics 
        Set<Integer> values = new HashSet<>();
        values.add(33);
        values.add(33);
        values.add(23);
        values.add(57);
        values.add(null);//HASH SET allows null object TreeSet does not allows null object
        values.add(20);
        values.forEach(System.out::println);//it is a method
        System.out.println(values);
        //Set values = new Treeset<>(); it gives in sorted format;
//Set values = new Hashset<>(); it does not allow duplicate element; and we can travel in ;order and random
    }
}
