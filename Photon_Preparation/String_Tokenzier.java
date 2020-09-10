/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Photon_Preparation;

/**
 *
 * @author Benitto Raj
 */
import java.util.StringTokenizer;
public class String_Tokenzier
{
    public static void main(String args[])
    {
        String string = "Hello_Programming_How are_You";
        StringTokenizer str = new StringTokenizer(string,"_");
        while(str.hasMoreTokens()){
            String token = str.nextToken();
            System.out.println(token);
        }
    }
}
