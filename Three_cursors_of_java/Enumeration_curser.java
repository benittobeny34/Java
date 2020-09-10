//Enumeration contains only two methods hasMoreElements() this method returns boolean, and nextElement();
// and this method returns object
// It is introduced in 1.0 version 
package Three_cursors_of_java;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_curser 
{
    public static void main(String args[])
    {
        Vector v = new Vector();   
        for(int i=0;i<10;i++)
        {
            v.add(i);
        }
         Enumeration e=v.elements();
         System.out.println(v);
         while(e.hasMoreElements())
         {
             System.out.print(" "+e.nextElement());
         }
    }
}
