package co.edu.unbosque.controller;

import co.edu.unbosque.view.CreateWindow;
import co.edu.unbosque.view.DeletedWindow;
import co.edu.unbosque.view.OpWindow;
import co.edu.unbosque.view.PrincipalWindow;
import co.edu.unbosque.view.ReadWindow;
import co.edu.unbosque.view.UploadWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public class Controller implements ActionListener {

	private PrincipalWindow pw;
	private OpWindow ow;
	private CreateWindow cw;
	private ReadWindow rw;
	private UploadWindow uw;
	private DeletedWindow dw;

	public Controller() {
		pw = new PrincipalWindow();
		ow = new OpWindow();
		cw = new CreateWindow();
		rw = new ReadWindow();
		uw = new UploadWindow();
		dw = new DeletedWindow();
		asignarOyentes();
	}

	public void asignarOyentes() {
		// ==PRIMERA VENTANA==
		pw.getStart().addActionListener(this);
		pw.getStart().setActionCommand("boton_start");

		// ==VENTANA CRUD==
		ow.getbCreate().addActionListener(this);
		ow.getbCreate().setActionCommand("boton_create");

		ow.getbRead().addActionListener(this);
		ow.getbRead().setActionCommand("boton_read");

		ow.getbUpload().addActionListener(this);
		ow.getbUpload().setActionCommand("boton_upload");

		ow.getbDeleted().addActionListener(this);
		ow.getbDeleted().setActionCommand("boton_deleted");

		// ==VENTANA CREAR==
		cw.getbBack().addActionListener(this);
		cw.getbBack().setActionCommand("boton_back_create");

		// ==VENTANA LEER==
		rw.getbBack().addActionListener(this);
		rw.getbBack().setActionCommand("boton_back_read");

		// ==VENTANA ACTUALIZAR==
		uw.getbBack().addActionListener(this);
		uw.getbBack().setActionCommand("boton_back_upload");

		// ==VENTANA ELIMINAR==
		dw.getbBack().addActionListener(this);
		dw.getbBack().setActionCommand("boton_back_deleted");

	}

	public void actionPerformed(ActionEvent e) {

		String alias = e.getActionCommand();
		switch (alias) {
		// ==VENTANA INICIAL==
		case "boton_start": {
			pw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		// ==BOTONES VENTANA CRUD==
		case "boton_create": {
			ow.setVisible(false);
			cw.setVisible(true);
			break;
		}
		case "boton_read": {
			ow.setVisible(false);
			rw.setVisible(true);
			break;
		}
		case "boton_upload": {
			ow.setVisible(false);
			uw.setVisible(true);
			break;
		}
		case "boton_deleted": {
			ow.setVisible(false);
			dw.setVisible(true);
			break;
		}

		// ==BOTONES DE VOLVER AL CRUD==
		case "boton_back_create": {
			cw.setVisible(false);
			ow.setVisible(true);
			break;
		}

		case "boton_back_read": {
			rw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		case "boton_back_upload": {
			uw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		case "boton_back_deleted": {
			dw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		default:
			break;
		}

	}

	public void runGui() {
		pw.setVisible(true);

	}

}
