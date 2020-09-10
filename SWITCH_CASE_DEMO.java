import java.util.Scanner;
public class SWITCH_CASE_DEMO {
    public static void main(String arr[]){
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of i:");
        i=input.nextInt();
        switch(i)
        {
            case 1:{System.out.println("you entered one:");break;}
            case 2:{System.out.println("You  entered two:");break;}
            case 3:{System.out.println("You entered three:");break;}
            case 4:{System.out.println("you entered four:");break;}
            default: System.out.println("you entered number is not FOUND!!!!!!!!!");
        }
        
    }
    
}
