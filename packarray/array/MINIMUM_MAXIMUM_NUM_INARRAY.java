package packarray.array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.Scanner;
public class MINIMUM_MAXIMUM_NUM_INARRAY {
    public static void main(String arr[])
    {
        int a[]=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array of elements:");
        for(int i=0;i<5;i++)
        {
            a[i]=input.nextInt();
            
        }
        int  minimum=a[0];
        int maximum=a[0];
        for(int i=1;i<5;i++)
        {
         if(minimum>a[i]) minimum=a[i];
         if(maximum<a[i]) maximum=a[i];
        }
        System.out.println("The minimum element in array is: "+minimum);
        System.out.println("The maximum element in array is: "+maximum);
        
        
    }
    
}
