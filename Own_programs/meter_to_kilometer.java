/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Own_programs;

import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
public class meter_to_kilometer 
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the meteres to convert to kilometer:");
        long meter=input.nextLong();
        System.out.println("The respective kilometer for "+meter+" is:"+meter/1000+"km");
        input.close();
    }
}
