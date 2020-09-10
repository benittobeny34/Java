package jframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class jframe2_demo
{
    public static void main(String arr[])
    {
        
     Addition obj=new Addition();   
    }
}


class Addition extends JFrame  implements ActionListener
{
     JTextField t1;
     JTextField t2;
       JButton b;
       JLabel l;
    public Addition()
    {
        
        t1 = new JTextField(5);
         t2 = new JTextField(5);
          b=new JButton("OK");
         l= new JLabel("result");
        setLayout(new FlowLayout());//overcome the cardLayout problem
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(t1);
        add(t2);
        add(b);
        add(l);
        b.addActionListener(this);
        }
    public void actionPerformed(ActionEvent ae)
    {
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value=num1+num2;
        l.setText(value+"");
    }
}
