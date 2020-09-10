/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_demos;

/**
 *
 * @author Benitto Raj
 */
import java.util.*;
public class InputMismatchException
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        try{
           int i = input.nextInt();
           input.nextLine();
           String s = input.nextLine();
            System.out.println("The int is:"+i);
            System.out.println("The string is:"+s);
        }
        catch(NullPointerException ie){
            System.out.println("Please enter some number:"+ie);
        }
        catch(Exception e){
            System.out.println("The type of the error is:"+e);
        }
        
    }
}
