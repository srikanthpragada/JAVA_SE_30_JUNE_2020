package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class DigitalClock extends JFrame {
	Timer t;
	JLabel lblTime;

	public DigitalClock() {
		super("Digital Clock");
		lblTime = new JLabel();
		lblTime.setHorizontalAlignment(JLabel.CENTER);
		lblTime.setFont(new Font("Arial", Font.BOLD, 30));
		lblTime.setForeground(Color.RED);
		Container c = getContentPane();
		c.add(lblTime);
		
		lblTime.setText(getTime());

		t = new Timer(1000,e -> lblTime.setText(getTime()));
		t.start();

		setSize(300, 150);
	}
	
	public String getTime() {
		return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	public static void main(String args[]) {
		DigitalClock f = new DigitalClock();
		f.setVisible(true);
	}

}
