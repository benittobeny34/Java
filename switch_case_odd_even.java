import java.util.Scanner;

public class switch_case_odd_even
{
    public static void main(String args[]){
        System.out.println("Enter the number to check even or odd:");
        Scanner s = new Scanner (System.in);
        int num=s.nextInt();
        switch(num)
        {
            case 0:
                System.out.println("Number is Even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;
            default:
                int y=num%2;
                switch(y){
                    case 0:
                        System.out.println("Number is Even");
                        break;
                    case 1:
                        System.out.println("Number is Odd");
                        break;
                             
            }
        }
        System.out.println("Program executed successfully");
    }
}
