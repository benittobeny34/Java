/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import javax.swing.*;
import java.awt.*;  //awt abstract windowing tool

/**
 *
 * @author PAULRAJ
 */
public class jframe1_demo 
{
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
    
    public jframe1_demo()
    {
        gui();
        
    }
    public void gui()
    {
       f = new JFrame("benitto.jframe");
        f.setVisible(true);
        f.setSize(550,550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p = new JPanel();
        p.setBackground(Color.yellow);
        
        b1=new JButton("TEST");
        lab = new JLabel("there is test Label:");
        
        p.add(b1);
        p.add(lab);
        
        f.add(p,BorderLayout.NORTH);
    }
    public static void main(String arr[])
    {
        jframe1_demo obj=new jframe1_demo();
    }
}
