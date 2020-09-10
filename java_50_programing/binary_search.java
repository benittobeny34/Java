
package java_50_programing;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search
{
    @SuppressWarnings("empty-statement")
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int arr[]={1,0,10,13,2,5,100,442,22,42,68,23,11};
        
        System.out.println("before sorting :");
        for(int i:arr)
         System.out.print(i+" ");
         Arrays.sort(arr);
         
        System.out.println("After sorting array becomes:");
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
        
        System.out.println("Enter the element to search:");
        int element = input.nextInt();
        search(arr,element);  
    }
    
    //binary search time complexity is O(log(n))
    private static  void search(int sortarr[],int element)
    {
       int low=0,mid,high;
       high =sortarr.length;
       mid = (low+high)/2;
       while(true)
       {
           if(sortarr[mid]==element)
           {
               System.out.println("The "+element +" is located in "+mid+" place:");
               System.exit(0);
           }
           if(sortarr[mid]>element)
           {
               high=mid;
               low=0;
               mid=(high+low)/2;
           }
           else
           {
               low=mid;
               mid =(low+high)/2;
           }
       }
    }
}
