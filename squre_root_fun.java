import java.lang.Math;
import java.util.Scanner;
public class squre_root_fun 
{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        int n;
        System.out.println(Math.sqrt(4));
        System.out.println(Math.floor(2.36));
        System.exit(0);
        System.out.println("Enter the number to find out the squre values upto the number:");
        n=s.nextInt();
        for(int i=1;i<n;i++){
            System.out.printf("The squre value of %d  is:%.2f",i,Math.sqrt(i));
            System.out.println();
        }
    }
}
