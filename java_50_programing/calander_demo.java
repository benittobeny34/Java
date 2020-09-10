package java_50_programing;
import java.util.Scanner;
public class calander_demo {
     public static void main(String args[])
    {
    int day,month,year;
    Scanner input = new Scanner(System.in);
        day = input.nextInt();
        month = input.nextInt();
        year = input. nextInt();
        String s=calculate(day,month,year);
        System.out.println("The day on "+day+":"+month+":"+year+" is "+s);
    }
    private static String calculate(int day,int month,int year)
    {        
     int pyear=year-1;
     int odd=0;
     pyear = pyear%400; 
     int temp=pyear;
     pyear=pyear/100;
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
        pyear=temp;
        pyear = pyear%100;
        temp=pyear;
        pyear=pyear/4;
        odd=(pyear*2)+odd;
        pyear = temp-pyear;
        odd = (pyear*1)+odd;
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
     odd=odd+day;
     odd=odd%7;
         if(odd==0)return "sunday";
         else if(odd==1)return "monday";
         else if(odd==2) return "tuesday";
         else if(odd==3) return "wednesday";
         else if(odd==4) return "thursday";
         else if(odd==5) return "friday";
         else   return "saturday";   
    }    
}
