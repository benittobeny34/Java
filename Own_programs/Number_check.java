
package Own_programs;

import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
public class Number_check 
{
    public static void main(String ...args){
        
        Scanner input  = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        String line;
        String str[]=new String[n];
        int j;
        boolean con =false;
        for(int i=0;i<n;i++)
        {
            str[i]=input.nextLine();          
        }
        for(int i=0;i<n;i++)
        {
            line = str[i];
            con = false;
            //System.out.println(line);
            
            for(j=0;j<line.length();j++)
            {
                if(line.charAt(j)>=65 && line.charAt(j)<=122)
                {
                    System.out.println("Invalid");
                    con = true;
                    break;
                }
            }
            if(line.indexOf('.')>=0 && line.indexOf('.')<line.length()-1)
            {
                System.out.println("VAlid Decimal Number");
                continue;
            }
            
            else if(con == false){
                System.out.println("Valid Integer Number");
            }
            
            
        }
        
    }
}
