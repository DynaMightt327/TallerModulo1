package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreateWindow extends JFrame {

	private JButton bBack;

	public CreateWindow() {
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
		this.getContentPane().setBackground(Color.decode("#FFFFFF"));

		// ==BOTONES==
		bBack = new JButton("Volver");
		bBack.setBounds(360, 330, 170, 50);
		bBack.setFont(new Font("Agency FB", Font.BOLD, 22));
		bBack.setBackground(Color.decode("#130344"));
		bBack.setForeground(Color.decode("#FFFFFF"));
		bBack.setBorderPainted(false);
		bBack.setFocusPainted(false);
		add(bBack);

	}

}
