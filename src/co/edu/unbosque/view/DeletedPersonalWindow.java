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

public class DeletedPersonalWindow extends JFrame {

	private JButton bBack;
	private JLabel title;
	private JButton delete;
	private JTextField posicionPersonal;

	public DeletedPersonalWindow() {
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

		delete = new JButton("ELIMINAR");
		delete.setBounds(185, 145, 100, 40);
		delete.setFont(new Font("Agency FB", Font.BOLD, 22));
		delete.setBackground(Color.decode("#130344"));
		delete.setForeground(Color.decode("#ECE7FE"));
		delete.setBorderPainted(false);
		delete.setFocusPainted(false);
		add(delete);

		// ==LABELS==
		title = new JLabel("-> Ingrese el indice del producto que desea eliminar");
		title.setBounds(16, 28, 700, 50);
		title.setForeground(Color.decode("#18093E"));
		title.setFont(new Font("Agency FB", Font.BOLD, 19));
		add(title);

		posicionPersonal = new JTextField();
		posicionPersonal.setBounds(143, 80, 50, 50);
		posicionPersonal.setFont(new Font("Agency FB", Font.BOLD, 30));
		posicionPersonal.setForeground(Color.decode("#18093E"));
		posicionPersonal.setBorder(null);
		add(posicionPersonal);

	}

	public JButton getbBack() {
		return bBack;
	}

	public void setbBack(JButton bBack) {
		this.bBack = bBack;
	}

	public JButton getDelete() {
		return delete;
	}

	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	public JTextField getPosicion() {
		return posicionPersonal;
	}

	public void setPosicion(JTextField posicion) {
		this.posicionPersonal = posicion;
	}

}
