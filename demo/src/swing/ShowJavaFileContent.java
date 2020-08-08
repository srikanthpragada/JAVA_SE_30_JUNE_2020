package swing;

import java.awt.Container;
import java.awt.Font;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowJavaFileContent extends JFrame {
	private JTextArea taContents;

	public ShowJavaFileContent(String filename) throws Exception {
		super(filename);
		taContents = new JTextArea();
		taContents.setEditable(false);
		taContents.setFont(new Font("consolas",Font.PLAIN, 14));

		JScrollPane sp = new JScrollPane(taContents, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		Container c = getContentPane();
		c.add(sp); // center
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Path path = Paths.get(filename);
		taContents.setText(Files.readString(path));
		taContents.setCaretPosition(0);
	}
}
