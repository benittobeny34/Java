
package collections_and_generics;

import java.util.ArrayList;
import java.util.Scanner;


public class LIST_ArrayList
{
    public static void main(String arrgs[])
    {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        list.add(input.nextInt());
        list.add(input.next());
        list.add(4);
        list.add(4);
        list.add('A');
        list.add(3,"beni");
        list.remove(2);
        list.set(0,10);
        list.indexOf('A');
        list.indexOf(4);
        list.lastIndexOf(4);
        System.out.println(list);       
    }
}
