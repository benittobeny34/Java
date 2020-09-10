
package hacker_rank_programs;

import java.util.Scanner;


public class hacker_rank_lexiographicalOrder2 
{


    public static String getSmallestAndLargest(String s, int k) {
         String []Arr = new String[s.length()+1-k];
         for(int i=0;i<=s.length()-k;i++)
         {
             Arr[i]=s.substring(i,i+k);
         }
        // System.out.println(Arr[0]);
         //System.out.println(Arr[10]);
   String smallest=Arr[0];
   String largest=Arr[0];
   for(int i=0;i<=Arr.length-1;i++)
   {
          if((int)smallest.charAt(0)==(int)Arr[i].charAt(0)&&k!=1)
          {
              if((int)smallest.charAt(1)>(int)Arr[i].charAt(0))
              {
                  smallest = Arr[i];
              }
          }
          if((int)largest.charAt(0)==(int)Arr[i].charAt(0)&&k!=1)
          {
              if((int)largest.charAt(1)>(int)Arr[i].charAt(0))
              {
                  largest = Arr[i];
              }
          }
         if((int)smallest.charAt(0)>(int)Arr[i].charAt(0))
            smallest = Arr[i];
         if((int)largest.charAt(0)<(int)Arr[i].charAt(0))
          largest = Arr[i];
            
   }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

