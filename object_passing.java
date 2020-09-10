
class paper
{
    String text;
    public
            void getstring(String t)
            {
             text=t;   
            }
            String putstring()
            {
                return text; 
            }
}//class paper end
class printer
{
    public
            void print(paper t)
            {
                t.getstring("Get lost");
            }
}
 
public class object_passing 
{
    public static void main(String arr[])
    {
        paper p=new paper();
        p.getstring("welcome");
        System.out.println(p.putstring());
        printer pr=new printer();
        pr.print(p);
        System.out.println(p.putstring());
        
    }
    
}
