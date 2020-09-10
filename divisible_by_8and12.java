
import java.util.Scanner;


public class divisible_by_8and12 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter the Integer to print all the divisible number below that number:");
        int N = input.nextInt();
        System.out.println("The number are both divisibly by 8 and 12 are:");
        for(int i=12;i<=N;i++)
        {
            if(i%8==0&&i%12==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
