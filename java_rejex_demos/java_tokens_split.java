
package java_rejex_demos;

import java.util.Scanner;


public class java_tokens_split 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delims = "[ .,?_!'@]+";
       String[] tokens = s.trim().split(delims);
       
   if(s.trim().equals("")){
       System.out.println("0");
    }
    else if(s.length() > 400000){
        return;
    }
    else{
       System.out.println(tokens.length);
    }

    for(String item: tokens){
        System.out.println(item);
        // Write your code here.
        scan.close();
    }
}
}
