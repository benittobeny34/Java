
package serialaizable_demo;

import java.awt.List;
import java.util.ArrayList;

public class searilaizable_xml_demo 
{
    public static void main(String arr[])
    {
    student str1 = new student();
    str1.setRollno(101);  
    str1.setSname("beni");
    student str2 = new student();
    str2.setRollno(102);
    str2.setSname("fep");
     List <student> s;
        s = new ArrayList<>();
     s.add(str1);
     s.add(str2);
     college c = new college();
     c.setStudents(s);
    }
}

class college
{
    private List <student> students;
    
    public List<student> getStudents(List<student> students)
    {
        return students;
    }
    public void setStudents(List<student> students){
        this.students = students;
    }
    
}
class student 
{
    private int rollno;
    private String sname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "student{" + "rollno=" + rollno + ", sname=" + sname + '}';
    }
    
}
