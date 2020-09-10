
package collections_and_generics;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class InstanceOf_keyword
{
    public static void main(String args[])
    {
        ArrayList l1 = new ArrayList();
        LinkedList l2 = new LinkedList();
        System.out.println(l1 instanceOf Serializable);//true
        System.out.println(l2 instanceOf Clonable);//true
        System.out.println(l1 instanceOf RandomAccess);//true
        System.out.println(l2 instanceOf RandomAccess);//false
    }
}
