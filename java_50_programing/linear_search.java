
package java_50_programing;

import java.util.Scanner;

public class linear_search 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int arr[]={1,0,10,13,2,5,100,442,22,42,68,23,11};
        
        System.out.println("before sorting :");
        for(int i:arr)
         System.out.print(i+" ");
        System.out.println("Enter the element to search:");
        int element = input.nextInt();
        search(arr,element);  
    }
    
    //linear search logic time complexity is O(n)
    private static void search(int arr[],int element)
    {
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==element)
         {
             System.out.println("The "+element+" is located at the position of "+i);
             System.exit(0);
         }
     }
    }
}
