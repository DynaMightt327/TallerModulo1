package co.edu.unbosque.view;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateProductWindow extends JFrame {

	private JButton bBack;
	private JPanel topPanel;
	private JLabel logo;
	private JPanel centerPanel;
	
	private JLabel lImageOne;
	private JLabel lImageTwo;
	
	private JButton bAnchetaDulce;
	private JButton bAnchetaParaMujer;
	private JButton bAnchetaPersonalizable;
	private JButton bAnchetaSencilla;
	private JButton bPocilloPersonalizable;

	public CreateProductWindow() {
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

		// ==BOTONES==
		bBack = new JButton("VOLVER");
		bBack.setBounds(760, 565, 100, 30);
		bBack.setFont(new Font("Agency FB", Font.BOLD, 22));
		bBack.setBackground(Color.decode("#ECE7FE"));
		bBack.setForeground(Color.decode("#130344"));
		bBack.setBorderPainted(false);
		bBack.setFocusPainted(false);
		add(bBack);

		// ==BOTONES==

		ImageIcon imagen1 = new ImageIcon(getClass().getResource("dulces.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		bAnchetaDulce = new JButton(imagen1);
		bAnchetaDulce.setBounds(140, 165, 170, 170);
		bAnchetaDulce.setBackground(Color.decode("#B7AADF"));
		bAnchetaDulce.setFocusPainted(false);
		bAnchetaDulce.setBorderPainted(false);
		add(bAnchetaDulce);

		ImageIcon imagen2 = new ImageIcon(getClass().getResource("maquillaje.JPG"));
		JLabel labelImagen2 = new JLabel(imagen2);
		bAnchetaParaMujer = new JButton(imagen2);
		bAnchetaParaMujer.setBounds(350, 165, 170, 170);
		bAnchetaParaMujer.setBackground(Color.decode("#B7AADF"));
		bAnchetaParaMujer.setFocusPainted(false);
		bAnchetaParaMujer.setBorderPainted(false);
		add(bAnchetaParaMujer);

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("osito.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		bAnchetaPersonalizable = new JButton(imagen3);
		bAnchetaPersonalizable.setBounds(560, 165, 170, 170);
		bAnchetaPersonalizable.setBackground(Color.decode("#B7AADF"));
		bAnchetaPersonalizable.setFocusPainted(false);
		bAnchetaPersonalizable.setBorderPainted(false);
		add(bAnchetaPersonalizable);

		ImageIcon imagen4 = new ImageIcon(getClass().getResource("copas.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		bAnchetaSencilla = new JButton(imagen4);
		bAnchetaSencilla.setBounds(250, 410, 170, 170);
		bAnchetaSencilla.setBackground(Color.decode("#B7AADF"));
		bAnchetaSencilla.setFocusPainted(false);
		bAnchetaSencilla.setBorderPainted(false);
		add(bAnchetaSencilla);

		ImageIcon imagen5 = new ImageIcon(getClass().getResource("regalo.JPG"));
		JLabel labelImagen5 = new JLabel(imagen5);
		bPocilloPersonalizable = new JButton(imagen5);
		bPocilloPersonalizable.setBounds(460, 410, 170, 170);
		bPocilloPersonalizable.setBackground(Color.decode("#B7AADF"));
		bPocilloPersonalizable.setFocusPainted(false);
		bPocilloPersonalizable.setBorderPainted(false);
		add(bPocilloPersonalizable);

		// == LABELS==
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

	public JButton getbAnchetaDulce() {
		return bAnchetaDulce;
	}

	public void setbAnchetaDulce(JButton bAnchetaDulce) {
		this.bAnchetaDulce = bAnchetaDulce;
	}

	public JButton getbAnchetaParaMujer() {
		return bAnchetaParaMujer;
	}

	public void setbAnchetaParaMujer(JButton bAnchetaParaMujer) {
		this.bAnchetaParaMujer = bAnchetaParaMujer;
	}

	public JButton getbAnchetaPersonalizable() {
		return bAnchetaPersonalizable;
	}

	public void setbAnchetaPersonalizable(JButton bAnchetaPersonalizable) {
		this.bAnchetaPersonalizable = bAnchetaPersonalizable;
	}

	public JButton getbAnchetaSencilla() {
		return bAnchetaSencilla;
	}

	public void setbAnchetaSencilla(JButton bAnchetaSencilla) {
		this.bAnchetaSencilla = bAnchetaSencilla;
	}

	public JButton getbPocilloPersonalizable() {
		return bPocilloPersonalizable;
	}

	public void setbPocilloPersonalizable(JButton bPocilloPersonalizable) {
		this.bPocilloPersonalizable = bPocilloPersonalizable;
	}

}
