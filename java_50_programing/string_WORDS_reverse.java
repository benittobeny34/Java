
package java_50_programing;

import java.util.Scanner;

public class string_WORDS_reverse 
{
    public static void main(String arr[])
    {
   
    Scanner input = new Scanner(System.in);
    String s;
    String string[] = new String[10];
    s=input.nextLine();
    int len=s.length();
    int j=0;
    string[j]="";
        System.out.println("The string length is :"+len);
       // System.out.println(s.charAt(len-1));
        for(int i=0;i<=len-1;i++)
        {
            if(s.charAt(i)!=' ')
            {
                string[j]=string[j]+s.charAt(i);
   
            }

            else
            {
                j++;
                string[j]="";
            }
                    }
        for(int i=j;i>=0;i--)
        {
            System.out.print(string[i]+" ");
        }
    }
   
    
}
