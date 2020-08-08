package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class ActionEventDemoWithInnerClass extends JFrame  {
	JButton btnShow;
	JLabel lblMessage;
	
	public ActionEventDemoWithInnerClass() {
		super("ActionEvent Demo with inner class");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		lblMessage = new JLabel();
		btnShow = new JButton("Show Date and Time");
		btnShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                   lblMessage.setText( new Date().toString());
			}
		});
		
		Container c = getContentPane();
		c.add(btnShow, BorderLayout.PAGE_END);
		c.add(lblMessage, BorderLayout.PAGE_START);
	}

	public static void main(String[] args) {
	    ActionEventDemoWithInnerClass f = new ActionEventDemoWithInnerClass();
	    f.setSize(400,200);
	    f.setVisible(true);

	}

}
