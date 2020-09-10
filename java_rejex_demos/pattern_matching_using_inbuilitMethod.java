
package java_rejex_demos;

public class pattern_matching_using_inbuilitMethod
{
    public static void main(String args[])
    {
        String text = "I am benitto from p.udayapatti";
        String pattern = "wel";
        boolean value  = text.contains(pattern);
        if(value)
   
            System.out.println(" Yahh it matches correctly:");
        else 
            System.out.println(" ohhh! something wrong it not matches correctly ");
          
    }
}
