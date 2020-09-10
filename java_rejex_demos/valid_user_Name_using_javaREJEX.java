
package java_rejex_demos;

 import java.util.Scanner;
public class valid_user_Name_using_javaREJEX 
{
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}   
class UsernameValidator 
{
  static  String  regularExpression ="([a-zA-Z][a-zA-Z0-9_]{7,29})";
}
  
    

