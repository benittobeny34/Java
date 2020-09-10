
package java_50_programing;

import java.util.Scanner;
public class java_String_demo
{
      public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum=A.length()+B.length();
        System.out.println(sum);
        if((int)A.charAt(0)<(int)B.charAt(0))
        System.out.println("No");
        else
        System.out.println("Yes");
   // System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
        
    }
}
