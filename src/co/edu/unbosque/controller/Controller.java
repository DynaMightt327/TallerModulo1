package co.edu.unbosque.controller;

import co.edu.unbosque.view.CreateCandyWindow;

import co.edu.unbosque.view.CreateCupWindow;
import co.edu.unbosque.view.CreatePersonalWindow;
import co.edu.unbosque.view.CreateSimpleWindow;
import co.edu.unbosque.view.CreateWomanWindow;
import co.edu.unbosque.view.DeletedProductWindow;
import co.edu.unbosque.view.OpWindow;
import co.edu.unbosque.view.PrincipalWindow;
import co.edu.unbosque.view.ReadCandyWindow;
import co.edu.unbosque.view.ReadCupWindow;
import co.edu.unbosque.view.ReadPersonalWindow;
import co.edu.unbosque.view.CreateProductWindow;
import co.edu.unbosque.view.ReadProductWindow;
import co.edu.unbosque.view.ReadSimpleWindow;
import co.edu.unbosque.view.ReadWomanWindow;
import co.edu.unbosque.view.UploadProductWindow;
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

	private CreateProductWindow cprw;
	private CreateCandyWindow ccw;
	private CreateWomanWindow cww;
	private CreateSimpleWindow csw;
	private CreatePersonalWindow cpw;
	private CreateCupWindow ccpw;

	private ReadProductWindow rprw;
	private ReadCandyWindow rcw;
	private ReadPersonalWindow rpw;
	private ReadSimpleWindow rsw;
	private ReadWomanWindow rww;
	private ReadCupWindow rcpw;

	private UploadProductWindow uprw;

	private DeletedProductWindow dw;

	public Controller() {
		pw = new PrincipalWindow();
		ow = new OpWindow();

		cprw = new CreateProductWindow();
		cww = new CreateWomanWindow();
		csw = new CreateSimpleWindow();
		cpw = new CreatePersonalWindow();
		ccw = new CreateCandyWindow();
		ccpw = new CreateCupWindow();
		rcpw = new ReadCupWindow();

		rprw = new ReadProductWindow();
		rcw = new ReadCandyWindow();
		rpw = new ReadPersonalWindow();
		rsw = new ReadSimpleWindow();
		rww = new ReadWomanWindow();

		uprw = new UploadProductWindow();

		dw = new DeletedProductWindow();
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
		rprw.getbBack().addActionListener(this);
		rprw.getbBack().setActionCommand("boton_back_read");
				

		rcw.getbBack().addActionListener(this);
		rcw.getbBack().setActionCommand("boton_back_candy_read");

		rprw.getbAnchetaDulce().addActionListener(this);
		rprw.getbAnchetaDulce().setActionCommand("boton_candy_read");
		
		rpw.getbBack().addActionListener(this);
		rpw.getbBack().setActionCommand("boton_back_personal_read");
		
		rprw.getbAnchetaPersonalizable().addActionListener(this);
		rprw.getbAnchetaPersonalizable().setActionCommand("boton_personal_read");
		
		rsw.getbBack().addActionListener(this);
		rsw.getbBack().setActionCommand("boton_back_simple_read");
		
		rprw.getbAnchetaSencilla().addActionListener(this);
		rprw.getbAnchetaSencilla().setActionCommand("boton_simple_read");
		
		rww.getbBack().addActionListener(this);
		rww.getbBack().setActionCommand("boton_back_woman_read");
		
		rprw.getbAnchetaParaMujer().addActionListener(this);
		rprw.getbAnchetaParaMujer().setActionCommand("boton_woman_read");

		rcpw.getbBack().addActionListener(this);
		rcpw.getbBack().setActionCommand("boton_back_cup_read");
		
		rprw.getbPocilloPersonalizable().addActionListener(this);
		rprw.getbPocilloPersonalizable().setActionCommand("boton_cup_read");
		// ==VENTANA ACTUALIZAR==

		uprw.getbBack().addActionListener(this);
		uprw.getbBack().setActionCommand("boton_back_upload");

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
		// ==BOTONES VENTANAS CREAR==
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
		// ==BOTONES VENTANAS LEER==
		case "boton_read": {
			ow.setVisible(false);
			rprw.setVisible(true);
			break;
		}
		case "boton_candy_read": {
			rprw.setVisible(false);
			rcw.setVisible(true);
			break;
		}

		case "boton_personal_read": {
			rprw.setVisible(false);
			rpw.setVisible(true);
			break;
		}
		case "boton_simple_read": {
			rprw.setVisible(false);
			rsw.setVisible(true);
			break;
		}
		case "boton_woman_read": {
			rprw.setVisible(false);
			rww.setVisible(true);
			break;
		}
		case "boton_cup_read": {
			rprw.setVisible(false);
			rcpw.setVisible(true);
			break;
		}
//-----------------------------------
		case "boton_upload": {
			ow.setVisible(false);
			uprw.setVisible(true);
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
		//--------------------------------
		case "boton_back_read": {
			rprw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		case "boton_back_candy_read": {
			rcw.setVisible(false);
			rprw.setVisible(true);
			break;
		}
		case "boton_back_personal_read": {
			rcw.setVisible(false);
			rprw.setVisible(true);
			break;
		}
		case "boton_back_simple_read": {
			rsw.setVisible(false);
			rprw.setVisible(true);
			break;
		}
		case "boton_back_woman_read": {
			rww.setVisible(false);
			rprw.setVisible(true);
			break;
		}
		case "boton_back_cup_read": {
			rcpw.setVisible(false);
			rprw.setVisible(true);
			break;
		}
		//-----------------------------------
		case "boton_back_upload": {
			uprw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		case "boton_back_deleted": {
			dw.setVisible(false);
			ow.setVisible(true);
			break;
		}

		// Botones guardar
		case "boton_save_candy": {
			try {
				int cantidad = Integer.parseInt(ccw.getlCantidadDulce().getText());
				String tipos = ccw.getlTipoDulce().getText();
				String nivel = ccw.getlNivelDulzor().getText();
				// boolean marca = ccw.getlMarca().is
				// boolean siAzucar = ccw.getlProductoSinAzucar().getText();
				float precio = Float.parseFloat(ccw.getlPrecio().getText());

				AnchetaDulce anchetaDulce = new AnchetaDulce(cantidad, tipos, nivel, false, false, precio);

				JOptionPane.showMessageDialog(null, "Ancheta creada: \n\n" + anchetaDulce.toString());

			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos, intente de nuevo",
						"Error de formarto", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;

		}
		default:
			break;
		}

	}

	public void iniciar() {
		pw.setVisible(true);

	}

}
