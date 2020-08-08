package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PriceCalculator extends JFrame {

	JComboBox cmbModels;
	JRadioButton rbCash, rbCredit;
	JCheckBox cbUps, cbPendrive;
	JLabel lblAmount;

	public PriceCalculator() {
		super("Price Calculator");
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 1));

		cmbModels = new JComboBox<String>(new String[] { "Compaq Presario", "Dell Insipiron", "Hp Pavilion" });

		rbCash = new JRadioButton("Cash", true);
		rbCredit = new JRadioButton("Credit");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rbCash);
		bg.add(rbCredit);

		cbUps = new JCheckBox("UPS");
		cbPendrive = new JCheckBox("Pen Drive");

		lblAmount = new JLabel();
		lblAmount.setHorizontalAlignment(JLabel.CENTER);
		lblAmount.setPreferredSize(new Dimension(150, 30));
		lblAmount.setOpaque(true);
		lblAmount.setBackground(Color.ORANGE);
		lblAmount.setFont(new Font("Verdana", Font.BOLD, 20));

		// add components to layout
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Select Model"));
		p1.add(cmbModels);

		JPanel p2 = new JPanel();
		p2.add(new JLabel("Payment Mode"));
		p2.add(rbCash);
		p2.add(rbCredit);

		JPanel p3 = new JPanel();
		p3.add(cbUps);
		p3.add(cbPendrive);

		JPanel p4 = new JPanel();
		p4.add(lblAmount);

		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);

		// event handlers

		ItemListener itemListener = (e) -> displayPrice();

		cmbModels.addItemListener(itemListener);
		cbUps.addItemListener(itemListener);
		cbPendrive.addItemListener(itemListener);
		rbCredit.addItemListener(itemListener);
		rbCash.addItemListener(itemListener);

		displayPrice(); // get price displayed at the start
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void displayPrice() {
		int prices[] = { 37000, 38000, 40000 };

		int amount;

		amount = prices[cmbModels.getSelectedIndex()];
		if (rbCredit.isSelected())
			amount *= 1.08; // 8% interest

		if (cbUps.isSelected())
			amount += 2000;

		if (cbPendrive.isSelected())
			amount += 500;

		lblAmount.setText(String.valueOf(amount));
	}

	public static void main(String args[]) {
		new PriceCalculator().setVisible(true);
	}

}
