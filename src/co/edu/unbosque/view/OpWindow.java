package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpWindow extends JFrame {

	private JPanel topPanel;
	private JPanel centerPanel;
	private JButton bCreate;
	private JButton bRead;
	private JButton bUpload;
	private JButton bDeleted;
	private JLabel title;
	private JLabel logo;
	private JLabel lCreate;
	private JLabel lRead;
	private JLabel lUpload;
	private JLabel lDeleted;

	public OpWindow() {
		setVisible(false);
		initComponents();
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		
		this.setTitle("Lucky j3");
		this.setBounds(250, 30, 880, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#ECE7FE"));

		// ==PANEL SUPERIOR==
		
		topPanel = new JPanel();
		topPanel.setLayout(null);
		topPanel.setBounds(0, 0, 880, 120);
		topPanel.setBackground(Color.decode("#9B89D2"));
		add(topPanel);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBounds(60, 180, 750, 380);
		centerPanel.setBackground(Color.decode("#9B89D2"));
		add(centerPanel);

		// ==BOTONES==
		
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("Captura.JPG"));
		JLabel labelImagen1 = new JLabel(imagen1);
		bCreate = new JButton(imagen1);
		bCreate.setBounds(120, 150, 120, 120);
		bCreate.setBackground(Color.decode("#2B1B5A"));
		bCreate.setFocusPainted(false);
		bCreate.setBorderPainted(false);
		centerPanel.add(bCreate);
		
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("libro.JPG"));
		JLabel labelImagen2 = new JLabel(imagen2);
		bRead = new JButton(imagen2);
		bRead.setBounds(260, 150, 120, 120);
		bRead.setBackground(Color.decode("#2B1B5A"));
		bRead.setFocusPainted(false);
		bRead.setBorderPainted(false);
		centerPanel.add(bRead);

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("pintar.JPG"));
		JLabel labelImagen3 = new JLabel(imagen3);
		bUpload = new JButton(imagen3);
		bUpload.setBounds(400, 150, 120, 120);
		bUpload.setBackground(Color.decode("#2B1B5A"));
		bUpload.setFocusPainted(false);
		bUpload.setBorderPainted(false);
		centerPanel.add(bUpload);
		
		ImageIcon imagen4 = new ImageIcon(getClass().getResource("basura.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		bDeleted = new JButton(imagen4);
		bDeleted.setBounds(540, 150, 120, 120);
		bDeleted.setBackground(Color.decode("#2B1B5A"));
		bDeleted.setFocusPainted(false);
		bDeleted.setBorderPainted(false);
		centerPanel.add(bDeleted);
	
		//== LABELS==
		
		logo = new JLabel("LUCKY J3");
		logo.setBounds(330, 15, 550, 100);
		logo.setForeground(Color.decode("#18093E"));
		logo.setFont(new Font("Agency FB", Font.BOLD, 70));
		topPanel.add(logo);
		
		title = new JLabel("MENÚ DE ACCIONES");
		title.setBounds(160, 30, 550, 100);
		title.setForeground(Color.decode("#18093E"));
		title.setFont(new Font("Agency FB", Font.BOLD, 70));
		centerPanel.add(title);
		
		lCreate = new JLabel("CREATE");
		lCreate.setBounds(150, 280, 80, 30);
		lCreate.setForeground(Color.decode("#18093E"));
		lCreate.setFont(new Font("Agency FB", Font.BOLD, 28));
		centerPanel.add(lCreate);
		
		lRead = new JLabel("READ");
		lRead.setBounds(300, 280, 80, 30);
		lRead.setForeground(Color.decode("#18093E"));
		lRead.setFont(new Font("Agency FB", Font.BOLD, 28));
		centerPanel.add(lRead);
		
		lUpload = new JLabel("UPLOAD");
		lUpload.setBounds(430, 280, 80, 30);
		lUpload.setForeground(Color.decode("#18093E"));
		lUpload.setFont(new Font("Agency FB", Font.BOLD, 28));
		centerPanel.add(lUpload);
		
		lDeleted = new JLabel("DELETED");
		lDeleted.setBounds(570, 280, 80, 30);
		lDeleted.setForeground(Color.decode("#18093E"));
		lDeleted.setFont(new Font("Agency FB", Font.BOLD, 28));
		centerPanel.add(lDeleted);
	
	}

}
