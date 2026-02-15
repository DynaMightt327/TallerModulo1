package co.edu.unbosque.view;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CreatePersonalWindow extends JFrame{
	
	private JButton bBack;
	private JButton bSave;
	
	private JPanel topPanel;
	private JLabel logo;
	private JPanel centerPanel;
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JLabel lTitle;
	
	private JLabel lEstilo;
	private JTextField tEstilo;
	
	private JLabel lAccesorio;
	private JTextField tAccesorio;
	
	private JLabel lEnfoque;
	private JTextField tEnfoque;
	
	private JLabel lOcasion;
	private JTextField tOcasion;
	
	private JLabel lNivelDetalle;
	private JTextField tNivelDetalle;
	
	private JLabel lPaletaColor;
	private JTextField tPaletaColor;
	

	public CreatePersonalWindow() {
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
		bSave.setBounds(640, 320, 130, 40);
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
		
		lTitle = new JLabel("-> Ingrese los datos del regalo personalizado");
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
		
		//==ESPACIOS DE TEXTO==
		lEstilo = new JLabel("Tiene globos? (si/no)");
		lEstilo.setBounds(128, 80, 150, 30);
		lEstilo.setFont(new Font("Agency FB", Font.BOLD, 22));
		lEstilo.setForeground(Color.decode("#18093E"));
		centerPanel.add(lEstilo);
		
		tEstilo = new JTextField();
		tEstilo.setBounds(73, 110, 164, 28);
		tEstilo.setFont(new Font("Agency FB", Font.BOLD, 15));
		tEstilo.setForeground(Color.decode("#ECE7FE"));
		tEstilo.setBorder(null);
		centerPanel.add(tEstilo);

		lAccesorio = new JLabel("Cantidad Productos");
		lAccesorio.setBounds(128, 140, 150, 30);
		lAccesorio.setFont(new Font("Agency FB", Font.BOLD, 22));
		lAccesorio.setForeground(Color.decode("#18093E"));
		centerPanel.add(lAccesorio);
		
		tAccesorio = new JTextField();
		tAccesorio.setBounds(73, 170, 164, 28);
		tAccesorio.setFont(new Font("Agency FB", Font.BOLD, 15));
		tAccesorio.setForeground(Color.decode("#ECE7FE"));
		tAccesorio.setBorder(null);
		centerPanel.add(tAccesorio);
		
		lEnfoque = new JLabel("Mensaje Tarjeta");
		lEnfoque.setBounds(128, 200, 150, 30);
		lEnfoque.setFont(new Font("Agency FB", Font.BOLD, 22));
		lEnfoque.setForeground(Color.decode("#18093E"));
		centerPanel.add(lEnfoque);
		
		tEnfoque = new JTextField();
		tEnfoque.setBounds(73, 230, 164, 28);
		tEnfoque.setFont(new Font("Agency FB", Font.BOLD, 15));
		tEnfoque.setForeground(Color.decode("#ECE7FE"));
		tEnfoque.setBorder(null);
		centerPanel.add(tEnfoque);
		
		lOcasion = new JLabel("Colores elegidos");
		lOcasion.setBounds(395, 80, 150, 30);
		lOcasion.setFont(new Font("Agency FB", Font.BOLD, 22));
		lOcasion.setForeground(Color.decode("#18093E"));
		centerPanel.add(lOcasion);
		
		tOcasion = new JTextField();
		tOcasion.setBounds(340, 110, 164, 28);
		tOcasion.setFont(new Font("Agency FB", Font.BOLD, 15));
		tOcasion.setForeground(Color.decode("#ECE7FE"));
		tOcasion.setBorder(null);
		centerPanel.add(tOcasion);
		
		lNivelDetalle = new JLabel("Incluye foto? (si/no)");
		lNivelDetalle.setBounds(395, 140, 150, 30);
		lNivelDetalle.setFont(new Font("Agency FB", Font.BOLD, 22));
		lNivelDetalle.setForeground(Color.decode("#18093E"));
		centerPanel.add(lNivelDetalle);
		
		tNivelDetalle = new JTextField();
		tNivelDetalle.setBounds(340, 170, 164, 28);
		tNivelDetalle.setFont(new Font("Agency FB", Font.BOLD, 15));
		tNivelDetalle.setForeground(Color.decode("#ECE7FE"));
		tNivelDetalle.setBorder(null);
		centerPanel.add(tNivelDetalle);	
		
		lPaletaColor = new JLabel("Tamaño");
		lPaletaColor.setBounds(395, 200, 150, 30);
		lPaletaColor.setFont(new Font("Agency FB", Font.BOLD, 22));
		lPaletaColor.setForeground(Color.decode("#18093E"));
		centerPanel.add(lPaletaColor);
		
		tPaletaColor = new JTextField();
		tPaletaColor.setBounds(340, 230, 164, 28);
		tPaletaColor.setFont(new Font("Agency FB", Font.BOLD, 15));
		tPaletaColor.setForeground(Color.decode("#ECE7FE"));
		tPaletaColor.setBorder(null);
		centerPanel.add(tPaletaColor);
		
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

	public JLabel getlOcasion() {
		return lOcasion;
	}

	public void setlOcasion(JLabel lOcasion) {
		this.lOcasion = lOcasion;
	}

	public JTextField gettOcasion() {
		return tOcasion;
	}

	public void settOcasion(JTextField tOcasion) {
		this.tOcasion = tOcasion;
	}

	public JLabel getlNivelDetalle() {
		return lNivelDetalle;
	}

	public void setlNivelDetalle(JLabel lNivelDetalle) {
		this.lNivelDetalle = lNivelDetalle;
	}

	public JTextField gettNivelDetalle() {
		return tNivelDetalle;
	}

	public void settNivelDetalle(JTextField tNivelDetalle) {
		this.tNivelDetalle = tNivelDetalle;
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
