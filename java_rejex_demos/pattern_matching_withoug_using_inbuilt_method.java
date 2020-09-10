
package java_rejex_demos;

public class pattern_matching_withoug_using_inbuilt_method
{
        public static void main(String args[])
    {
        String text = "navinreddy";
        String pattern = "dd";
        
        int count=0;
     
        
        int tlen = text.length();
        int plen = pattern.length();
        char c,p;                         //not get proper ouput for this code correctly
        
        for(int i=0;i<=tlen-plen;i++)
        {
            c = text.charAt(i);
            p = pattern.charAt(0);
            if(c == p)
            {
                for(int j=i,k=0;j<i+plen;j++,k++)
                {
                    c = text.charAt(j);
                    p = pattern.charAt(k);
                    if(c == p) count++;
                    else count=0;
                   
                }
            }
                
        }
        if(count == plen) 
             System.out.println(" Yahh it matches correctly:");
        else 
            System.out.println(" ohhh! something wrong it not matches correctly ");
          
    }
}
