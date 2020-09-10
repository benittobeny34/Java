
package java_50_programing;

import java.util.Scanner;

public class anagram_hackerrank 
{

    static boolean isAnagram(String a, String b)
    {
        if(a.length()!=b.length())
        return false;

        int []s1= new int[256];
        int []s2= new int[256];
       
        for(int i=65;i<122;i++)
        {
            for(int  j=0;j<a.length();j++)
            {
                if((int)a.charAt(j)==i||(int)a.charAt(j)==i-32||(int)a.charAt(j)==i+32)
               s1[i]++;
               
                if((int)b.charAt(j)==i||(int)b.charAt(j)==i-32||(int)b.charAt(j)==i+32)
               s2[i]++;

            }
        }
//        for(int j=0;j<26;j++)
//        {
//            System.out.println("The s1["+j+"] is "+s1[j]);
//              System.out.println("The s2["+j+"] is "+s2[j]);
//        }
        for(int m=65;m<122;m++)
        {
            if(s1[m]!=s2[m]) return false;
        }
        return true;
    }


    public static void main(String[] args) 
    {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
