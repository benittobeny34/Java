package string_demo;

/*
 * java program to reverse a string 
there are two ways
 --->using customized logic
 --->using standard JAVA logic
 */import java.util.*;
public class String_reverse
{
    public static void main(String arr[])
    {
        //using customized logic
        //for we will requires two strings objects
        String original;
        String reverse="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the original string :");
        original=s.nextLine();
//        int len=original.length();
//        for(int i=len-1;i>=0;i--)
//        {
//            reverse=reverse+original.charAt(i);
//        }
//second method standard java logic
//for this we need object of string
   StringBuffer sb=new StringBuffer(original);
reverse=sb.reverse().toString();
        System.out.println("The reverse String is:"+reverse);
        
     
    }
}
