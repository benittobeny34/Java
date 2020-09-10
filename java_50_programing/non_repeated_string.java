
package java_50_programing;

import java.util.Scanner;


public class non_repeated_string
{
    
    public static void main(String arg[])        
    {
        String s;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want:");
        s = input.nextLine();
        checking(s);
     
    }
    private  static  void checking(String str)
     {
       int len=str.length();
       char [] temp =str.toCharArray();
       int j,count=0;
       for(int i=0;i<len;i++)
       {
          j=0;
          count=0;
          while(j<len)
          {
            if(str.charAt(j)==temp[i])
            {
                count++;
            }
            j++;
          }
          if(count==1)
          {
              System.out.println("The minimum non repeated string is:"+str.charAt(i));
          }
       }
       
     
     }
}

