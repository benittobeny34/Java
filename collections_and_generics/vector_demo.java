
package collections_and_generics;

import java.util.Vector;
/*
vector essential operations;
v.add(obj); ,v.add(index,obj),v.capacity();v.size();,v.remove(obj);,v.firstElement();
v.addAll(Collections),v.addAll(index,collection),v.clear();v.contains();v.get();
v.indexOf(obj);,v.isEmpty(),v.lastIndexOf(obj),v.equals(vector);v.setSize(new size);



*/
public class vector_demo
{
    public static void main(String args[])
    {
        Vector v = new Vector();
        v.add(3);
        v.add("mani");
        v.add(8);
        v.add(134);//vector increases the size automatically this is advanatege of the vector as per the user
        v.add(33);//requirement
         v.add(3);
        v.add("mani");
        v.add(8);
        v.add(134);
        v.add(33);
        v.add(3);
        v.add(3);
        v.add("mani");
        v.add(8);
        v.add(134);
        v.add(33);
         v.add(3);
        v.add("mani");
        v.add(8);
        v.add(134);
        v.add(33);
        v.add(3);
        v.remove(5);
        v.remove(1);//remove the 1 st element its mani
        for(Object i:v)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(v.capacity());
    }
}
