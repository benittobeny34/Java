
package jframe;
import java.awt.*;
import javax.swing.*; //it contains jframe,japanel,jbutton ......
public class swing1_demo
{
    public static void main(String arr[])
    {
        swingdemo obj=new swingdemo();
//        obj.setVisible(true);
//        obj.setSize(500,500);
    }
    
}


class swingdemo extends JFrame  //CardLayout it means override the helloworld in 23 line
{
  
    public swingdemo()
    {
       JTextField m=new  JTextField(1);
       JButton b=new JButton("ok");
       add(m);
       add(b);
        JLabel l=new JLabel("Hello word:");
        JLabel l1=new JLabel("welcome benitto:");
        add(l);
        add(l1);
         setLayout(new FlowLayout());//overcome the cardLayout problem
         setVisible(true);
         setSize(500,500);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
}
  
