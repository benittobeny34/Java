
package jframe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class choice_button 
{
    public static void main(String arr[])
    {
        RadioDemo r = new RadioDemo();
    }
}
class RadioDemo extends JFrame
{
    JTextField t1;
    JButton b1;
    JRadioButton r1,r2;
    JLabel l;
    JCheckBox c1,c2;
    public RadioDemo()
    {
        t1 = new JTextField(5);
        b1 = new JButton("Ok");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l = new JLabel("Greeting");
        c1 = new JCheckBox("dancing");
        c2 = new JCheckBox("sports");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        add(c1);
        add(c2);
          add(t1);
        add(r1);
        add(r2);
        add(b1);
        add(l);
        setLayout(new FlowLayout());//overcome the cardLayout problem
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c1.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                System.out.println("Dancer");
            }
         

           
        });
        
        b1.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent ae)
           {
               String name = t1.getText();
               if(r1.isSelected())// we can use also ae.getSource() 
               {
                   name = "Mr. "+name; 
               }
               else
               {
                   name = "Ms. "+name;
               }
               name = name+" knowns ";
               if(c1.isSelected())
               {
                   name = name+"dancing";
               }
               if(c2.isSelected())
               {
                   name = name+" sports ";
               }
               l.setText(name);
               
           }

           
            
        });
          }
    
}
