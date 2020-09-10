import java.util.Scanner;
public class perfect_Number {
    public static void main(String arr[])
    {
        int number;
        int remainder;
        int  reverse_number=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        number=input.nextInt();
        while(number>0)
        {
            remainder=number%10;
            reverse_number=remainder+reverse_number*10;
            number=number/10;
            
        }
        System.out.println("The reverse number is:"+reverse_number);
    }
    
}
