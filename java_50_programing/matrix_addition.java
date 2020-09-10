
package java_50_programing;

import java.util.Scanner;


public class matrix_addition 
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
        int sum[][] = new int[row][col];
        System.out.println("Enter the first array  elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter the arr1["+i+"]["+j+"]element");
                arr1[i][j]=input.nextInt();
            }
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
        System.out.println("The two array addition is:");
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
