package co.edu.unbosque.controller;

import co.edu.unbosque.view.CreateSimpleWindow;
import co.edu.unbosque.view.CreateWomanWindow;
import co.edu.unbosque.view.DeletedWindow;
import co.edu.unbosque.view.OpWindow;
import co.edu.unbosque.view.PrincipalWindow;
import co.edu.unbosque.view.ProductWindow;
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
	private CreateWomanWindow cww;
	private CreateSimpleWindow csw;
	private ReadWindow rw;
	private UploadWindow uw;
	private DeletedWindow dw;
	private ProductWindow prw;

	public Controller() {
		pw = new PrincipalWindow();
		ow = new OpWindow();
		cww = new CreateWomanWindow();
		csw = new CreateSimpleWindow();
		rw = new ReadWindow();
		uw = new UploadWindow();
		dw = new DeletedWindow();
		prw = new ProductWindow();
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
		
		prw.getbBack().addActionListener(this);
		prw.getbBack().setActionCommand("boton_back_product");
		
		prw.getbAnchetaDulce().addActionListener(this);
		prw.getbAnchetaDulce().setActionCommand("boton_product_create");
		
		prw.getbAnchetaParaMujer().addActionListener(this);
		prw.getbAnchetaParaMujer().setActionCommand("boton_woman_create");
	
		prw.getbAnchetaPersonalizable().addActionListener(this);
		prw.getbAnchetaPersonalizable().setActionCommand("boton_product_create");
		
		prw.getbAnchetaSencilla().addActionListener(this);
		prw.getbAnchetaSencilla().setActionCommand("boton_simple_create");
		
		prw.getbPocilloPersonalizable().addActionListener(this);
		prw.getbPocilloPersonalizable().setActionCommand("boton_product_create");
		
		cww.getbBack().addActionListener(this);
		cww.getbBack().setActionCommand("boton_back_woman_create");
		
		csw.getbBack().addActionListener(this);
		csw.getbBack().setActionCommand("boton_back_simple_create");
		

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
			prw.setVisible(true);
			break;
		}

		case "boton_woman_create": {
			prw.setVisible(false);
			cww.setVisible(true);
			break;
		}
		case "boton_simple_create": {
			prw.setVisible(false);
			csw.setVisible(true);
			break;
		}
		case "boton_product_create": {
			prw.setVisible(false);
			cww.setVisible(true);
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
		case "boton_back_product": {
			prw.setVisible(false);
			ow.setVisible(true);
			break;
		}

		case "boton_back_woman_create": {
			cww.setVisible(false);
			prw.setVisible(true);
			break;
		}
		case "boton_back_simple_create": {
			csw.setVisible(false);
			prw.setVisible(true);
			break;
		}
		case "boton_back_create": {
			csw.setVisible(false);
			prw.setVisible(true);
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
