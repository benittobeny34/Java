
package interface_demos;
public class interface_demo_with_studentDetail
{
    public static void main(String arr[])
    {
        allInfo f = new allInfo();
        f.getDetail(100,"benitto");
        f.getSports("football");
        f.showAll();
    }
}
class StudentDetail
{
    int rollNo;
    String name;
    public void getDetail(int x,String name)
    {
        rollNo = x;
        this.name = name;
    }
    void showDetail()
    {
        System.out.println("The student rollno :"+rollNo);
        System.out.println("The student name :"+name);
    }
}
interface Sports
{
    void getSports(String s);
    void showSports();
}
class allInfo extends StudentDetail implements Sports  
                        //interface uses implements word and class uses extends word
{
    String sportname;
 public  void getSports(String s)
   {
       sportname = s;
   }
 public void showSports()
 {
     System.out.println("The sport name is :"+sportname);
 }
  public void showAll()
   {
       
       showDetail();
       showSports();     
   }
}
