
package collections_and_generics;

import java.util.Comparator;

public class comparator_impel implements Comparator<Integer>
{
  public int compare(Integer o1,Integer o2)
  {
      if(o1>o2) return 1;
      
      return -1;
  }
}
