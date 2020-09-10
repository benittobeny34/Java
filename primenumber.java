import java.util.Scanner;
public class primenumber {
    public static void main(String arr[])
    {
        int number,i,count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        number=input.nextInt();
        for(i=1;i<number;i++)
        {
            if(number%i==0)
                count++;
        }
        if(count==1)
            System.out.println("The number "+number+" is prime number");
        else
            System.out.println("The number "+number+" is not a prime number");
            
    }
    
}
