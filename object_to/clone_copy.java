/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_to;

/**
 *
 * @author Benitto Raj
 */import java.util.*;
class A{
    int i,j,k;
    A(int i,int j){
        this.i=i;
        this.j=j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of k is:");
        k=s.nextInt();
        
    }
    void show(){
        System.out.println("The value of i is:"+i+" Value of j is:"+j);
        System.out.println("The value of k is:"+k);
    }
}
public class clone_copy 
{
    public static void main(String ...args){
        A a=new A(10,20);
        
        a.show();
        A b=a;
    }
}
