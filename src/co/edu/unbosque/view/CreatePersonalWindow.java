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
	
	private JLabel lTieneGlobo;
	private JTextField tTieneGlobo;
	
	private JLabel lMaximaCantidadProducto;
	private JTextField tMaximaCantidadProducto;
	
	private JLabel lMensajeTarjeta;
	private JTextField tMensajeTarjeta;
	
	private JLabel lColorElegido;
	private JTextField tColorElegido;
	
	private JLabel lPrecio;
	private JTextField tPrecio;
	
	private JLabel lTamano;
	private JTextField tTamano;
	

	public CreatePersonalWindow() {
		initComponents();
		setVisible(false);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3 - seleccionar producto para crear");
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
		lTieneGlobo = new JLabel("Tiene globos? (si/no)");
		lTieneGlobo.setBounds(128, 80, 150, 30);
		lTieneGlobo.setFont(new Font("Agency FB", Font.BOLD, 22));
		lTieneGlobo.setForeground(Color.decode("#18093E"));
		centerPanel.add(lTieneGlobo);
		
		tTieneGlobo = new JTextField();
		tTieneGlobo.setBounds(73, 110, 164, 28);
		tTieneGlobo.setFont(new Font("Agency FB", Font.BOLD, 15));
		tTieneGlobo.setForeground(Color.decode("#ECE7FE"));
		tTieneGlobo.setBorder(null);
		centerPanel.add(tTieneGlobo);

		lMaximaCantidadProducto = new JLabel("Cantidad Productos");
		lMaximaCantidadProducto.setBounds(128, 140, 150, 30);
		lMaximaCantidadProducto.setFont(new Font("Agency FB", Font.BOLD, 22));
		lMaximaCantidadProducto.setForeground(Color.decode("#18093E"));
		centerPanel.add(lMaximaCantidadProducto);
		
		tMaximaCantidadProducto = new JTextField();
		tMaximaCantidadProducto.setBounds(73, 170, 164, 28);
		tMaximaCantidadProducto.setFont(new Font("Agency FB", Font.BOLD, 15));
		tMaximaCantidadProducto.setForeground(Color.decode("#ECE7FE"));
		tMaximaCantidadProducto.setBorder(null);
		centerPanel.add(tMaximaCantidadProducto);
		
		lMensajeTarjeta = new JLabel("Mensaje Tarjeta");
		lMensajeTarjeta.setBounds(128, 200, 150, 30);
		lMensajeTarjeta.setFont(new Font("Agency FB", Font.BOLD, 22));
		lMensajeTarjeta.setForeground(Color.decode("#18093E"));
		centerPanel.add(lMensajeTarjeta);
		
		tMensajeTarjeta = new JTextField();
		tMensajeTarjeta.setBounds(73, 230, 164, 28);
		tMensajeTarjeta.setFont(new Font("Agency FB", Font.BOLD, 15));
		tMensajeTarjeta.setForeground(Color.decode("#ECE7FE"));
		tMensajeTarjeta.setBorder(null);
		centerPanel.add(tMensajeTarjeta);
		
		lColorElegido = new JLabel("Colores elegidos");
		lColorElegido.setBounds(395, 80, 150, 30);
		lColorElegido.setFont(new Font("Agency FB", Font.BOLD, 22));
		lColorElegido.setForeground(Color.decode("#18093E"));
		centerPanel.add(lColorElegido);
		
		tColorElegido = new JTextField();
		tColorElegido.setBounds(340, 110, 164, 28);
		tColorElegido.setFont(new Font("Agency FB", Font.BOLD, 15));
		tColorElegido.setForeground(Color.decode("#ECE7FE"));
		tColorElegido.setBorder(null);
		centerPanel.add(tColorElegido);
		
		lPrecio = new JLabel("Precio");
		lPrecio.setBounds(395, 140, 150, 30);
		lPrecio.setFont(new Font("Agency FB", Font.BOLD, 22));
		lPrecio.setForeground(Color.decode("#18093E"));
		centerPanel.add(lPrecio);
		
		tPrecio = new JTextField();
		tPrecio.setBounds(340, 170, 164, 28);
		tPrecio.setFont(new Font("Agency FB", Font.BOLD, 15));
		tPrecio.setForeground(Color.decode("#ECE7FE"));
		tPrecio.setBorder(null);
		centerPanel.add(tPrecio);	
		
		lTamano = new JLabel("Tamaño");
		lTamano.setBounds(395, 200, 150, 30);
		lTamano.setFont(new Font("Agency FB", Font.BOLD, 22));
		lTamano.setForeground(Color.decode("#18093E"));
		centerPanel.add(lTamano);
		
		tTamano = new JTextField();
		tTamano.setBounds(340, 230, 164, 28);
		tTamano.setFont(new Font("Agency FB", Font.BOLD, 15));
		tTamano.setForeground(Color.decode("#ECE7FE"));
		tTamano.setBorder(null);
		centerPanel.add(tTamano);
		
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

	public JLabel getlTieneGlobo() {
		return lTieneGlobo;
	}

	public void setlTieneGlobo(JLabel lTieneGlobo) {
		this.lTieneGlobo = lTieneGlobo;
	}

	public JTextField gettTieneGlobo() {
		return tTieneGlobo;
	}

	public void settTieneGlobo(JTextField tTieneGlobo) {
		this.tTieneGlobo = tTieneGlobo;
	}

	public JLabel getlMaximaCantidadProducto() {
		return lMaximaCantidadProducto;
	}

	public void setlMaximaCantidadProducto(JLabel lMaximaCantidadProducto) {
		this.lMaximaCantidadProducto = lMaximaCantidadProducto;
	}

	public JTextField gettMaximaCantidadProducto() {
		return tMaximaCantidadProducto;
	}

	public void settMaximaCantidadProducto(JTextField tMaximaCantidadProducto) {
		this.tMaximaCantidadProducto = tMaximaCantidadProducto;
	}

	public JLabel getlMensajeTarjeta() {
		return lMensajeTarjeta;
	}

	public void setlMensajeTarjeta(JLabel lMensajeTarjeta) {
		this.lMensajeTarjeta = lMensajeTarjeta;
	}

	public JTextField gettMensajeTarjeta() {
		return tMensajeTarjeta;
	}

	public void settMensajeTarjeta(JTextField tMensajeTarjeta) {
		this.tMensajeTarjeta = tMensajeTarjeta;
	}

	public JLabel getlColorElegido() {
		return lColorElegido;
	}

	public void setlColorElegido(JLabel lColorElegido) {
		this.lColorElegido = lColorElegido;
	}

	public JTextField gettColorElegido() {
		return tColorElegido;
	}

	public void settColorElegido(JTextField tColorElegido) {
		this.tColorElegido = tColorElegido;
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

	public JLabel getlTamano() {
		return lTamano;
	}

	public void setlTamano(JLabel lTamano) {
		this.lTamano = lTamano;
	}

	public JTextField gettTamano() {
		return tTamano;
	}

	public void settTamano(JTextField tTamano) {
		this.tTamano = tTamano;
	}

}
