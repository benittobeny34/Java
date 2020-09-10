/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
public class XOR_swap_operation {
    public static void main(String arr[])
    {
        int a=6;
        int b=3;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("the value of a is:"+a);
        System.out.println("the value of b is:"+b);
    }
    
}
