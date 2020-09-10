import java.util.Scanner;
public class PrintRowNumbers {
    public static void main(String arr[])
    {
        int i,j,n;
        System.out.println("Enter the value of n :");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
