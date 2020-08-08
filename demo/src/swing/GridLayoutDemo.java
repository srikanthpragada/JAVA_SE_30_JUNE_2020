package swing;

import  javax.swing.*;
import  java.awt.*;
public class GridLayoutDemo extends javax.swing.JFrame {
  
    public GridLayoutDemo() {
      super("GridLayout Demo");
      Container c = getContentPane();
      c.setLayout( new GridLayout(0,3));
      
      c.add ( new JButton("Button1"));
      c.add ( new JButton("Button2"));
      c.add ( new JButton("Big Button3"));
      c.add ( new JButton("Button4"));
      c.add ( new JButton("Button5"));
      c.add ( new JButton("Button6"));
      c.add ( new JButton("Button7"));
      
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      setSize(350,200);
      setVisible(true);
   } // end of init
    
    public static void main(String args[]) {
        new  GridLayoutDemo();
    }

   
}
