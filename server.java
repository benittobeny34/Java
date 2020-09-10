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
public class server
{
    public static void main(String[] args)throws Exception
    {
        ServerSocket ss = new ServerSocket(568);
        Socket s =ss.accept();
        DataInputStream dis1 = new DataInputStream(System.in);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        System.out.println("ENter the data to be send:");
        int msg = dis1.readInt();
        dos.writeInt(msg);
    }
}
