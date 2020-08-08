package swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
	JLabel l1;
	JTextField tfEmail;
	JButton b1, b2;

	public FlowLayoutDemo() {
		super("FlowLayout Demo");
		l1 = new JLabel("Email Address");
		tfEmail = new JTextField(20);
		b1 = new JButton("Register");
		b2 = new JButton("Cancel");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(l1);
		c.add(tfEmail);
		c.add(b1);
		c.add(b2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setVisible(true);
	} // end of init

	public static void main(String args[]) {
		new FlowLayoutDemo();
	}
}
