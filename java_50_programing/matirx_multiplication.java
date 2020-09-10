
package java_50_programing;

import java.util.Scanner;

public class matirx_multiplication
{
    public static void main(String arg[])
    {
          Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of the array:");
        int row=input.nextInt();
        System.out.println("Enter the col of the array:");
        int col = input.nextInt(); 
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int mul[][] = new int[row][col];
        System.out.println("Enter the first array  elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter the arr1["+i+"]["+j+"]element");
                arr1[i][j]=input.nextInt();
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the second elements array:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter the arr2["+i+"]["+j+"]element");
                arr2[i][j]=input.nextInt();   
            }           
        }
        System.out.println("The array1 elments:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr1[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("The array2 elements :");
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr2[i][j]+" "); 
            }
            System.out.println();
        }
        
        System.out.println("The two arraw multiplicatin is:");
        
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    mul[i][j]=0;
                    for(int k=0;k<row;k++)
                    mul[i][j]+=arr1[i][k]*arr2[k][j];   
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
        
    }
}
