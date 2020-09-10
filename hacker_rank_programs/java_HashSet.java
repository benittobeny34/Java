
package hacker_rank_programs;

import java.util.HashSet;
import java.util.Scanner;


public class java_HashSet 
{

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
         int count=0;
         HashSet set = new  HashSet();
         boolean result =false;
      for(int i=0;i<t;i++)
      {
         
             result =set.add(pair_left[i]+" "+pair_right[i]);
             if(result== true)
             {
             count++;
             System.out.println(count);
             }
             else
             {
                 System.out.println(count);
             }
      }
 } 

