
package java_50_programing;

import java.util.Scanner;

public class squre_root_find 
{
    public static void main(String arr[])
    {
        Scanner input = new Scanner(System.in);
        double squre = input.nextDouble();
//        double ans=Math.sqrt(squre);
        double d=squre/2;
        for(int i=0;i<d;i+=0.0005)
        {
            if(i*i==squre)
            {
                System.out.println("the squre root is:"+i);
                break;
            }
           
        }
    }
}
