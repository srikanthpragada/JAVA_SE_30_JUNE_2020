package swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutDemo extends JFrame {

	public BorderLayoutDemo() {
		super("BorderLayout Demo");
		// default layout manager is BorderLayout
		Container c = getContentPane();
		c.add(new JButton("Top Button"), BorderLayout.PAGE_START);
		c.add(new JButton("Bottom Button"), BorderLayout.PAGE_END);
		c.add(new JButton("Left Button"), BorderLayout.LINE_START);
		c.add(new JButton("Right Button"), BorderLayout.LINE_END);
		// place multiple components at the center using JPanel
		JPanel p = new JPanel(); // default FlowLayout
		p.add(new JLabel("Label"));
		p.add(new JTextField(20));
		p.add(new JButton("Go"));
		
		c.add(p); // CENTER

		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String args[]) {
		new BorderLayoutDemo();
	}

}
