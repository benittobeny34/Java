
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
public class hastable
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Hashtable<String,String> h=new Hashtable<>();
        h.put(s.nextLine(),"");
        h.put(s.nextLine(),"");
        h.put(s.nextLine(),"");
        Enumeration<String> e=h.keys();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
        
        
    }
}
