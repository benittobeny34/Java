

package jframe;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class subtraction_demo 
{
    public static void main(String arr[])
    {
        addsub obj=new addsub();
    }
}
class addsub extends JFrame implements ActionListener
{
    JTextField j1;
    JTextField j2;
    JButton b1;
    JButton b2;
    JLabel l;
    public addsub() 
    {
        j1=new JTextField(10);
        j2=new JTextField(10);
        b1=new JButton("Add");
        b2=new JButton("SUB");
        l=new JLabel("RESULT");
        add(j1);
        add(j2);
        add(b1);
        add(b2);
        add(l);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        
        setLayout(new FlowLayout());//overcome the cardLayout problem
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        int num1=Integer.parseInt(j1.getText());
        int num2=Integer.parseInt(j2.getText());
        int value=0;
        if(ae.getSource()==b1)
        {
         value=num1+num2;
        }
        if(ae.getSource()==b2)
        {
            value=num1-num2;
        }
        
        l.setText(value + " ");
    }
}
