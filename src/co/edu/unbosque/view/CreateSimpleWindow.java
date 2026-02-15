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

public class CreateSimpleWindow extends JFrame {

	private JButton bBack;
	private JButton bSave;

	private JPanel topPanel;
	private JLabel logo;
	private JPanel centerPanel;
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JLabel lTitle;

	private JLabel lCantidadProducto;
	private JTextField tCantidadProducto;

	private JLabel lTienePocillo;
	private JTextField tTienePocillo;

	private JLabel lNivelDeco;
	private JTextField tNivelDeco;

	private JLabel lTipoEmpaque;
	private JTextField tTipoEmpaque;

	private JLabel lPrecio;
	private JTextField tPrecio;

	private JLabel lAptaParaEntrega;
	private JTextField tAptaParaEntrega;

	public CreateSimpleWindow() {
		initComponents();
		setVisible(false);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3 - crear ancheta simple");
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

		// == LABELS==
		logo = new JLabel("LUCKY J3");
		logo.setBounds(330, 15, 550, 100);
		logo.setForeground(Color.decode("#18093E"));
		logo.setFont(new Font("Agency FB", Font.BOLD, 70));
		topPanel.add(logo);

		lTitle = new JLabel("-> Ingrese los datos de la ancheta simple");
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

		// ==ESPACIOS DE TEXTO==
		lCantidadProducto = new JLabel("Cantidad de productos");
		lCantidadProducto.setBounds(128, 80, 150, 30);
		lCantidadProducto.setFont(new Font("Agency FB", Font.BOLD, 22));
		lCantidadProducto.setForeground(Color.decode("#18093E"));
		centerPanel.add(lCantidadProducto);

		tCantidadProducto = new JTextField();
		tCantidadProducto.setBounds(73, 110, 164, 28);
		tCantidadProducto.setFont(new Font("Agency FB", Font.BOLD, 15));
		tCantidadProducto.setForeground(Color.decode("#ECE7FE"));
		tCantidadProducto.setBorder(null);
		centerPanel.add(tCantidadProducto);

		lTienePocillo = new JLabel("Contiene pocillo? (si/no)");
		lTienePocillo.setBounds(128, 140, 150, 30);
		lTienePocillo.setFont(new Font("Agency FB", Font.BOLD, 22));
		lTienePocillo.setForeground(Color.decode("#18093E"));
		centerPanel.add(lTienePocillo);

		tTienePocillo = new JTextField();
		tTienePocillo.setBounds(73, 170, 164, 28);
		tTienePocillo.setFont(new Font("Agency FB", Font.BOLD, 15));
		tTienePocillo.setForeground(Color.decode("#ECE7FE"));
		tTienePocillo.setBorder(null);
		centerPanel.add(tTienePocillo);

		lNivelDeco = new JLabel("Nivel decoración");
		lNivelDeco.setBounds(128, 200, 150, 30);
		lNivelDeco.setFont(new Font("Agency FB", Font.BOLD, 22));
		lNivelDeco.setForeground(Color.decode("#18093E"));
		centerPanel.add(lNivelDeco);

		tNivelDeco = new JTextField();
		tNivelDeco.setBounds(73, 230, 164, 28);
		tNivelDeco.setFont(new Font("Agency FB", Font.BOLD, 15));
		tNivelDeco.setForeground(Color.decode("#ECE7FE"));
		tNivelDeco.setBorder(null);
		centerPanel.add(tNivelDeco);

		lTipoEmpaque = new JLabel("Tipo de empaque");
		lTipoEmpaque.setBounds(395, 80, 150, 30);
		lTipoEmpaque.setFont(new Font("Agency FB", Font.BOLD, 22));
		lTipoEmpaque.setForeground(Color.decode("#18093E"));
		centerPanel.add(lTipoEmpaque);

		tTipoEmpaque = new JTextField();
		tTipoEmpaque.setBounds(340, 110, 164, 28);
		tTipoEmpaque.setFont(new Font("Agency FB", Font.BOLD, 15));
		tTipoEmpaque.setForeground(Color.decode("#ECE7FE"));
		tTipoEmpaque.setBorder(null);
		centerPanel.add(tTipoEmpaque);

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

		lAptaParaEntrega = new JLabel("Apta para entrega?");
		lAptaParaEntrega.setBounds(395, 200, 150, 30);
		lAptaParaEntrega.setFont(new Font("Agency FB", Font.BOLD, 22));
		lAptaParaEntrega.setForeground(Color.decode("#18093E"));
		centerPanel.add(lAptaParaEntrega);

		tAptaParaEntrega = new JTextField();
		tAptaParaEntrega.setBounds(340, 230, 164, 28);
		tAptaParaEntrega.setFont(new Font("Agency FB", Font.BOLD, 15));
		tAptaParaEntrega.setForeground(Color.decode("#ECE7FE"));
		tAptaParaEntrega.setBorder(null);
		centerPanel.add(tAptaParaEntrega);

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

	public JLabel getlCantidadProducto() {
		return lCantidadProducto;
	}

	public void setlCantidadProducto(JLabel lCantidadProducto) {
		this.lCantidadProducto = lCantidadProducto;
	}

	public JTextField gettCantidadProducto() {
		return tCantidadProducto;
	}

	public void settCantidadProducto(JTextField tCantidadProducto) {
		this.tCantidadProducto = tCantidadProducto;
	}

	public JLabel getlTienePocillo() {
		return lTienePocillo;
	}

	public void setlTienePocillo(JLabel lTienePocillo) {
		this.lTienePocillo = lTienePocillo;
	}

	public JTextField gettTienePocillo() {
		return tTienePocillo;
	}

	public void settTienePocillo(JTextField tTienePocillo) {
		this.tTienePocillo = tTienePocillo;
	}

	public JLabel getlNivelDeco() {
		return lNivelDeco;
	}

	public void setlNivelDeco(JLabel lNivelDeco) {
		this.lNivelDeco = lNivelDeco;
	}

	public JTextField gettNivelDeco() {
		return tNivelDeco;
	}

	public void settNivelDeco(JTextField tNivelDeco) {
		this.tNivelDeco = tNivelDeco;
	}

	public JLabel getlTipoEmpaque() {
		return lTipoEmpaque;
	}

	public void setlTipoEmpaque(JLabel lTipoEmpaque) {
		this.lTipoEmpaque = lTipoEmpaque;
	}

	public JTextField gettTipoEmpaque() {
		return tTipoEmpaque;
	}

	public void settTipoEmpaque(JTextField tTipoEmpaque) {
		this.tTipoEmpaque = tTipoEmpaque;
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

	public JLabel getlAptaParaEntrega() {
		return lAptaParaEntrega;
	}

	public void setlAptaParaEntrega(JLabel lAptaParaEntrega) {
		this.lAptaParaEntrega = lAptaParaEntrega;
	}

	public JTextField gettAptaParaEntrega() {
		return tAptaParaEntrega;
	}

	public void settAptaParaEntrega(JTextField tAptaParaEntrega) {
		this.tAptaParaEntrega = tAptaParaEntrega;
	}

	
}
