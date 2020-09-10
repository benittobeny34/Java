
package Hacker_rank;

/**
 *
 * @author Benitto Raj
 */
  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Extra_Long_Factorials 
{   
static void extraLongFactorials(int n) {
        BigInteger fact=BigInteger.valueOf(1);  // this is the method to assign any value to BigInteger;
        while(n > 0){
            fact=fact.multiply(BigInteger.valueOf(n));
                        n--;
        }
        System.out.println(fact);
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      int n = scanner.nextInt();
        

        extraLongFactorials(n);

        scanner.close();
    }
}

    

