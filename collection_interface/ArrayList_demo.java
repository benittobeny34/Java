
package collection_interface;

import java.util.ArrayList;


/*constructors for ArrayList 
1.ArrayList() a = new ArrayList();  initiall it has the default size 10 after increased by (cc*3/2)+1;
2.ArrayList() a = new ArrayList(int size);
3.ArrayList() a = new ArrayList(Collection c);
ArrayList implements Random Access and clonable and serializable interfacess
*/

public class ArrayList_demo
{
    public static void main(String args[])
    {
        ArrayList I = new ArrayList();
        I.add(5);
        I.add("beni");
        I.add(66.22);
        I.add("maniraj");
        I.add("dhina.55");
        I.add(null);
        I.add("something");
        System.out.println(I);
        I.remove(1);
        System.out.println(I);
        I.remove(66.22);
        
        I.add(2,"sachintendulkar");
        System.out.println(I);
        
    }
}
