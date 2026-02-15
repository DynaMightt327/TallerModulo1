package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ReadCandyWindow extends JFrame {

	
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JButton bBack;
	private JPanel topPanel;
	private JPanel centerPanel;
	private JLabel title;
	private JLabel logo;
	
	private JTextArea showInfoCandy;
	private JScrollPane scrollShowInfoCandy;

	public ReadCandyWindow() {
		initComponents();
		setVisible(false);
	}

	public void initComponents() {

		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3 - mostrar ancheta de dulces");
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
		
		//== CAMPO PARA MOSTRAR==
		showInfoCandy = new JTextArea();
		showInfoCandy.setBackground(Color.decode("#D6D0E6"));
		showInfoCandy.setEditable(false);
		centerPanel.add(showInfoCandy);

		scrollShowInfoCandy = new JScrollPane(showInfoCandy);
		scrollShowInfoCandy.setBounds(50, 100, 700, 300);
		scrollShowInfoCandy.setBackground(Color.decode("#1F192F"));
		centerPanel.add(scrollShowInfoCandy);

		// ==BOTONES==
		bBack = new JButton("VOLVER");
		bBack.setBounds(10, 575, 100, 30);
		bBack.setFont(new Font("Agency FB", Font.BOLD, 22));
		bBack.setBackground(Color.decode("#ECE7FE"));
		bBack.setForeground(Color.decode("#130344"));
		bBack.setBorderPainted(false);
		bBack.setFocusPainted(false);
		add(bBack);

		//==LABELS==
		title = new JLabel("-> Información guardada de regalos dulces");
		title.setBounds(85, 25, 700, 50);
		title.setForeground(Color.decode("#18093E"));
		title.setFont(new Font("Agency FB", Font.BOLD, 40));
		centerPanel.add(title);
		
		logo = new JLabel("LUCKY J3");
		logo.setBounds(330, 15, 550, 100);
		logo.setForeground(Color.decode("#18093E"));
		logo.setFont(new Font("Agency FB", Font.BOLD, 70));
		topPanel.add(logo);
		
		// ==IMAGES==
		ImageIcon imageOne = new ImageIcon(getClass().getResource("foto.jpg"));
		lImageOne = new JLabel(imageOne);
		lImageOne.setBounds(40, 0, 200, 160);
		topPanel.add(lImageOne);

		ImageIcon imageTwo = new ImageIcon(getClass().getResource("foto.jpg"));
		lImageTwo = new JLabel(imageTwo);
		lImageTwo.setBounds(650, 0, 200, 160);
		topPanel.add(lImageTwo);
	}

	public JLabel getlImageOne() {
		return lImageOne;
	}

	public void setlImageOne(JLabel lImageOne) {
		this.lImageOne = lImageOne;
	}

	public JLabel getlImageTwo() {
		return lImageTwo;
	}

	public void setlImageTwo(JLabel lImageTwo) {
		this.lImageTwo = lImageTwo;
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

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	/*public JLabel getTitle() {
		return title;
	}*/

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JTextArea getShowInfoCandy() {
		return showInfoCandy;
	}

	public void setShowInfoCandy(JTextArea showInfoCandy) {
		this.showInfoCandy = showInfoCandy;
	}

	public JScrollPane getScrollShowInfoCandy() {
		return scrollShowInfoCandy;
	}

	public void setScrollShowInfoCandy(JScrollPane scrollShowInfoCandy) {
		this.scrollShowInfoCandy = scrollShowInfoCandy;
	}

}
