import java.math.BigInteger;
import java.util.Scanner;
public class BigIntergerSum {
    public static void main(String arr[])
    {
      /*  BigInteger i=new BigInteger("47694575375354386567495747574574759475347597764635793594754345749754");
        BigInteger j=new BigInteger("1");
        BigInteger sum=i.add(j);*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the two bigInteger:");
        BigInteger i=input.nextBigInteger();
        BigInteger j=input.nextBigInteger();
        BigInteger sum=i.add(j);
        //to  subtract=i.subtract(j);
        //to multiplication=i.multiply(j);
        //to  divide=i.divide(j);
        System.out.println("The big sum is:"+sum);
    }
     	
}
