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
import javax.swing.table.DefaultTableModel;

public class DeletedCupWindow extends JFrame {

	private JTable tablaPocillo;
	private JLabel lImageOne;
	private JLabel lImageTwo;
	private JButton bBack;
	private JPanel topPanel;
	private JLabel title;
	private JLabel logo;

	public DeletedCupWindow() {
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

		// ==TABLA INFO==
		String[] columnas = { "Material", "Color", "Caracteriticas", "Tamaño Impresion", "Apto para microondas",
				"Precio" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		tablaPocillo = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tablaPocillo);
		scroll.setBounds(60, 220, 750, 300);
		scroll.setBackground(Color.decode("#B7AADF"));
		getContentPane().add(scroll);

		// ==BOTONES==
		bBack = new JButton("VOLVER");
		bBack.setBounds(10, 575, 100, 30);
		bBack.setFont(new Font("Agency FB", Font.BOLD, 22));
		bBack.setBackground(Color.decode("#ECE7FE"));
		bBack.setForeground(Color.decode("#130344"));
		bBack.setBorderPainted(false);
		bBack.setFocusPainted(false);
		add(bBack);

		// ==LABELS==
		title = new JLabel("-> Seleccione el producto que desea eliminar");
		title.setBounds(60, 160, 700, 50);
		title.setForeground(Color.decode("#18093E"));
		title.setFont(new Font("Agency FB", Font.BOLD, 40));
		add(title);

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

	public JTable getTablaPocillo() {
		return tablaPocillo;
	}

	public void setTablaPocillo(JTable tablaPocillo) {
		this.tablaPocillo = tablaPocillo;
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

}
