
package string_demo;
import java.util.Scanner;
public class stringlLENGTH_and_concat
{
    public static void main(String arr[])
    {
        String s1,s2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two strings:");
        s1 = input.nextLine();
        s2 = input.nextLine();
        String s3= s1.concat(s2);//another way is s3=s1+s2;
        System.out.println("The string one is:"+s1);
        System.out.println("The strig two is:"+s2);
        System.out.println("The concate stting is:"+s3);
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        System.out.println("The stirng one length is:"+l1);
        System.out.println("The string two length is:"+l2);
        System.out.println("The concate Stirng length is:"+l3);
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        s3=s3.toUpperCase();
        System.out.println("The stirng one int upper case characters is:"+s1);
        System.out.println("The string two in upper case characters  is:"+s2);
        System.out.println("The concate Stirng in uppercase characters is:"+s3);
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        s3=s3.toLowerCase();
        System.out.println("The stirng one int Lower case characters is:"+s1);
        System.out.println("The string two in Lower case characters  is:"+s2);
        System.out.println("The concate Stirng in lower case characters is:"+s3);
        
    }
}
