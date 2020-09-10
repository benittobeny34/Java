
package collection_interface;

import java.util.LinkedList;
/* LinkedList constructors 
1.LinkedList l = new LinkedList();
2.LinkedList l = new LinkedList(Collection c);


LinkedList implements serializable and clonable interfafce but not implemeted by random access;
*/


public class LinkedList_demo 
{
   public static void main(String args[])
   {
       LinkedList l = new LinkedList();
       l.add("benitto");
       l.add(4);
       l.add(7);
       l.add(88.99);
       System.out.println(l);
       l.addFirst("mani");
       l.addLast("vivek");
       System.out.println(l.getFirst());
       System.out.println(l.getLast());
       System.out.println(l);
       l.removeFirst();
       l.removeLast();
       System.out.println(l);
               
   }
}
