
package All_Interface;

import java.util.Set;
import java.util.TreeSet;


public class TreeSet_demo 
{
    public static void main(String args[])
    {
        Set <Integer> values = new TreeSet<>();
        values.add(42);
       // values.add(null);// tree set does not allows null object .HASH SET allows null object 
        values.add(61);
        values.add(47);
        values.add(81);
        values.add(9);
        values.add(47);
        values.add(10);
        System.out.println(values);//tree Set gives sorted values:
        values.forEach(System.out::println);
    }
}
/*1) First major difference between HashSet and TreeSet is performance. HashSet is faster than TreeSet and should be preferred choice if sorting of element is not required.

2) Second difference between HashSet and TreeSet is that HashSet allows null object but TreeSet doesn't allow null Object and throw NullPointerException, Why, because TreeSet uses compareTo() method to compare keys and compareTo() will throw java.lang.NullPointerException.

3) Another significant difference between HashSet and TreeSet is that , HashSet is backed by HashMap while TreeSet is backed by TreeMap in Java.

4) One more difference between HashSet and TreeSet which is worth remembering is that HashSet uses equals() method to compare two object in Set and for detecting duplicates while TreeSet uses compareTo() method for same purpose. if equals() and compareTo() are not consistent, i.e. for two equal object equals should return true while compareTo() should return zero, than it will break contract of Set interface and will allow duplicates in Set implementations like TreeSet*/

//5) Now most important difference between HashSet and TreeSet is ordering. HashSet doesn't guaranteed any order while TreeSet maintains objects in Sorted order defined by either Comparable or Comparator method in Java.