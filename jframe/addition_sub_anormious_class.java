
package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class addition_sub_anormious_class
{
    public static void main(String arr[])
    {
       ADDandSUB obj=new ADDandSUB(); 
    }
}
class ADDandSUB extends JFrame
{
    JTextField j1;
    JTextField j2;
    JButton b1;
    JButton b2;
    JLabel l;
    int value;
    int num1,num2;
    public ADDandSUB()
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
        setLayout(new FlowLayout());//overcome the cardLayout problem
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        b1.addActionListener((ActionEvent ae) -> {//use lambda expression
            num1=Integer.parseInt(j1.getText());
            num2=Integer.parseInt(j2.getText());
            value=num1+num2;
            l.setText(value + " ");
      } //anormious object for addition
      );
        
        b2.addActionListener(new ActionListener() //anormious object for subtraction
                {
                              public void actionPerformed(ActionEvent ae) 
                              {
                                num1=Integer.parseInt(j1.getText());
                                num2=Integer.parseInt(j2.getText());
                                value=num1-num2;
                                l.setText(value + " ");
                              }
                 }
        );
   
    }
}
