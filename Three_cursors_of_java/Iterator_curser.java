/*It cotains three method 
1.hasNext() it returns boolean
2.next() it returns object compulsary we perform type casting
3.remove() it returns void 

it is aplicable for all Collection interfaces

Disadvantages of Iterator 
1.It is only single direction (forward)
2.we can't add more elemtns 

so we go for list interface but list interface only applicable for List Objects like Arraylist, Linkedlist etc
*/



package Three_cursors_of_java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator_curser 
{
    public static void  main(String args[])
    {
         Collection c= new HashSet();   
        for(int i=0;i<10;i++)
        {
            c.add(i);
        }
         Iterator i=c.iterator();
         System.out.println(c);
         while(i.hasNext())
         {
             Integer j=(Integer)i.next();
             if(j%2==0)
             System.out.print(" "+j);
             else
                 i.remove();
         }
         System.out.println();
        System.out.println(c);
    }
}
