
public class anormious_inner_class 
{
    public static void main(String arr[])
    {
        phone p=new phone()
        {
            public void show()
            {
                System.out.println("calling, message,dance.........");
            }
        };
        p.show();
    }
}

class phone
{
    public void show()
    {
        System.out.println("calling...............");
    }
}