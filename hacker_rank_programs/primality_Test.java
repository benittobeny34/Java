
package hacker_rank_programs;

import java.math.BigInteger;


public class primality_Test
{
    public static void main(String args[])
    {
      // create 3 BigInteger objects
      BigInteger bi1, bi2, bi3;

      // create 3 Boolean objects
      Boolean b1, b2, b3;

      // assign values to bi1, bi2
      bi1 = new BigInteger("3");
      bi2 = new BigInteger("9");

      // perform isProbablePrime on bi1, bi2
      b1 = bi1.isProbablePrime(1);
      b2 = bi2.isProbablePrime(1);
      b3 = bi2.isProbablePrime(-1);

      String str1 = bi1+ " is prime with certainity 1 is " +b1;
      String str2 = bi2+ " is prime with certainity 1 is " +b2;
      String str3 = bi2+ " is prime with certainity -1 is " +b3;

      // print b1, b2, b3 values
      System.out.println( str1 );
      System.out.println( str2 );
      System.out.println( str3 );
   }
    }

