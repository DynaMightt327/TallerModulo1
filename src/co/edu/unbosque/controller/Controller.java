package co.edu.unbosque.controller;

import co.edu.unbosque.view.CreateCandyWindow;

import co.edu.unbosque.view.CreateCupWindow;
import co.edu.unbosque.view.CreatePersonalWindow;
import co.edu.unbosque.view.CreateSimpleWindow;
import co.edu.unbosque.view.CreateWomanWindow;
import co.edu.unbosque.view.DeletedWindow;
import co.edu.unbosque.view.OpWindow;
import co.edu.unbosque.view.PrincipalWindow;
import co.edu.unbosque.view.CreateProductWindow;
import co.edu.unbosque.view.ReadWindow;
import co.edu.unbosque.view.UploadWindow;
import co.edu.unbosque.model.*;

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
	private CreatePersonalWindow cpw;
	private CreateCandyWindow ccw;
	private CreateCupWindow ccpw;
	private ReadWindow rw;
	private UploadWindow uw;
	private DeletedWindow dw;
	private CreateProductWindow cprw;

	public Controller() {
		pw = new PrincipalWindow();
		ow = new OpWindow();
		cww = new CreateWomanWindow();
		csw = new CreateSimpleWindow();
		cpw = new CreatePersonalWindow();
		ccw = new CreateCandyWindow();
		ccpw = new CreateCupWindow();
		rw = new ReadWindow();
		uw = new UploadWindow();
		dw = new DeletedWindow();
		cprw = new CreateProductWindow();
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
		
		cprw.getbBack().addActionListener(this);
		cprw.getbBack().setActionCommand("boton_back_product");
		
		cprw.getbAnchetaDulce().addActionListener(this);
		cprw.getbAnchetaDulce().setActionCommand("boton_candy_create");
		
		cprw.getbAnchetaParaMujer().addActionListener(this);
		cprw.getbAnchetaParaMujer().setActionCommand("boton_woman_create");
	
		cprw.getbAnchetaPersonalizable().addActionListener(this);
		cprw.getbAnchetaPersonalizable().setActionCommand("boton_personal_create");
		
		cprw.getbAnchetaSencilla().addActionListener(this);
		cprw.getbAnchetaSencilla().setActionCommand("boton_simple_create");
		
		cprw.getbPocilloPersonalizable().addActionListener(this);
		cprw.getbPocilloPersonalizable().setActionCommand("boton_cup_create");
		
		cww.getbBack().addActionListener(this);
		cww.getbBack().setActionCommand("boton_back_woman_create");
		
		csw.getbBack().addActionListener(this);
		csw.getbBack().setActionCommand("boton_back_simple_create");
		
		cpw.getbBack().addActionListener(this);
		cpw.getbBack().setActionCommand("boton_back_personal_create");
		
		ccw.getbBack().addActionListener(this);
		ccw.getbBack().setActionCommand("boton_back_candy_create");
		
		ccpw.getbBack().addActionListener(this);
		ccpw.getbBack().setActionCommand("boton_back_cup_create");

		// ==VENTANA LEER==
		rw.getbBack().addActionListener(this);
		rw.getbBack().setActionCommand("boton_back_read");

		// ==VENTANA ACTUALIZAR==
		uw.getbBack().addActionListener(this);
		uw.getbBack().setActionCommand("boton_back_upload");

		// ==VENTANA ELIMINAR==
		dw.getbBack().addActionListener(this);
		dw.getbBack().setActionCommand("boton_back_deleted");
		
		ccw.getbSave().addActionListener(this);
		ccw.getbSave().setActionCommand("boton_save_candy");


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
			cprw.setVisible(true);
			break;
		}

		case "boton_woman_create": {
			cprw.setVisible(false);
			cww.setVisible(true);
			break;
		}
		case "boton_simple_create": {
			cprw.setVisible(false);
			csw.setVisible(true);
			break;
		}
		case "boton_personal_create": {
			cprw.setVisible(false);
			cpw.setVisible(true);
			break;
		}
		case "boton_candy_create": {
			cprw.setVisible(false);
			ccw.setVisible(true);
			break;
		}
		case "boton_cup_create": {
			cprw.setVisible(false);
			ccpw.setVisible(true);
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
			cprw.setVisible(false);
			ow.setVisible(true);
			break;
		}

		case "boton_back_woman_create": {
			cww.setVisible(false);
			cprw.setVisible(true);
			break;
		}
		case "boton_back_simple_create": {
			csw.setVisible(false);
			cprw.setVisible(true);
			break;
		}
		case "boton_back_personal_create": {
			cpw.setVisible(false);
			cprw.setVisible(true);
			break;
		}
		case "boton_back_candy_create": {
			ccw.setVisible(false);
			cprw.setVisible(true);
			break;
		}
		case "boton_back_cup_create": {
			ccpw.setVisible(false);
			cprw.setVisible(true);
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
		
		//Botones guardar
		case "boton_save_candy": {
			try {
				int cantidad = Integer.parseInt(ccw.getlCantidadDulce().getText());
				String tipos = ccw.getlTipoDulce().getText();
				String nivel = ccw.getlNivelDulzor().getText();
				//boolean marca = ccw.getlMarca().is
				//boolean siAzucar = ccw.getlProductoSinAzucar().getText();
				float precio = Float.parseFloat(ccw.getlPrecio().getText());
				
				AnchetaDulce anchetaDulce = new AnchetaDulce(cantidad, tipos, nivel, false, false, precio);
				
				JOptionPane.showMessageDialog(null, "Ancheta creada: \n\n" + anchetaDulce.toString());
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos, intente de nuevo", "Error de formarto",
				JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
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
