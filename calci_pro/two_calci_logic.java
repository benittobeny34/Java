
package calci_pro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class two_calci_logic extends JFrame implements ActionListener
{
  JTextField f1,f2;
    JButton plus;
    JButton minus;
    JButton mul;
    JButton div;
    JLabel ans;
    JButton equal,one,two,three,four,five,six,seven,eight,nine,zero;
     public void  procedure()
     {
        
        f1= new JTextField(25);
        add(f1);
//        f2 = new JTextField(25);
//        add(f2);
        one = new JButton("1");
       // one.set(1,1,111,2222);
        add(one);
        two = new JButton("2");
        add(two);
        three = new JButton("3");
        add(three);
        four = new JButton("4");
        add(four);
        five = new JButton("5");
        add(five);
        six = new JButton("6");
        add(six);
        seven = new JButton("7");
        add(seven);
        eight = new JButton("8");
        add(eight);
        nine = new JButton("9");
        add(nine);
        zero = new JButton("0");
        add(zero);
         plus = new JButton("+");
        add(plus);
        minus = new JButton("-");
        add(minus);
        mul = new JButton("X");
        add(mul);
        div = new JButton("/");
        add(div);
        ans= new JLabel("ans");
        equal = new JButton("=");
       add(equal);
       add(ans);
        plus.addActionListener(this);
        minus.addActionListener( this);
        mul.addActionListener(this);
        div.addActionListener (this);
        equal.addActionListener(this);
         one.addActionListener(this);
        two.addActionListener( this);
        three.addActionListener(this);
        four.addActionListener (this);
        five.addActionListener(this);
         six.addActionListener(this);
        seven.addActionListener( this);
        eight.addActionListener(this);
        nine.addActionListener (this);
        zero.addActionListener(this);
         setLayout(new FlowLayout());//overcome the cardLayout problem
         setVisible(true);
         setSize(500, 500);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
  
     
    @Override
      public void actionPerformed(ActionEvent ae)
      {
          if(ae.getSource()==one)
          {
              f1.showText()=1;
          }
              int num1 = Integer.parseInt(f1.getText());
              int num2 = Integer.parseInt(f1.getText());
              int value=0;
              if(ae.getSource()==plus)
              {
                  value=num1+num2;
              }
              if(ae.getSource()==minus)
              {
                value=num1-num2;   
              }
              if(ae.getSource()==mul)
              {
                  value=num1*num2; 
              }
              if(ae.getSource()==div)
              {
                  value=num1/num2; 
              }
              if(ae.getSource()==equal)
              {
                  ans.setText(value+" ");
              }
              ans.setText(value+" ");
     }
}



