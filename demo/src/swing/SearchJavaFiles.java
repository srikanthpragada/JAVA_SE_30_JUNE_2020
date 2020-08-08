package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchJavaFiles extends JFrame {

	private JTextField tfStartDir, tfString;
	private JTextArea taFiles;
	private JButton btnSearch;

	public SearchJavaFiles() {
		super("Search Java Files");
		tfStartDir = new JTextField(20);
		tfString = new JTextField(20);
		taFiles = new JTextArea();
		taFiles.setEditable(false); // readonly

		JScrollPane sp = new JScrollPane(taFiles,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(e -> searchFiles());

		// arrange layout
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Start Directory:"));
		p1.add(tfStartDir);
		p1.add(new JLabel("Search String :"));
		p1.add(tfString);
		p1.add(btnSearch);


		Container c = getContentPane();
		c.add(p1, BorderLayout.PAGE_START);
		c.add(sp); // center
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		SearchJavaFiles f = new SearchJavaFiles();
		f.setSize(800, 400);
		f.setVisible(true);
	}

	private void searchFiles() {
		try {
			taFiles.setText("");
			Path startDir = Path.of(tfStartDir.getText());
			Files.walk(startDir)
			     .filter( p -> p.toAbsolutePath().toString().endsWith(".java"))
			     .forEach(p -> processFile(p));
			     
		} catch (Exception ex) {
		}
	}
	
	private void processFile(Path file) {
		String searchString = tfString.getText();
		try {
			if (Files.readString(file).contains(searchString) )
				taFiles.append(file.toAbsolutePath().toString() + "\n");
		}
		catch(Exception ex) {
			
		}
	}
}
