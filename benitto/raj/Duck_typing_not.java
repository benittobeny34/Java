/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benitto.raj;

/**
 *
 * @author Benitto Raj
 */
class Myeditor
{
    void execute(){
                System.out.println("huhi");

    }
}
class Netbeans{
    void execute(){
    }
}
class Laptop
{
    public void code(Myeditor o){
        o.execute();
        
    }
   void execute(){
        
    }
}
public class Duck_typing_not
{
    public static void main(String args[]){
        Myeditor o = new Myeditor();
        Laptop l=new Laptop();
        l.code(o);
    }
}
