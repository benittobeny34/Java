
package jframe;
import java.awt.*;
import javax.swing.*;
public class j1_demo
{
   static  JLabel l;
   static JLabel l1;
    public static void main(String arr[])
    {
        JFrame obj=new JFrame("JFrame");
        JPanel jp =new JPanel();
        obj.setBackground(Color.red);
        obj.setLayout(new FlowLayout());//overcome the cardLayout problem
         obj.setBackground(Color.red);
       obj. setVisible(true);
       obj.setBounds(10,10,450,450);
        obj.setSize(500, 500);
       l=new JLabel("test");
       l1=new JLabel("test1");
       obj.add(l);
       obj.add(l1);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    }
}


