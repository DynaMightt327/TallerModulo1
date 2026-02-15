package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateWomanWindow extends JFrame {

	private JButton bBack;
	private JButton bSave;
	
	private JPanel topPanel;
	private JLabel logo;
	private JPanel centerPanel;
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JLabel lTitle;
	private JLabel partner;
	
	private JLabel lEstilo;
	private JTextField tEstilo;
	
	private JLabel lAccesorio;
	private JTextField tAccesorio;
	
	private JLabel lEnfoque;
	private JTextField tEnfoque;
	
	private JLabel lPrecio;
	private JTextField tPrecio;
	
	private JLabel lNivelDeDetalle;
	private JComboBox<String> tNivelDetalle;
	
	private JLabel lPaletaColor;
	private JTextField tPaletaColor;
	

	public CreateWomanWindow() {
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
		
		bSave = new JButton("GUARDAR");
		bSave.setBounds(220, 340, 130, 40);
		bSave.setFont(new Font("Agency FB", Font.BOLD, 22));
		bSave.setBackground(Color.decode("#130344"));
		bSave.setForeground(Color.decode("#ECE7FE"));
		bSave.setBorderPainted(false);
		bSave.setFocusPainted(false);
		centerPanel.add(bSave);
		
		//== LABELS==
		logo = new JLabel("LUCKY J3");
		logo.setBounds(330, 15, 550, 100);
		logo.setForeground(Color.decode("#18093E"));
		logo.setFont(new Font("Agency FB", Font.BOLD, 70));
		topPanel.add(logo);
		
		lTitle = new JLabel("-> Ingrese los datos del regalo para mujer");
		lTitle.setBounds(10, 15, 700, 52);
		lTitle.setForeground(Color.decode("#18093E"));
		lTitle.setFont(new Font("Agency FB", Font.BOLD, 45));
		centerPanel.add(lTitle);	
		
		
		//==IMAGES==
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
		
		//==ESPACIOS DE TEXTO==
		lEstilo = new JLabel("Estilo");
		lEstilo.setBounds(134, 90, 150, 30);
		lEstilo.setFont(new Font("Agency FB", Font.BOLD, 22));
		lEstilo.setForeground(Color.decode("#18093E"));
		centerPanel.add(lEstilo);
		
		tEstilo = new JTextField();
		tEstilo.setBounds(73, 120, 164, 28);
		tEstilo.setFont(new Font("Agency FB", Font.BOLD, 15));
		tEstilo.setForeground(Color.decode("#18093E"));
		tEstilo.setBorder(null);
		centerPanel.add(tEstilo);

		lAccesorio = new JLabel("Accesorio");
		lAccesorio.setBounds(120, 160, 150, 30);
		lAccesorio.setFont(new Font("Agency FB", Font.BOLD, 22));
		lAccesorio.setForeground(Color.decode("#18093E"));
		centerPanel.add(lAccesorio);
		
		tAccesorio = new JTextField();
		tAccesorio.setBounds(73, 190, 164, 28);
		tAccesorio.setFont(new Font("Agency FB", Font.BOLD, 15));
		tAccesorio.setForeground(Color.decode("#18093E"));
		tAccesorio.setBorder(null);
		centerPanel.add(tAccesorio);
		
		lEnfoque = new JLabel("Enfoque");
		lEnfoque.setBounds(128, 230, 150, 30);
		lEnfoque.setFont(new Font("Agency FB", Font.BOLD, 22));
		lEnfoque.setForeground(Color.decode("#18093E"));
		centerPanel.add(lEnfoque);
		
		tEnfoque = new JTextField();
		tEnfoque.setBounds(73, 260, 164, 28);
		tEnfoque.setFont(new Font("Agency FB", Font.BOLD, 15));
		tEnfoque.setForeground(Color.decode("#18093E"));
		tEnfoque.setBorder(null);
		centerPanel.add(tEnfoque);
		
		lPrecio = new JLabel("Precio");
		lPrecio.setBounds(395, 90, 150, 30);
		lPrecio.setFont(new Font("Agency FB", Font.BOLD, 22));
		lPrecio.setForeground(Color.decode("#18093E"));
		centerPanel.add(lPrecio);
		
		tPrecio = new JTextField();
		tPrecio.setBounds(340, 120, 164, 28);
		tPrecio.setFont(new Font("Agency FB", Font.BOLD, 15));
		tPrecio.setForeground(Color.decode("#18093E"));
		tPrecio.setBorder(null);
		centerPanel.add(tPrecio);
		
		lNivelDeDetalle = new JLabel("Nivel Detalle");
		lNivelDeDetalle.setBounds(375, 160, 150, 30);
		lNivelDeDetalle.setFont(new Font("Agency FB", Font.BOLD, 22));
		lNivelDeDetalle.setForeground(Color.decode("#18093E"));
		centerPanel.add(lNivelDeDetalle);
		
		tNivelDetalle = new JComboBox<>(new String[] { "...", "Bajo", "Medio", "Alto" });
		tNivelDetalle.setBounds(340, 190, 164, 28);
		tNivelDetalle.setFont(new Font("Agency FB", Font.BOLD, 15));
		tNivelDetalle.setForeground(Color.decode("#18093E"));
		tNivelDetalle.setBorder(null);
		centerPanel.add(tNivelDetalle);	
		
		lPaletaColor = new JLabel("Paleta de colores");
		lPaletaColor.setBounds(360, 230, 150, 30);
		lPaletaColor.setFont(new Font("Agency FB", Font.BOLD, 22));
		lPaletaColor.setForeground(Color.decode("#18093E"));
		centerPanel.add(lPaletaColor);
		
		tPaletaColor = new JTextField();
		tPaletaColor.setBounds(340, 260, 164, 28);
		tPaletaColor.setFont(new Font("Agency FB", Font.BOLD, 15));
		tPaletaColor.setForeground(Color.decode("#18093E"));
		tPaletaColor.setBorder(null);
		centerPanel.add(tPaletaColor);
		

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

	public JLabel getlTitle() {
		return lTitle;
	}

	public void setlTitle(JLabel lTitle) {
		this.lTitle = lTitle;
	}

	public JLabel getlEstilo() {
		return lEstilo;
	}

	public void setlEstilo(JLabel lEstilo) {
		this.lEstilo = lEstilo;
	}

	public JTextField gettEstilo() {
		return tEstilo;
	}

	public void settEstilo(JTextField tEstilo) {
		this.tEstilo = tEstilo;
	}

	public JLabel getlAccesorio() {
		return lAccesorio;
	}

	public void setlAccesorio(JLabel lAccesorio) {
		this.lAccesorio = lAccesorio;
	}

	public JTextField gettAccesorio() {
		return tAccesorio;
	}

	public void settAccesorio(JTextField tAccesorio) {
		this.tAccesorio = tAccesorio;
	}

	public JLabel getlEnfoque() {
		return lEnfoque;
	}

	public void setlEnfoque(JLabel lEnfoque) {
		this.lEnfoque = lEnfoque;
	}

	public JTextField gettEnfoque() {
		return tEnfoque;
	}

	public void settEnfoque(JTextField tEnfoque) {
		this.tEnfoque = tEnfoque;
	}

	public JLabel getlPreecio() {
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

	public JLabel getlNivelDetalle() {
		return lNivelDeDetalle;
	}

	public void setlNivelDetalle(JLabel lNivelDetalle) {
		this.lNivelDeDetalle = lNivelDetalle;
	}

	public JButton getbSave() {
		return bSave;
	}

	public void setbSave(JButton bSave) {
		this.bSave = bSave;
	}

	public JLabel getPartner() {
		return partner;
	}

	public void setPartner(JLabel partner) {
		this.partner = partner;
	}

	public JLabel getlNivelDeDetalle() {
		return lNivelDeDetalle;
	}

	public void setlNivelDeDetalle(JLabel lNivelDeDetalle) {
		this.lNivelDeDetalle = lNivelDeDetalle;
	}

	public JComboBox<String> gettNivelDetalle() {
		return tNivelDetalle;
	}

	public void settNivelDetalle(JComboBox<String> tNivelDetalle) {
		this.tNivelDetalle = tNivelDetalle;
	}

	public JLabel getlPrecio() {
		return lPrecio;
	}

	public JLabel getlPaletaColor() {
		return lPaletaColor;
	}

	public void setlPaletaColor(JLabel lPaletaColor) {
		this.lPaletaColor = lPaletaColor;
	}

	public JTextField gettPaletaColor() {
		return tPaletaColor;
	}

	public void settPaletaColor(JTextField tPaletaColor) {
		this.tPaletaColor = tPaletaColor;
	}
	
	

}
