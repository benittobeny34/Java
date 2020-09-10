
package collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int id;
    int mark;
    String name;
    Student(int id,int mark,String name)
    {
       this.id = id;
       this.mark = mark;
       this.name = name;
    }
   
}
 class sorttech implements Comparator<Student>
{
     public int compare(Student o1, Student o2)
    {
        if(o1.mark>o2.mark) return 1;
        return -1;
    }
}

public class comparator_demo 
{
    public static void main(String args[])
    {
        ArrayList t = new ArrayList();
       Student s = new Student(101,88,"beni");
       t.add(s);
       Student s1 = new Student(102,89,"mani");
       t.add(s1);
       Student s2 = new Student(103,55,"dhina");
       t.add(s2);
       Student s3 = new Student(104,99,"ramesh");
       t.add(s3);
       Collections.sort(t,new sorttech());
        for(Object i: t)
        {
            System.out.println(t);
        }
    }
}
