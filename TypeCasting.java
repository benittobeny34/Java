/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
public class TypeCasting
{
    public static void main(String args[])
    {
        int n=5;
        System.out.println("The n value is:"+n);
        Object o = n;//int---------------->object
        
       
        System.out.println(o);
        String s = o.toString();
        System.out.println("The string is:"+s);
        double d = (double)n;//int-------------->double
        System.out.println(d);
       
        
    }
}
