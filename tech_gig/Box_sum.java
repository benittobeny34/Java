/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech_gig;

public class Box_sum
{
    public static void main(String args[])
    {
//        box box1 = new box();
//        box box2 = new box();
//        box1.height=1;
//        box2.width=2;
//        box2=box1;
//        double STATIC  =2.5;
//        System.out.println(STATIC);
       // System.out.println(box2.height);
//        int[] a = new int[4];
//        a[1]=1;
//         System.out.println("The size of a is before:"+a.length);
//        System.out.println("a [1] is before:"+a[1]);
//        a = new int[2];
//        System.out.println("The size of a is:"+a.length);
//        
//        System.out.println("a[1] is :"+a[1]);
      int ans=  Box_sum.m(3);
        System.out.println("The answer is:"+ans);
    }
    public static int m(int val){
        if (val==0) return 1;
        else return 3*val*(val-1)+m(val-1);
    }
}

class box{
 int height;
 int width;
}
