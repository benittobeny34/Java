/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_demos;

/**
 *
 * @author Benitto Raj
 */
public class argument_exception 
{
  public static void main(String args[])
  {
      System.out.println("The sum is:"+sum(1,2,3,4,5,6,7,8,9,10)); 
      System.out.println("The sum is:"+sum(1,2,3,4,5,6,7,8,9,10)); 
  }
  static int sum(int ...var)
  {
      int sum=0;
      for (int i:var)
              {
          sum+=i;
        }
      return sum;
      
  }
}
