
package Own_programs;

import java.util.Scanner;
import java.lang.*;


/**
 *
 * @author Benitto Raj
 */
public class String_conversion_YES_NO 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String initial  = input.nextLine();
       String target = input.nextLine();
       int len1=initial.length();
       int len2=target.length();
       int match_till=0,temp;
       
       int moves = input.nextInt();
       if(initial.equals(target)) 
       {
           System.out.println("Yes");
           System.exit(0);
       }
       for(int i=0;i<len1 && i<len2;i++)
       {
           if (!initial.substring(0,i+1).equals(target.substring(0, i+1)) )
           {
             match_till = i;
             System.out.println(match_till);
             break;
           }
           
       }
       if(match_till == 0) match_till = len1;
       
       if(len1-match_till + len2- match_till <=moves)
           System.out.println("Yes");
       else
           System.out.println("No");
           
       
      
       
        
    }
}
