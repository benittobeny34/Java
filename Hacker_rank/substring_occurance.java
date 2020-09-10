
package Hacker_rank;

import java.util.Scanner;


public class substring_occurance 
{
    public static void main(String args[])
    {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        String ss = input.nextLine();
        int i=0,inc=0;
        while(i<s.length()-ss.length()+1)
        {
            if (s.substring(i, i+ss.length()).equals(ss))
            {
                inc++;
            }
            i++;
        }
        System.out.println("The total occurance of the substring is:"+inc);
    }
}
