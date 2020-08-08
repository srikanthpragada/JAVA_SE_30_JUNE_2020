package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListDemo extends JFrame {

	DefaultListModel<String> data;
	JList<String> lst;
	JButton btnAdd, btnRemove, btnList, btnClear;

	public ListDemo() {
		super("List Demo");
		data = new DefaultListModel<String>(); // mutable list data model
		data.addElement("Bill Gates");
		data.addElement("Larry Ellison");
		data.addElement("Micheal Dell");
		data.addElement("Larry Page");
		data.addElement("Sergey Brin");
		lst = new JList<String>(data);

		btnAdd = new JButton("Add");
		btnRemove = new JButton("Remove");
		btnList = new JButton("List");
		btnClear = new JButton("Unselect");

		Container c = getContentPane();
		JScrollPane jsp = new JScrollPane(lst,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		c.add(jsp, "Center");

		JPanel p = new JPanel();
		p.add(btnAdd);
		p.add(btnRemove);
		p.add(btnList);
		p.add(btnClear);
		c.add(p, BorderLayout.PAGE_END);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		
		// btnClear.addActionListener( e -> lst.clearSelection());
		

		ActionListener action = evt -> {
			// did user click on unselect button 
			if (evt.getSource() == btnClear) {
				lst.clearSelection();
			} else if (evt.getSource() == btnAdd) {
				String name = JOptionPane.showInputDialog(this,
						"Enter a name:", "Add", 
						JOptionPane.PLAIN_MESSAGE);
				if (name != null) {
					data.addElement(name);
				}
			} else if (evt.getSource() == btnList) {
				List<String> items = lst.getSelectedValuesList();
				if (items.size() == 0 )
					return;
				String st = String.join("\n", items);
				JOptionPane.showMessageDialog(this, st, 
						"Selected Items", JOptionPane.INFORMATION_MESSAGE);
			} else if (evt.getSource() == btnRemove) {
				List<String> items = lst.getSelectedValuesList();
				if (items.size() == 0 )
					return;
				int res = JOptionPane.showConfirmDialog(this, 
						"Do you want to delete selected items?",
						"Confirm",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);

				if (res == JOptionPane.YES_OPTION) {
					lst.getSelectedValuesList()
					   .forEach(name -> data.removeElement(name));
				}
			}
		};
		
		btnAdd.addActionListener(action);
		btnRemove.addActionListener(action);
		btnList.addActionListener(action);
		btnClear.addActionListener(action);
	}

	public static void main(String args[]) {
		new ListDemo().setVisible(true);
	}
}