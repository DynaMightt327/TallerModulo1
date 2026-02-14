package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PrincipalWindow extends JFrame {

	private JLabel background;
	private JButton start;
	private JLabel title;
	private JLabel info;

	public PrincipalWindow() {
		initComponents();
		setVisible(true);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3");
		this.setBounds(250, 30, 880, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#FFFFFF"));
		

		// ===TITULOS===
		title = new JLabel("Lucky j3");
		title.setBounds(350, 220, 400, 100);
		title.setForeground(Color.decode("#18093E"));
		title.setFont(new Font("Agency FB", Font.BOLD, 70));
		add(title);
		
		info = new JLabel("Tienda de detalles");
		info.setBounds(375, 320, 300, 30);
		info.setForeground(Color.decode("#090316"));
		info.setFont(new Font("Agency FB", Font.BOLD, 25));
		add(info);

		// ===IMAGEN DE FONDO===
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("background.png"));
		background = new JLabel(backgroundImage);
		background.setBounds(0, 0, 900, 600);
		background.setLayout(null);
		background.setOpaque(true);
		add(background);
		
		// === BOTON DE INICIO DE LA APP===
		start = new JButton("Tienda de detalles");
		start.setBounds(320, 370, 150, 50);
		start.setBackground(Color.decode("#A663F8"));
		start.setBorderPainted(false);
		start.setFont(new Font("Agency FB", Font.BOLD, 20));
		add(start);
		
	}

}
