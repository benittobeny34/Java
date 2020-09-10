/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
public class varags {
    public static void main(String arr[]){
        display obj=new display();
        obj.show(5,6,6,3,6,3,3);
    }
    
}
                                                 //varags is used for instead of method overloading concept 
                                                  //when we don't know how many argument we send
class display                                     //first search for the exact match while it is not found 
{                                              //then only go the varags statement
    public void show(int ... a)
    {
        for(int i:a)
        System.out.print(i+" ");        
    }
}