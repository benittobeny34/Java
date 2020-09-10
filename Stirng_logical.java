
public class Stirng_logical 
{
    public static void main(String args[])
    {
         String name = "BENITTO STUDIEDED MARIST";
         String frname = "now studied in ccet";
         int j=0,k=0,i=0;
         while(true)
         {
             if(i%2==1&&j<name.length())
             {
                 
             System.out.print(name.charAt(j));
             j++;
             }
             if(i%2==0&&k<frname.length())
             {
                 
                 System.out.print(frname.charAt(k));
                 k++;
             }
             if(j>name.length()&&k>frname.length())
             {
                 break;
             }
             i++;
         }
    }
}
