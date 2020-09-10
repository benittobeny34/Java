/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
public class swapnumbers_differentway {
    public static void main(String arr[])
    {
        int a=5;
        int b=6;
        b=a+b-(a=b);
        System.out.println("the value is:"+a+"the b value is:"+b);
    }
}
