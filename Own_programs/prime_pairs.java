//QUESTION DESCRIPTION 
 /*
 given a even number greater than 2 and you will find out two prime numbers that sum is equal to that number .
*/
package Own_programs;

import java.util.Scanner;


public class prime_pairs
{
    public static void main(String ...args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int i=3,j=0;
        int primes[]=new int[number/2];
        int num1=0;
        boolean get=false;
        while(i<number){
            if (isprime(i))
            {           
              num1=i;             
              primes[j]=num1;   
              num1=0;
                  for(int k=0;k<j;k++){
                      for(int m=1;m<=j;m++){
                          //System.out.println("k and m values are "+k+" "+m);
                          if(primes[k]+primes[m]==number)
                          {
                              System.out.println("Pair is:"+primes[k]+" "+primes[m]);
                              get = true;
                              break;
                          }
                      }
                      if (get==true) break;
                  }
                  if(get==true) break;
                  j++;
              }
            i += 2;
            }
             
        }
        
    
    public static boolean isprime(int n)
    {
        int i=2;
        for(;i<n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
