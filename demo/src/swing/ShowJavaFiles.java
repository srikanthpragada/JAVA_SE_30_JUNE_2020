package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ShowJavaFiles extends JFrame {

	JTextField tfDir;
	JButton btnList, btnExit;
	JList<String> lstFiles;
	DefaultListModel<String> files;

	public ShowJavaFiles() {
		super("Java Files");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tfDir = new JTextField(20);
		tfDir.setText("c:\\classroom\\apr7");
		btnList = new JButton("List");
		btnExit = new JButton("Exit");

		JPanel tp = new JPanel();
		tp.add(new JLabel("Directory :"));
		tp.add(tfDir);
		tp.add(btnList);
		tp.add(btnExit);

		// Listbox
		files = new DefaultListModel<String>();
		lstFiles = new JList<String>(files);
		JScrollPane jsp = new JScrollPane(lstFiles, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		Container c = getContentPane();
		c.add(tp, BorderLayout.NORTH);
		c.add(jsp, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);

		// Event handling
		btnList.addActionListener(e -> showFiles());
		btnExit.addActionListener(e -> System.exit(0));

		// Handle double click event for ListBox
		lstFiles.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) // Double click
					showFileContent();
			}
		});
	}

	public void showFileContent() {
		try {
			ShowJavaFileContent f = new ShowJavaFileContent(lstFiles.getSelectedValue());
			f.setSize(700, 400);
			f.setVisible(true);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void showFiles() {
		try {
			Path dir = Paths.get(tfDir.getText());
			files.clear(); // Clear items from model

			Files.walk(dir)
			   .forEach(p -> {
				    if (p.toString().endsWith(".java"))
					    files.addElement(p.toString());
			});
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(),
					"Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void main(String[] args) {
		new ShowJavaFiles();

	}

}
