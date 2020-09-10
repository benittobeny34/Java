/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;
import javax.swing.JFrame;
public class brickbracker
{
    public static void main(String arr[])
    {
        JFrame obj=new JFrame("break  out ball");
        gameplay gameobj=new gameplay();
        obj.setBounds(10,10,700,600);
        //obj.setTitle("Breakout Ball:");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameobj);
    }
}
