
package Exception_demos;

import java.util.Scanner;

public class throw_keyword_demo 
{
  public static void main(String arg[])
  {
      int i,j,k;
      Scanner input  =new Scanner(System.in);
      System.out.println("Enter the value of i and j:");
      i=input.nextInt();
      j=input.nextInt();
      k=i+j;
      try{
      if(k<10)
      {
          throw new ArithmeticException();
      }
      System.out.println("The value of k is:"+k);
      }
      catch(ArithmeticException e)
      {
          System.out.println("MINIMUM VALUE IS REQURIED IS 10");    
      }
       
       finally{
          input.close();
      }
      
  }
  
}
