package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ExitListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
          System.exit(0);
	}
}
 
public class ActionEventDemoWithAnotherClass extends JFrame  {
	JButton btnExit;
	
	public ActionEventDemoWithAnotherClass() {
		super("ActionEvent Demo");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ExitListener());
		Container c = getContentPane();
		c.add(btnExit, BorderLayout.PAGE_END);
	}

	public static void main(String[] args) {
	    ActionEventDemoWithAnotherClass f = new ActionEventDemoWithAnotherClass();
	    f.setSize(400,200);
	    f.setVisible(true);

	}

}
