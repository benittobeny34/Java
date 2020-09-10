/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
import java.net.*;
import java.io.*;
public class client 
{
 public static void main(String args[]) throws Exception
 {
     Socket s = new Socket("localhost",568);
    
     DataOutputStream dos = new DataOutputStream(s.getOutputStream());
     DataInputStream dis = new DataInputStream(s.getInputStream());
     int msg = dis.readInt();
     System.out.println(msg);
 }
}
