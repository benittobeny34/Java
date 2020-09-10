package java_50_programing;

import java.util.Scanner;

public class counting_characters 
{
    public static void main(String arg[])
    {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        int arr[] = new int[s.length()];
        int i,j;
        for(i=0 ; i<s.length() ; i++)
        {
             char c = s.charAt(i);
             arr[i]=0;
            for( j=0 ; j<s.length() ; j++)
            {
             if(s.charAt(j)==s.charAt(i))
               arr[i]++; 
            } 
            
        }
        for(i=0;i<256;i++)
        {
            for(j=0;j<s.length();j++)
            {
              if((char)i==s.charAt(j))
              {
                 System.out.println("The letter "+s.charAt(j)+" is presented in "+arr[j]+" times");
                 break;
              }
            }
        }
    }
}
