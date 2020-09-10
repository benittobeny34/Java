
package java_50_programing;

import java.util.Scanner;


public class The_calender_day
{
    public static void main(String args[])
    {
    int day,month,year;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the day ,month and year:");
        day = input.nextInt();
        month = input.nextInt();
        year = input. nextInt();
        String s=calculate(day,month,year);
        System.out.println("The day on "+day+":"+month+":"+year+" is "+s);
    }
    private static String calculate(int day,int month,int year)
    { 
        System.out.println("The month you enteted is:"+month);
     int pyear=year-1;
     int odd=0;
     pyear = pyear%400; //2018%400----->18
        System.out.println("The first 400 modulo year is:"+pyear);
     int temp=pyear; //temp = 18
     pyear=pyear/100; //18/100----->0
        System.out.println("The second 100 divide year is:"+pyear);
        switch (pyear) {
            case 1:
                odd=5;
                break;
            case 2:
                odd=3;
                break;
            case 3:
                odd=1;
                break;
        }
        System.out.println("First total odd:"+odd);
        pyear=temp; //pyear=18
        pyear = pyear%100; //18%100---->18
        temp=pyear;
        System.out.println("The third 100 modulo year is"+pyear);
        pyear=pyear/4;//18/4--->4
        System.out.println("The fourth 4 divide year is :"+pyear);
        odd=(pyear*2)+odd;
        System.out.println("Leap total odd:"+odd);
        
        pyear = temp-pyear;
        System.out.println("The fifth 4 modulo year is:"+pyear);
        odd = (pyear*1)+odd;
        System.out.println("leap + normal odd:"+odd);
        System.out.println("The month - 1 is :"+(month-1));
         switch(month-1) {
             case 11: odd+=30;
             case 10: odd+=31;
             case 9: odd+=30; 
             case 8:odd+=31; 
             case 7:odd+=31; 
             case 6: odd+=30;
             case 5: odd+=31;
             case 4:odd+=30;
             case 3: odd+=31;
             case 2: {
                        if(year%4==0) odd+=29;
                        else odd+=28;
                       
                       }
             case 1: odd+=31;
             case 0: break;
         }
     
        System.out.println("ODd after month:"+odd);
     odd=odd+day;
        System.out.println("ODD after dayZ:"+odd);
    // odd=odd-3;
     odd=odd%7;
    
        System.out.println("The final odd value is:"+odd);
     
         if(odd==0)return "sunday";
         else if(odd==1)return "monday";
         else if(odd==2) return "tuesday";
         else if(odd==3) return "wednesday";
         else if(odd==4) return "thursday";
         else if(odd==5) return "friday";
         else   return "saturday";
     
    }
  
}
