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

	public PrincipalWindow() {
		initComponents();
		setVisible(true);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3");
		this.setBounds(250, 30, 880, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#FFFFFF"));

		// ===TITULOS===
		title = new JLabel("Lucky j3");
		title.setBounds(350, 220, 200, 100);
		title.setForeground(Color.decode("#18093E"));
		title.setFont(new Font("Agency FB", Font.BOLD, 70));
		add(title);

		// ===IMAGEN DE FONDO===
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("background.png"));
		background = new JLabel(backgroundImage);
		background.setBounds(0, 0, 900, 650);
		background.setLayout(null);
		background.setOpaque(true);
		add(background);

		// === BOTON DE INICIO DE LA APP===
		start = new JButton("Tienda de detalles");
		start.setBounds(360, 330, 170, 50);
		start.setFont(new Font("Agency FB", Font.BOLD, 22));
		start.setBackground(Color.decode("#130344"));
		start.setForeground(Color.decode("#FFFFFF"));
		start.setBorderPainted(false);
		start.setFocusPainted(false);
		background.add(start);

	}

}
