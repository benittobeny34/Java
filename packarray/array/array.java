package packarray.array;


import java.util.Scanner;
public class array {
    
    public static void main(String ar[])
    {
        int a[]=new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the "+i+" element");
            a[i]=input.nextInt();
        }
        for( int i=0;i<4;i++)
        System.out.println(a[i]);
    }
    
}
