package co.edu.unbosque.view;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateCupWindow extends JFrame {
	private JButton bBack;
	private JButton bSave;

	private JPanel topPanel;
	private JLabel logo;
	private JPanel centerPanel;
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JLabel lTitle;
	private JLabel partner;

	private JLabel lMaterial;
	private JTextField tMaterial;

	private JLabel lColor;
	private JTextField tColor;

	private JLabel lCaracteristica;
	private JTextField tCaracteristica;

	private JLabel lTamanoImpresion;
	private JTextField tTamanoImpresion;

	private JLabel lAptoMicro;
	private JComboBox<String> tAptoMicro;

	private JLabel lPrecio;
	private JTextField tPrecio;

	public CreateCupWindow() {
		initComponents();
		setVisible(false);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3 - crear pocillos personalizables");
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

		bSave = new JButton("GUARDAR");
		bSave.setBounds(220, 340, 130, 40);
		bSave.setFont(new Font("Agency FB", Font.BOLD, 22));
		bSave.setBackground(Color.decode("#130344"));
		bSave.setForeground(Color.decode("#ECE7FE"));
		bSave.setBorderPainted(false);
		bSave.setFocusPainted(false);
		centerPanel.add(bSave);

		// == LABELS==
		logo = new JLabel("LUCKY J3");
		logo.setBounds(330, 15, 550, 100);
		logo.setForeground(Color.decode("#18093E"));
		logo.setFont(new Font("Agency FB", Font.BOLD, 70));
		topPanel.add(logo);

		lTitle = new JLabel("-> Ingrese los datos del pocillo personalizado");
		lTitle.setBounds(10, 15, 700, 52);
		lTitle.setForeground(Color.decode("#18093E"));
		lTitle.setFont(new Font("Agency FB", Font.BOLD, 45));
		centerPanel.add(lTitle);

		// ==IMAGES==
		ImageIcon imageOne = new ImageIcon(getClass().getResource("foto.jpg"));
		lImageOne = new JLabel(imageOne);
		lImageOne.setBounds(40, 0, 200, 160);
		topPanel.add(lImageOne);

		ImageIcon imageTwo = new ImageIcon(getClass().getResource("foto.jpg"));
		lImageTwo = new JLabel(imageTwo);
		lImageTwo.setBounds(650, 0, 200, 160);
		topPanel.add(lImageTwo);
		
		ImageIcon imageInfo = new ImageIcon(getClass().getResource("parejaa.jpg"));
		partner = new JLabel(imageInfo);
		partner.setBounds(550, 100, 215, 255);
		centerPanel.add(partner);

		// ==ESPACIOS DE TEXTO==
		lMaterial = new JLabel("Material");
		lMaterial.setBounds(128, 80, 150, 30);
		lMaterial.setFont(new Font("Agency FB", Font.BOLD, 22));
		lMaterial.setForeground(Color.decode("#18093E"));
		centerPanel.add(lMaterial);

		tMaterial = new JTextField();
		tMaterial.setBounds(73, 110, 164, 28);
		tMaterial.setFont(new Font("Agency FB", Font.BOLD, 15));
		tMaterial.setForeground(Color.decode("#18093E"));
		tMaterial.setBorder(null);
		centerPanel.add(tMaterial);

		lColor = new JLabel("Color");
		lColor.setBounds(128, 140, 150, 30);
		lColor.setFont(new Font("Agency FB", Font.BOLD, 22));
		lColor.setForeground(Color.decode("#18093E"));
		centerPanel.add(lColor);

		tColor = new JTextField();
		tColor.setBounds(73, 170, 164, 28);
		tColor.setFont(new Font("Agency FB", Font.BOLD, 15));
		tColor.setForeground(Color.decode("#18093E"));
		tColor.setBorder(null);
		centerPanel.add(tColor);

		lCaracteristica = new JLabel("Características");
		lCaracteristica.setBounds(128, 200, 150, 30);
		lCaracteristica.setFont(new Font("Agency FB", Font.BOLD, 22));
		lCaracteristica.setForeground(Color.decode("#18093E"));
		centerPanel.add(lCaracteristica);

		tCaracteristica = new JTextField();
		tCaracteristica.setBounds(73, 230, 164, 28);
		tCaracteristica.setFont(new Font("Agency FB", Font.BOLD, 15));
		tCaracteristica.setForeground(Color.decode("#18093E"));
		tCaracteristica.setBorder(null);
		centerPanel.add(tCaracteristica);

		lTamanoImpresion = new JLabel("Tamaño de impresion");
		lTamanoImpresion.setBounds(395, 80, 150, 30);
		lTamanoImpresion.setFont(new Font("Agency FB", Font.BOLD, 22));
		lTamanoImpresion.setForeground(Color.decode("#18093E"));
		centerPanel.add(lTamanoImpresion);

		tTamanoImpresion = new JTextField();
		tTamanoImpresion.setBounds(340, 110, 164, 28);
		tTamanoImpresion.setFont(new Font("Agency FB", Font.BOLD, 15));
		tTamanoImpresion.setForeground(Color.decode("#18093E"));
		tTamanoImpresion.setBorder(null);
		centerPanel.add(tTamanoImpresion);

		lAptoMicro = new JLabel("Apto para microondas?");
		lAptoMicro.setBounds(395, 140, 150, 30);
		lAptoMicro.setFont(new Font("Agency FB", Font.BOLD, 22));
		lAptoMicro.setForeground(Color.decode("#18093E"));
		centerPanel.add(lAptoMicro);

		tAptoMicro = new JComboBox<>(new String[] { "...", "Si", "No" });
		tAptoMicro.setBounds(340, 170, 164, 28);
		tAptoMicro.setFont(new Font("Agency FB", Font.BOLD, 15));
		tAptoMicro.setForeground(Color.decode("#18093E"));
		tAptoMicro.setBorder(null);
		centerPanel.add(tAptoMicro);

		lPrecio = new JLabel("Precio");
		lPrecio.setBounds(395, 200, 150, 30);
		lPrecio.setFont(new Font("Agency FB", Font.BOLD, 22));
		lPrecio.setForeground(Color.decode("#18093E"));
		centerPanel.add(lPrecio);

		tPrecio = new JTextField();
		tPrecio.setBounds(340, 230, 164, 28);
		tPrecio.setFont(new Font("Agency FB", Font.BOLD, 15));
		tPrecio.setForeground(Color.decode("#18093E"));
		tPrecio.setBorder(null);
		centerPanel.add(tPrecio);

	}

	public JButton getbBack() {
		return bBack;
	}

	public void setbBack(JButton bBack) {
		this.bBack = bBack;
	}

	public JButton getbSave() {
		return bSave;
	}

	public void setbSave(JButton bSave) {
		this.bSave = bSave;
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

	public JLabel getlTitle() {
		return lTitle;
	}

	public void setlTitle(JLabel lTitle) {
		this.lTitle = lTitle;
	}

	public JLabel getlMaterial() {
		return lMaterial;
	}

	public void setlMaterial(JLabel lMaterial) {
		this.lMaterial = lMaterial;
	}

	public JTextField gettMaterial() {
		return tMaterial;
	}

	public void settMaterial(JTextField tMaterial) {
		this.tMaterial = tMaterial;
	}

	public JLabel getlColor() {
		return lColor;
	}

	public void setlColor(JLabel lColor) {
		this.lColor = lColor;
	}

	public JTextField gettColor() {
		return tColor;
	}

	public void settColor(JTextField tColor) {
		this.tColor = tColor;
	}

	public JLabel getlCaracteristica() {
		return lCaracteristica;
	}

	public void setlCaracteristica(JLabel lCaracteristica) {
		this.lCaracteristica = lCaracteristica;
	}

	public JTextField gettCaracteristica() {
		return tCaracteristica;
	}

	public void settCaracteristica(JTextField tCaracteristica) {
		this.tCaracteristica = tCaracteristica;
	}

	public JLabel getlTamanoImpresion() {
		return lTamanoImpresion;
	}

	public void setlTamanoImpresion(JLabel lTamanoImpresion) {
		this.lTamanoImpresion = lTamanoImpresion;
	}

	public JTextField gettTamanoImpresion() {
		return tTamanoImpresion;
	}

	public void settTamanoImpresion(JTextField tTamanoImpresion) {
		this.tTamanoImpresion = tTamanoImpresion;
	}

	public JLabel getlAptoMicro() {
		return lAptoMicro;
	}

	public void setlAptoMicro(JLabel lAptoMicro) {
		this.lAptoMicro = lAptoMicro;
	}

	

	public JLabel getPartner() {
		return partner;
	}

	public void setPartner(JLabel partner) {
		this.partner = partner;
	}

	public JComboBox<String> gettAptoMicro() {
		return tAptoMicro;
	}

	public void settAptoMicro(JComboBox<String> tAptoMicro) {
		this.tAptoMicro = tAptoMicro;
	}

	public JLabel getlPrecio() {
		return lPrecio;
	}

	public void setlPrecio(JLabel lPrecio) {
		this.lPrecio = lPrecio;
	}

	public JTextField gettPrecio() {
		return tPrecio;
	}

	public void settPrecio(JTextField tPrecio) {
		this.tPrecio = tPrecio;
	}
	
	

}
