
package hacker_rank_programs;

import java.math.BigInteger;
import java.util.Scanner;

public class primality1_test {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger N = new BigInteger(n);
        boolean result = false;
        result =N.isProbablePrime(1);
        if(result==true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
        scanner.close();
    }
}
