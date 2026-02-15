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

public class CreateCandyWindow extends JFrame {

	private JButton bBack;
	private JButton bSave;

	private JPanel topPanel;
	private JLabel logo;
	private JPanel centerPanel;
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JLabel lTitle;

	private JLabel lCantidadDulce;
	private JTextField tCantidadDulce;

	private JLabel lTipoDulce;
	private JTextField tTipoDulce;

	private JLabel lNivelDulzor;
	private JTextField tNivelDulzor;

	private JLabel lMarca;
	private JTextField tMarca;

	private JLabel lProductoSinAzucar;
	private JTextField tProductoSinAzucar;

	private JLabel lPrecio;
	private JTextField tPrecio;

	public CreateCandyWindow() {
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

		// == LABELS==
		logo = new JLabel("LUCKY J3");
		logo.setBounds(330, 15, 550, 100);
		logo.setForeground(Color.decode("#18093E"));
		logo.setFont(new Font("Agency FB", Font.BOLD, 70));
		topPanel.add(logo);

		lTitle = new JLabel("-> Ingrese los datos del regalo de dulces");
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
		lCantidadDulce = new JLabel("Cantidad dulces");
		lCantidadDulce.setBounds(128, 80, 150, 30);
		lCantidadDulce.setFont(new Font("Agency FB", Font.BOLD, 22));
		lCantidadDulce.setForeground(Color.decode("#18093E"));
		centerPanel.add(lCantidadDulce);

		tCantidadDulce = new JTextField();
		tCantidadDulce.setBounds(73, 110, 164, 28);
		tCantidadDulce.setFont(new Font("Agency FB", Font.BOLD, 15));
		tCantidadDulce.setForeground(Color.decode("#ECE7FE"));
		tCantidadDulce.setBorder(null);
		centerPanel.add(tCantidadDulce);

		lTipoDulce = new JLabel("Tipos dulces");
		lTipoDulce.setBounds(128, 140, 150, 30);
		lTipoDulce.setFont(new Font("Agency FB", Font.BOLD, 22));
		lTipoDulce.setForeground(Color.decode("#18093E"));
		centerPanel.add(lTipoDulce);

		tTipoDulce = new JTextField();
		tTipoDulce.setBounds(73, 170, 164, 28);
		tTipoDulce.setFont(new Font("Agency FB", Font.BOLD, 15));
		tTipoDulce.setForeground(Color.decode("#ECE7FE"));
		tTipoDulce.setBorder(null);
		centerPanel.add(tTipoDulce);

		lNivelDulzor = new JLabel("Nivel de dulzor");
		lNivelDulzor.setBounds(128, 200, 150, 30);
		lNivelDulzor.setFont(new Font("Agency FB", Font.BOLD, 22));
		lNivelDulzor.setForeground(Color.decode("#18093E"));
		centerPanel.add(lNivelDulzor);

		tNivelDulzor = new JTextField();
		tNivelDulzor.setBounds(73, 230, 164, 28);
		tNivelDulzor.setFont(new Font("Agency FB", Font.BOLD, 15));
		tNivelDulzor.setForeground(Color.decode("#ECE7FE"));
		tNivelDulzor.setBorder(null);
		centerPanel.add(tNivelDulzor);

		lMarca = new JLabel("Incluye marca reconocida");
		lMarca.setBounds(395, 80, 150, 30);
		lMarca.setFont(new Font("Agency FB", Font.BOLD, 22));
		lMarca.setForeground(Color.decode("#18093E"));
		centerPanel.add(lMarca);

		tMarca = new JTextField();
		tMarca.setBounds(340, 110, 164, 28);
		tMarca.setFont(new Font("Agency FB", Font.BOLD, 15));
		tMarca.setForeground(Color.decode("#ECE7FE"));
		tMarca.setBorder(null);
		centerPanel.add(tMarca);

		lProductoSinAzucar = new JLabel("Tiene productos sin azucar?");
		lProductoSinAzucar.setBounds(395, 140, 150, 30);
		lProductoSinAzucar.setFont(new Font("Agency FB", Font.BOLD, 22));
		lProductoSinAzucar.setForeground(Color.decode("#18093E"));
		centerPanel.add(lProductoSinAzucar);

		tProductoSinAzucar = new JTextField();
		tProductoSinAzucar.setBounds(340, 170, 164, 28);
		tProductoSinAzucar.setFont(new Font("Agency FB", Font.BOLD, 15));
		tProductoSinAzucar.setForeground(Color.decode("#ECE7FE"));
		tProductoSinAzucar.setBorder(null);
		centerPanel.add(tProductoSinAzucar);

		lPrecio = new JLabel("precio");
		lPrecio.setBounds(395, 200, 150, 30);
		lPrecio.setFont(new Font("Agency FB", Font.BOLD, 22));
		lPrecio.setForeground(Color.decode("#18093E"));
		centerPanel.add(lPrecio);

		tPrecio = new JTextField();
		tPrecio.setBounds(340, 230, 164, 28);
		tPrecio.setFont(new Font("Agency FB", Font.BOLD, 15));
		tPrecio.setForeground(Color.decode("#ECE7FE"));
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

	public JLabel getlCantidadDulce() {
		return lCantidadDulce;
	}

	public void setlCantidadDulce(JLabel lCantidadDulce) {
		this.lCantidadDulce = lCantidadDulce;
	}

	public JTextField gettCantidadDulce() {
		return tCantidadDulce;
	}

	public void settCantidadDulce(JTextField tCantidadDulce) {
		this.tCantidadDulce = tCantidadDulce;
	}

	public JLabel getlTipoDulce() {
		return lTipoDulce;
	}

	public void setlTipoDulce(JLabel lTipoDulce) {
		this.lTipoDulce = lTipoDulce;
	}

	public JTextField gettTipoDulce() {
		return tTipoDulce;
	}

	public void settTipoDulce(JTextField tTipoDulce) {
		this.tTipoDulce = tTipoDulce;
	}

	public JLabel getlNivelDulzor() {
		return lNivelDulzor;
	}

	public void setlNivelDulzor(JLabel lNivelDulzor) {
		this.lNivelDulzor = lNivelDulzor;
	}

	public JTextField gettNivelDulzor() {
		return tNivelDulzor;
	}

	public void settNivelDulzor(JTextField tNivelDulzor) {
		this.tNivelDulzor = tNivelDulzor;
	}

	public JLabel getlMarca() {
		return lMarca;
	}

	public void setlMarca(JLabel lMarca) {
		this.lMarca = lMarca;
	}

	public JTextField gettMarca() {
		return tMarca;
	}

	public void settMarca(JTextField tMarca) {
		this.tMarca = tMarca;
	}

	public JLabel getlProductoSinAzucar() {
		return lProductoSinAzucar;
	}

	public void setlProductoSinAzucar(JLabel lProductoSinAzucar) {
		this.lProductoSinAzucar = lProductoSinAzucar;
	}

	public JTextField gettProductoSinAzucar() {
		return tProductoSinAzucar;
	}

	public void settProductoSinAzucar(JTextField tProductoSinAzucar) {
		this.tProductoSinAzucar = tProductoSinAzucar;
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
