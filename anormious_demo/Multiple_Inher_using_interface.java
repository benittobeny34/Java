
package anormious_demo;

/**
 *
 * @author Benitto Raj
 */



interface village
{
    public void Thalaivar();
}
interface city
{
    public default void MLA(){
        System.out.println("MLa deals with the distric level problems");
    }
}
interface state
{
    public void CM();
    
}
class country implements village,city,state
{
    @Override
    public void Thalaivar()
    {
        System.out.println("Thalaivar deals with the panchayat level problems:");
    }
//    @Override
//    public void MLA()
//    {
//        System.out.println("MLA deals with the district level problems:");
//    }
    @Override
    public void CM()
    {
        System.out.println("CM deals with the needs of state level problems:");
    }
    public void PM()
    {
        System.out.println("Out indian PM is a MODI the mental:");
    }
}

class International extends country
{
    public void SARC()
    {
        System.out.println("SARC is the internation counsil:");
    }
}
public class Multiple_Inher_using_interface
{
    public static void main(String[] args) {
       International obj = new International(); // Java doesn't support multiple inheritance so we acheived that by using interfaces
        obj.Thalaivar();
        obj.MLA();
        obj.CM();
        obj.PM();
        obj.SARC();
    }
}
