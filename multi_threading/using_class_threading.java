/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_threading;

/**
 *
 * @author PAULRAJ
 */
public class using_class_threading extends Exception
{
    public static void main(String arr[]) 
    {
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        obj1.start();
        try{Thread.sleep(10);}catch(Exception e){};
        obj2.start();
      
    }
}

class Hi extends Thread
{
    public void run()
    {
        for(int i=0 ; i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch(Exception e){};
        }
    }
}
class Hello extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
          try{ Thread.sleep(1000);}catch(Exception e){};
        }
    }
}