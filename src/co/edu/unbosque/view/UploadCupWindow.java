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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UploadCupWindow extends JFrame {

	
	private JButton bBack;
	private JLabel title;
	private JButton upload;
	private JTextField posicionPocillo;

	public UploadCupWindow() {
		initComponents();
		setVisible(false);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3");
		this.setBounds(520, 250, 350, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#B7AADF"));

		// ==BOTONES==
		bBack = new JButton("VOLVER");
		bBack.setBounds(55, 145, 100, 40);
		bBack.setFont(new Font("Agency FB", Font.BOLD, 22));
		bBack.setBackground(Color.decode("#130344"));
		bBack.setForeground(Color.decode("#ECE7FE"));
		bBack.setBorderPainted(false);
		bBack.setFocusPainted(false);
		add(bBack);

		upload = new JButton("BUSCAR");
		upload.setBounds(185, 145, 100, 40);
		upload.setFont(new Font("Agency FB", Font.BOLD, 22));
		upload.setBackground(Color.decode("#130344"));
		upload.setForeground(Color.decode("#ECE7FE"));
		upload.setBorderPainted(false);
		upload.setFocusPainted(false);
		add(upload);

		// ==LABELS==
		title = new JLabel("-> Ingrese el indice del producto que desea actualizar");
		title.setBounds(16, 28, 700, 50);
		title.setForeground(Color.decode("#18093E"));
		title.setFont(new Font("Agency FB", Font.BOLD, 19));
		add(title);

		posicionPocillo = new JTextField();
		posicionPocillo.setBounds(143, 80, 50, 50);
		posicionPocillo.setFont(new Font("Agency FB", Font.BOLD, 30));
		posicionPocillo.setForeground(Color.decode("#18093E"));
		posicionPocillo.setBorder(null);
		add(posicionPocillo);

	}

	public JButton getbBack() {
		return bBack;
	}

	public void setbBack(JButton bBack) {
		this.bBack = bBack;
	}

	public JButton getUpload() {
		return upload;
	}

	public void setUpload(JButton upload) {
		this.upload = upload;
	}

	public JTextField getPosicionPocillo() {
		return posicionPocillo;
	}

	public void setPosicionPocillo(JTextField posicionPocillo) {
		this.posicionPocillo = posicionPocillo;
	}

	
}
