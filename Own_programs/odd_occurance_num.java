package Own_programs;

import java.util.Scanner;

public class odd_occurance_num {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        int occ[] = new int[1001];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            occ[arr[i]]++;
        }
        for(int i=0;i<size;i++)
        {
          if(occ[arr[i]]%2==1)
          {
              System.out.println(arr[i]); 
              break;
          }
        }
        
        
        

    }
}
