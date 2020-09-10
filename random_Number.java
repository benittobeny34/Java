

import java.util.*;

public class random_Number
{
    public static void main(String[] args) 
    {
        Random r = new Random();
        List<Integer> li = new ArrayList<>();
        List<Float> li1 = new LinkedList<>();
       for (int i=0; i<5;i++)
       {
          
           int x = r.nextInt(1000);
           li.add(x);
           float y =r.nextFloat();
           li1.add(y);
           
           
           
       }
        System.out.println( r.nextInt(3400));
        System.out.println(r.nextGaussian());
       for(int i:li)
            System.out.print(i+" ");
        System.out.println();
       for (float j:li1)
            System.out.print(j+" ");
    }
}
