package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class ActionEventDemoWithLambda extends JFrame  {
	JButton btnShow;
	JLabel lblMessage;
	
	public ActionEventDemoWithLambda() {
		super("ActionEvent Demo with Lambda");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		lblMessage = new JLabel();
		btnShow = new JButton("Show Date and Time");
		btnShow.addActionListener( e ->  lblMessage.setText( new Date().toString()));
		Container c = getContentPane();
		c.add(btnShow, BorderLayout.PAGE_END);
		c.add(lblMessage, BorderLayout.PAGE_START);
	}

	public static void main(String[] args) {
	    ActionEventDemoWithLambda f = new ActionEventDemoWithLambda();
	    f.setSize(400,200);
	    f.setVisible(true);

	}

}
