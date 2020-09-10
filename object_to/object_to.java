/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_to;

/**
 *
 * @author Benitto Raj
 */
public class object_to {
    public static void main(String[] args) {
        Object o = "878";//error we can't type cast object to int
        try{
        int n=(int)o;
        System.out.println(n);
        }catch(Exception e){
            System.out.println("The error is:"+e);
        }
        
    }
}
