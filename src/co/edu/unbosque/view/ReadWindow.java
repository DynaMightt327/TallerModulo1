package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReadWindow extends JFrame {

	private JButton bBack;
	private JPanel topPanel;
	private JLabel logo;
	private JPanel centerPanel;
	private JLabel lImageOne;
	private JLabel lImageTwo;

	public ReadWindow() {
		initComponents();
		setVisible(false);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3");
		this.setBounds(250, 30, 880, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#ECE7FE"));

		// ==PANELES==
		topPanel = new JPanel();
		topPanel.setLayout(null);
		topPanel.setBounds(0, 0, 880, 120);
		topPanel.setBackground(Color.decode("#B7AADF"));
		add(topPanel);

		centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBounds(30, 150, 800, 420);
		centerPanel.setBackground(Color.decode("#B7AADF"));
		add(centerPanel);

		// ==BOTONES==
		bBack = new JButton("VOLVER");
		bBack.setBounds(10, 575, 100, 30);
		bBack.setFont(new Font("Agency FB", Font.BOLD, 22));
		bBack.setBackground(Color.decode("#ECE7FE"));
		bBack.setForeground(Color.decode("#130344"));
		bBack.setBorderPainted(false);
		bBack.setFocusPainted(false);
		add(bBack);

		// == LABELS==
		logo = new JLabel("LUCKY J3");
		logo.setBounds(330, 15, 550, 100);
		logo.setForeground(Color.decode("#18093E"));
		logo.setFont(new Font("Agency FB", Font.BOLD, 70));
		topPanel.add(logo);
		
		//==IMAGES==
		ImageIcon imageOne = new ImageIcon(getClass().getResource("foto.jpg"));
		lImageOne = new JLabel(imageOne);
		lImageOne.setBounds(40, 0, 200, 160);
		topPanel.add(lImageOne);
		
		ImageIcon imageTwo = new ImageIcon(getClass().getResource("foto.jpg"));
		lImageTwo = new JLabel(imageTwo);
		lImageTwo.setBounds(650, 0, 200, 160);
		topPanel.add(lImageTwo);

	}

	public JButton getbBack() {
		return bBack;
	}

	public void setbBack(JButton bBack) {
		this.bBack = bBack;
	}

	public JPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(JPanel topPanel) {
		this.topPanel = topPanel;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

}
