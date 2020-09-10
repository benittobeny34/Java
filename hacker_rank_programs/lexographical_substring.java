
package hacker_rank_programs;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class lexographical_substring
{
    public static String getSmallestAndLargest(String s, int k) {
       SortedSet<String> set = new TreeSet<String>();
       for(int i=0;i<s.length()-2;i++)
       {
       set.add(s.substring(i,i+3));
       }
    
    String smallest = set.first();
    String largest = set.last();
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
