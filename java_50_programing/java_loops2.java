
package java_50_programing;

import java.util.*;
import java.io.*;
import java.lang.Math;

class java_loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int m;
        double ans;
        for(int j=0;j<t;j++)
    {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int k=1;k<=n;k++)
            { 
                m=0;
                ans=0;
                while( m<k)
                {
                   // System.out.println(Math.pow(2,k));
                ans = ans+((Math.pow(2,m))*b);
                m++;
                }
                ans = ans+a;
               System.out.print((int)ans+" ");
            }
          System.out.println();  
  }
   
       
        in.close();
    }
}



