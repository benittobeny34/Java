/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Own_programs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
public class cutTheSticks 
{
    


    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr,int n) {

        Arrays.sort(arr);
        int pos=1,i=0,count,j,least;
        int sticks[]=new int[n+1];
        for(i=0;i<n;i++){
            least=arr[i];
            if(least!=0) {
                count=0;
                for(j=i;j<n;j++)
                {
                    arr[j]=arr[j]-least;
                    if(arr[j] == 0) count++;
                }              
               sticks[pos]=n-i-count; 
               pos++;
          }          
        }
        sticks[0]=n;
        arr = Arrays.copyOfRange(sticks, 0, pos-1);
        
        return arr;
    }

    final static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int ans[]=cutTheSticks(arr,n);
        for(int i=0;i<ans.length;i++)
          System.out.println(ans[i]);

    }
}


