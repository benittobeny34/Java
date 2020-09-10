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
class beni{
    
    int i,j;
    beni(){
        i=4;j=5;
    }
    void show(){
        System.out.println("Value of i is:"+i+" Value of j is:"+j);
    }
}
public class shallow_copy 
{
    public static void main(String ...args){
        beni b=new beni();
        b.show();
        beni k=b; //this is shallow copy all the properties of b objects is passted to k object.
                 //both are referencing same location.
        k.show(); 
        b.i=20;
        k.j=30;
        b.show();
        k.show();
        
    }
}
