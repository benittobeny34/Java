
public class member_inner_class
{
    public static void main(String arr[])
    {
        up u=new up();
      up.down d=u.new down();
      d.show();
      u.i=8;
        System.out.println("the value of i is:"+u.i);
    }
}
class up
{
    int i;
    
    class down
    {
        public void show()
        {
       System.out.println("from inner class:");
        }
    }
}
