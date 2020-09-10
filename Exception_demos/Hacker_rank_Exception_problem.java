/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_demos;

import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
class MyCalculator
{
    public static int power(int n,int p) throws Exception
    {
        if(n<0|| p<0) throw new Exception ("n or p should not be negative ");
        if(n==0&&p==0) throw new Exception ("n and p should not be zero");
        else  return ((int)Math.pow(n,p));
    }
}

public class Hacker_rank_Exception_problem
{
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String args[])
    {
        while(in.hasNext())
        {
            int n=in.nextInt();
            int p=in.nextInt();
            try{
                System.out.println(my_calculator.power(n,p));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
