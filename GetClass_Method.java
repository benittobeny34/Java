
public class GetClass_Method 
{
    public static void main(String args[])
    {
        Drouser d= new Drouser();
        Pant p = new Pant();
        System.out.println(d.getClass());
        System.out.println(p.getClass());
    }       
}

class Drouser
{
    String getDrouser()
    {
        return "Modern drouser";
    }
}

class Pant
{
    String getPant()
    {
        return "Old pant";
    }
}