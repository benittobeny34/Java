
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
public class money_calculate 
{
    public static void main(String ...agrs){
        int $1;
        int $2,$half;
        int $5;
        System.out.println("Enter the number of 100 rupee notes");
        Scanner input = new Scanner(System.in);
        $1=input.nextInt();
        System.out.println("Enter the number of 200 rupee notes");
        $2=input.nextInt();
        System.out.println("Enter the number of 50 rupee notes");
        $half=input.nextInt();
        System.out.println("Enter the number of 500 rupee notes");
        $5=input.nextInt();
        long tot;
        tot=($1*100)+($5*500)+($half*50)+($2*200);
        tot+=10000;
        System.out.println("The total amount of money is:"+tot);
        
        input.close();
    }
}
