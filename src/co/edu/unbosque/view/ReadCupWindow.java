package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ReadCupWindow extends JFrame {

	
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JButton bBack;
	private JPanel topPanel;
	private JPanel centerPanel;
	private JLabel title;
	private JLabel logo;
	private JTextArea showInfoCup;
	private JScrollPane scrollShowInfoCup;

	public ReadCupWindow() {
		initComponents();
		setVisible(false);
	}

	public void initComponents() {

		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3 - mostrar pocillos personalizados");
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

		// == CAMPO PARA MOSTRAR==
		showInfoCup = new JTextArea();
		showInfoCup.setBackground(Color.decode("#D6D0E6"));
		showInfoCup.setEditable(false);
		centerPanel.add(showInfoCup);

		scrollShowInfoCup = new JScrollPane(showInfoCup);
		scrollShowInfoCup.setBounds(50, 100, 700, 300);
		scrollShowInfoCup.setBackground(Color.decode("#1F192F"));
		centerPanel.add(scrollShowInfoCup);

		// ==LABELS==
		title = new JLabel("-> Información guardada de pocillos personalizados");
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

	public JTextArea getShowInfoCup() {
		return showInfoCup;
	}

	public void setShowInfoCup(JTextArea showInfoCup) {
		this.showInfoCup = showInfoCup;
	}

	public JScrollPane getScrollShowInfoCup() {
		return scrollShowInfoCup;
	}

	public void setScrollShowInfoCup(JScrollPane scrollShowInfoCup) {
		this.scrollShowInfoCup = scrollShowInfoCup;
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

	/*
	 * public JLabel getTitle() { return title; }
	 * 
	 * public void setTitle(JLabel title) { this.title = title; }
	 */

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

}
