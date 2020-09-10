
import java.math.BigInteger;
import java.util.Scanner;
//similarly for bigdecimal you can try use BigDecimal

public class BigInteger_example
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        BigInteger b=input.nextBigInteger();
        BigInteger a=input.nextBigInteger();
        BigInteger c =b.add(a);
        BigInteger d=a.subtract(b);
        System.out.println(d);
        System.out.println(c);
        
        
        
    }
}
