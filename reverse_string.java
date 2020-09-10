
import java.util.Scanner;


public class reverse_string
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String string;
        System.out.println("Enter the string :");
        string = scan.nextLine();
        String replace = string.replace("b","m");
        System.out.println("The reverse string is:"+replace);
    }
}
