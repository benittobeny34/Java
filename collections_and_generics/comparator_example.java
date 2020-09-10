
package collections_and_generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class comparator_example
{
    public static void main(String arr[]) throws Exception
    {
       List<Integer> values = new ArrayList<>();
       values.add(305);
       values.add(503);
       values.add(207);
       values.add(688);
       values.add(8003);
     Collections.sort(values);//normal sort
    Collections.reverse(values); it will print in reverse order (last to first)
  // comparator_impel<Intteger> obj = new Comparator_impel();
       
       for(int i:values)
            System.out.println(i);
    }
}
