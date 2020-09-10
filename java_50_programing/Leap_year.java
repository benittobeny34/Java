
package java_50_programing;

import java.util.Scanner;


public class Leap_year 
{
  public static void main(String args[])
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the year to check Leap year:");
      int Year = input. nextInt();
      if(Year%400==0)
      {
          System.out.println(Year+" is a leap year:");
      }
      else if(Year%100==0)
      {
          System.out.println(Year+" is not a leap year:");
      }
      else if(Year%4==0)
      {
          System.out.println(Year+" is a leap year:");
      }
      else 
          System.out.println(Year+ " is not leap year:");
  }
}
