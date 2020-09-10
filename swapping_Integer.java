
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
public class swapping_Integer
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = input.nextInt();
        System.out.println("Enter the value of b:");
        int b = input.nextInt();
        a=a+b-(b=a);
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        input.close();
    }
}
