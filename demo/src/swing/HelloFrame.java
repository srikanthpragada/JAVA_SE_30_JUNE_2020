package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFrame extends JFrame {

	public HelloFrame() {
		super("Hello");
		JLabel lbl = new JLabel("Hello Swing!");
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setFont(new Font("Calibri", Font.BOLD, 30));
		lbl.setForeground(Color.BLUE);
		Container c = this.getContentPane();
		c.add(lbl);
	}
	
	public static void main(String[] args) {
		 HelloFrame f = new HelloFrame();
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setSize(300,300);
		 f.setVisible(true);
	}

}
