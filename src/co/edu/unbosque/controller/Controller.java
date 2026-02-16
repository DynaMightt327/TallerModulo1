package co.edu.unbosque.controller;

import co.edu.unbosque.view.CreateCandyWindow;

import co.edu.unbosque.view.CreateCupWindow;
import co.edu.unbosque.view.CreatePersonalWindow;
import co.edu.unbosque.view.CreateSimpleWindow;
import co.edu.unbosque.view.CreateWomanWindow;
import co.edu.unbosque.view.DeletedCandyWindow;
import co.edu.unbosque.view.DeletedCupWindow;
import co.edu.unbosque.view.DeletedPersonalWindow;
import co.edu.unbosque.view.DeletedProductWindow;
import co.edu.unbosque.view.DeletedSimpleWindow;
import co.edu.unbosque.view.DeletedWomanWindow;
import co.edu.unbosque.view.OpWindow;
import co.edu.unbosque.view.PrincipalWindow;
import co.edu.unbosque.view.ReadCandyWindow;
import co.edu.unbosque.view.ReadCupWindow;
import co.edu.unbosque.view.ReadPersonalWindow;
import co.edu.unbosque.view.CreateProductWindow;
import co.edu.unbosque.view.ReadProductWindow;
import co.edu.unbosque.view.ReadSimpleWindow;
import co.edu.unbosque.view.ReadWomanWindow;
import co.edu.unbosque.view.UploadCandyWindow;
import co.edu.unbosque.view.UploadCupWindow;
import co.edu.unbosque.view.UploadPersonalWindow;
import co.edu.unbosque.view.UploadProductWindow;
import co.edu.unbosque.view.UploadSimpleWindow;
import co.edu.unbosque.view.UploadWomanWindow;
import co.edu.unbosque.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public class Controller implements ActionListener {

	private AnchetaDulce anchetaDulce;
	private AnchetaParaMujer anchetaParaMujer;
	private AnchetaPersonalizable anchetaPersonalizable;
	private AnchetaSencilla anchetaSencilla;
	private PocilloPersonalizable pocilloPersonalizable;
	
	private ArrayList<AnchetaDulce> listaAnchetaDulce;
	private ArrayList<AnchetaParaMujer> listaAnchetaMujer;
	private ArrayList<AnchetaPersonalizable> listaAnchetaPersonalizable;
	private ArrayList<AnchetaSencilla> listaAnchetaSencilla;
	private ArrayList<PocilloPersonalizable> listaPocilloPersonalizable;

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
	private UploadCandyWindow ucw;
	private UploadCupWindow ucpw;
	private UploadPersonalWindow upw;
	private UploadSimpleWindow usw;
	private UploadWomanWindow uww;

	private DeletedProductWindow dw;
	private DeletedCandyWindow dcw;
	private DeletedWomanWindow dww;
	private DeletedPersonalWindow dpw;
	private DeletedSimpleWindow dsw;
	private DeletedCupWindow dcpw;

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
		ucw = new UploadCandyWindow();
		ucpw = new UploadCupWindow();
		upw = new UploadPersonalWindow();
		usw = new UploadSimpleWindow();
		uww = new UploadWomanWindow();

		dw = new DeletedProductWindow();
		dcw = new DeletedCandyWindow();
		dww = new DeletedWomanWindow();
		dpw = new DeletedPersonalWindow();
		dsw = new DeletedSimpleWindow();
		dcpw = new DeletedCupWindow();
		
		listaAnchetaDulce = new ArrayList<>();
		listaAnchetaMujer = new ArrayList<>();
		listaAnchetaPersonalizable = new ArrayList<>();
		listaAnchetaSencilla = new ArrayList<>();
		listaPocilloPersonalizable = new ArrayList<>();

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
		
		ucw.getbBack().addActionListener(this);
		ucw.getbBack().setActionCommand("boton_back_candy_upload");

		uprw.getbAnchetaDulce().addActionListener(this);
		uprw.getbAnchetaDulce().setActionCommand("boton_candy_upload");

		ucpw.getbBack().addActionListener(this);
		ucpw.getbBack().setActionCommand("boton_back_cup_upload");
		
		uprw.getbPocilloPersonalizable().addActionListener(this);
		uprw.getbPocilloPersonalizable().setActionCommand("boton_cup_upload");

		upw.getbBack().addActionListener(this);
		upw.getbBack().setActionCommand("boton_back_personal_upload");
		
		uprw.getbAnchetaPersonalizable().addActionListener(this);
		uprw.getbAnchetaPersonalizable().setActionCommand("boton_personal_upload");

		usw.getbBack().addActionListener(this);
		usw.getbBack().setActionCommand("boton_back_simple_upload");
		
		uprw.getbAnchetaSencilla().addActionListener(this);
		uprw.getbAnchetaSencilla().setActionCommand("boton_simple_upload");
		
		uww.getbBack().addActionListener(this);
		uww.getbBack().setActionCommand("boton_back_woman_upload");
		
		uww.getUpload().addActionListener(this);
		uww.getUpload().setActionCommand("boton_update_woman");

		
		// ==VENTANA ELIMINAR==
		dw.getbBack().addActionListener(this);
		dw.getbBack().setActionCommand("boton_back_deleted");

		dcw.getbBack().addActionListener(this);
		dcw.getbBack().setActionCommand("boton_back_candy_deleted");

		dw.getbAnchetaDulce().addActionListener(this);
		dw.getbAnchetaDulce().setActionCommand("boton_candy_deleted");

		dww.getbBack().addActionListener(this);
		dww.getbBack().setActionCommand("boton_back_woman_deleted");

		dw.getbAnchetaParaMujer().addActionListener(this);
		dw.getbAnchetaParaMujer().setActionCommand("boton_woman_deleted");

		dpw.getbBack().addActionListener(this);
		dpw.getbBack().setActionCommand("boton_back_personal_deleted");

		dw.getbAnchetaPersonalizable().addActionListener(this);
		dw.getbAnchetaPersonalizable().setActionCommand("boton_personal_deleted");

		dsw.getbBack().addActionListener(this);
		dsw.getbBack().setActionCommand("boton_back_simple_deleted");

		dw.getbAnchetaSencilla().addActionListener(this);
		dw.getbAnchetaSencilla().setActionCommand("boton_simple_deleted");

		dcpw.getbBack().addActionListener(this);
		dcpw.getbBack().setActionCommand("boton_back_cup_deleted");

		dw.getbPocilloPersonalizable().addActionListener(this);
		dw.getbPocilloPersonalizable().setActionCommand("boton_cup_deleted");

		// ==BOTONES DE GUARDAR
		ccw.getbSave().addActionListener(this);
		ccw.getbSave().setActionCommand("boton_save_candy");
		
		cww.getbSave().addActionListener(this);
		cww.getbSave().setActionCommand("boton_save_woman");
		
		cpw.getbSave().addActionListener(this);
		cpw.getbSave().setActionCommand("boton_save_personal");
		
		csw.getbSave().addActionListener(this);
		csw.getbSave().setActionCommand("boton_save_simple");
		
		ccpw.getbSave().addActionListener(this);
		ccpw.getbSave().setActionCommand("boton_save_cup");
		
		
		dcw.getDelete().addActionListener(this);
		dcw.getDelete().setActionCommand("boton_delete_candy");
		
		dww.getDelete().addActionListener(this);
		dww.getDelete().setActionCommand("boton_delete_woman");
		
		dsw.getDelete().addActionListener(this);
		dsw.getDelete().setActionCommand("boton_delete_simple");
		
		dpw.getDelete().addActionListener(this);
		dpw.getDelete().setActionCommand("boton_delete_personal");
		
		dcpw.getDelete().addActionListener(this);
		dcpw.getDelete().setActionCommand("boton_delete_cup");
		
		
		
		ucw.getUpload().addActionListener(this);
		ucw.getUpload().setActionCommand("boton_upload_candy");
		
		uww.getUpload().addActionListener(this);
		uww.getUpload().setActionCommand("boton_upload_women");
		
		upw.getUpload().addActionListener(this);
		upw.getUpload().setActionCommand("boton_upload_personal");
		
		usw.getUpload().addActionListener(this);
		usw.getUpload().setActionCommand("boton_upload_simple");
		
		ucpw.getUpload().addActionListener(this);
		ucpw.getUpload().setActionCommand("boton_upload_cup");
		
		
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
			
			StringBuilder sb = new StringBuilder();
			if(listaAnchetaDulce.isEmpty()) {
				sb.append("No hay anchetas dulces registradas. \n");
			} else {
				for (int i = 0; i < listaAnchetaDulce.size(); i++) {
					AnchetaDulce a = listaAnchetaDulce.get(i);
					sb.append("Ancheta #").append(i + 1).append(":\n");
					sb.append(a.toString()).append("\n\n");
				}
			}
			
			rcw.getShowInfoCandy().setText(sb.toString());
			rcw.getShowInfoCandy().setCaretPosition(0);
			
			break;
		}

		case "boton_personal_read": {
			rprw.setVisible(false);
			rpw.setVisible(true);
			
			StringBuilder sb = new StringBuilder();
			if(listaAnchetaPersonalizable.isEmpty()) {
				sb.append("No hay anchetas personalizadas registradas. \n");
			} else {
				for (int i = 0; i < listaAnchetaPersonalizable.size(); i++) {
					AnchetaPersonalizable a = listaAnchetaPersonalizable.get(i);
					sb.append("Ancheta #").append(i + 1).append(":\n");
					sb.append(a.toString()).append("\n\n");
					
				}
			}
			rpw.getShowInfoPersonal().setText(sb.toString());
			rpw.getShowInfoPersonal().setCaretPosition(0);
			
			break;
		}
		case "boton_simple_read": {
			rprw.setVisible(false);
			rsw.setVisible(true);
			
			StringBuilder sb = new StringBuilder();
			if(listaAnchetaSencilla.isEmpty()) {
				sb.append("No hay anchetas sencilla registradas. \n");
			} else {
				for (int i = 0; i < listaAnchetaSencilla.size(); i++) {
					AnchetaSencilla a = listaAnchetaSencilla.get(i);
					sb.append("Ancheta #").append(i + 1).append(":\n");
					sb.append(a.toString()).append("\n\n");
					
				}
			}
			rsw.getShowInfoSimple().setText(sb.toString());
			rsw.getShowInfoSimple().setCaretPosition(0);
			break;
		}
		case "boton_woman_read": {
			rprw.setVisible(false);
			rww.setVisible(true);
			
			StringBuilder sb = new StringBuilder();
			if(listaAnchetaMujer.isEmpty()) {
				sb.append("No hay anchetas de mujeres registradas. \n");
			} else {
				for (int i = 0; i < listaAnchetaMujer.size(); i++) {
					AnchetaParaMujer a = listaAnchetaMujer.get(i);
					sb.append("Ancheta #").append(i + 1).append(":\n");
					sb.append(a.toString()).append("\n\n");
					
				}
			}
			rww.getShowInfoWoman().setText(sb.toString());
			rww.getShowInfoWoman().setCaretPosition(0);
			break;
		}
		case "boton_cup_read": {
			rprw.setVisible(false);
			rcpw.setVisible(true);
			
			StringBuilder sb = new StringBuilder();
			if(listaPocilloPersonalizable.isEmpty()) {
				sb.append("No hay pocillo personalizable registradas. \n");
			} else {
				for (int i = 0; i < listaPocilloPersonalizable.size(); i++) {
					PocilloPersonalizable a = listaPocilloPersonalizable.get(i);
					sb.append("pocillo #").append(i + 1).append(":\n");
					sb.append(a.toString()).append("\n\n");
					
				}
			}
			rcpw.getShowInfoCup().setText(sb.toString());
			rcpw.getShowInfoCup().setCaretPosition(0);
			break;
		}
		//-----------------------------------
		case "boton_upload": {
			ow.setVisible(false);
			uprw.setVisible(true);
			break;
		}
		case "boton_candy_upload": {
			uprw.setVisible(true);
			ucw.setVisible(true);
			break;
		}
		case "boton_cup_upload": {
			uprw.setVisible(true);
			ucpw.setVisible(true);
			break;
		}
		case "boton_personal_upload": {
			uprw.setVisible(true);
			upw.setVisible(true);
			break;
		}
		
		case "boton_simple_upload": {
			uprw.setVisible(true);
			usw.setVisible(true);
			break;
		}
		case "boton_woman_upload": {
			uprw.setVisible(true);
			uww.setVisible(true);
			break;
		}
		
		//--------------------------------
		case "boton_deleted": {
			ow.setVisible(false);
			dw.setVisible(true);
			break;
		}
		case "boton_candy_deleted": {
			dw.setVisible(true);
			dcw.setVisible(true);
			break;
		}
		case "boton_woman_deleted": {
			dw.setVisible(true);
			dww.setVisible(true);
			break;
		}
		case "boton_personal_deleted": {
			dw.setVisible(true);
			dpw.setVisible(true);
			break;
		}

		case "boton_simple_deleted": {
			dw.setVisible(true);
			dsw.setVisible(true);
			break;
		}
		case "boton_cup_deleted": {
			dw.setVisible(true);
			dcpw.setVisible(true);
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
			rpw.setVisible(false);
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
		case "boton_back_candy_upload": {
			ucw.setVisible(false);
			uprw.setVisible(true);
			break;
		}
		case "boton_back_cup_upload": {
			ucpw.setVisible(false);
			uprw.setVisible(true);
			break;
		}
		case "boton_back_personal_upload": {
			upw.setVisible(false);
			uprw.setVisible(true);
			break;
		}
		case "boton_back_simple_upload": {
			usw.setVisible(false);
			uprw.setVisible(true);
			break;
		}
		case "boton_back_woman_upload": {
			uww.setVisible(false);
			uprw.setVisible(true);
			break;
		}
		//-----------------------------------
		case "boton_back_deleted": {
			dw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		case "boton_back_candy_deleted": {
			dcw.setVisible(false);
			dw.setVisible(true);
			break;
		}
		case "boton_back_woman_deleted": {
			dww.setVisible(false);
			dw.setVisible(true);
			break;
		}
		case "boton_back_personal_deleted": {
			dpw.setVisible(false);
			dw.setVisible(true);
			break;
		}

		case "boton_back_simple_deleted": {
			dsw.setVisible(false);
			dw.setVisible(true);
			break;
		}
		case "boton_back_cup_deleted": {
			dcpw.setVisible(false);
			dw.setVisible(true);
			break;
		}

		// Botones guardar
		case "boton_save_candy": {
			try {
				int cantidad = Integer.parseInt(ccw.gettCantidadDulce().getText());
				String tipos = ccw.gettTipoDulce().getText();
				String nivel = ccw.gettNivelDulzor().getText();
				String marcaStr = (String) ccw.gettMarca().getSelectedItem();
				String siAzucarStr = (String) ccw.gettProductoSinAzucar().getSelectedItem();
				int precio = Integer.parseInt(ccw.gettPrecio().getText());
				
				
					AnchetaDulce anchetaDulce = new AnchetaDulce(cantidad, tipos, nivel, marcaStr, siAzucarStr, precio);
					listaAnchetaDulce.add(anchetaDulce);
					JOptionPane.showMessageDialog(null, "Ancheta creada: \n\n" + anchetaDulce.toString());
				}



			 catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos, intente de nuevo",
						"Error de formarto", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;

		} 
		case "boton_save_woman": {
			try {
				String estilo = cww.gettEstilo().getText();
				String accesorio = cww.gettAccesorio().getText();
				String paletaColor = cww.gettPaletaColor().getText();
				String enfoque = cww.gettEnfoque().getText();
				int precio = Integer.parseInt(cww.gettPrecio().getText());
				
				AnchetaParaMujer anchetaParaMujer = new AnchetaParaMujer(estilo, accesorio, paletaColor, enfoque, precio, enfoque);
				listaAnchetaMujer.add(anchetaParaMujer);
				JOptionPane.showMessageDialog(null, "Ancheta creada: \n\n" + anchetaParaMujer.toString());
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos, intente de nuevo",
						"Error de formarto", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
			
		}
		case "boton_save_personal": {
			try {
				String tieneGlobo = (String) cpw.gettTieneGlobo().getSelectedItem();
				int maximaCantidadProducto = Integer.parseInt(cpw.gettMaximaCantidadProducto().getText());
				String mensajeTarjeta = cpw.gettMensajeTarjeta().getText();
				String colorElegido = cpw.gettColorElegido().getText();
				int precio = Integer.parseInt(cpw.gettPrecio().getText());
				
				AnchetaPersonalizable anchetaPersonalizable = new AnchetaPersonalizable(tieneGlobo, maximaCantidadProducto, mensajeTarjeta, colorElegido, precio, colorElegido);
				listaAnchetaPersonalizable.add(anchetaPersonalizable);
				JOptionPane.showMessageDialog(null, "Ancheta creada: \n\n" + anchetaPersonalizable.toString());
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos, intente de nuevo",
						"Error de formarto", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
			
		}
		case "boton_save_simple": {
			try {
				int cantidadDeProducto = Integer.parseInt(csw.gettCantidadProducto().getText());
				String tienePocillo = (String) csw.gettTienePocillo().getSelectedItem();
				String nivelDeDecoracion = csw.gettNivelDeco().getText();
				String tipoEmpaque = csw.gettTipoEmpaque().getText();
				int precio = Integer.parseInt(csw.gettPrecio().getText());
				String aptaParaEntrega = (String) csw.gettAptaParaEntrega().getSelectedItem();
				
				AnchetaSencilla anchetaSencilla = new AnchetaSencilla(cantidadDeProducto, tienePocillo, nivelDeDecoracion, tipoEmpaque, precio, aptaParaEntrega);
				listaAnchetaSencilla.add(anchetaSencilla);
				JOptionPane.showMessageDialog(null, "Ancheta creada: \n\n" + anchetaSencilla.toString());
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos, intente de nuevo",
						"Error de formarto", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
			
		}
		case "boton_save_cup": {
			try {
			String materialPocillo = ccpw.gettMaterial().getText();
			String color = ccpw.gettColor().getText();
			String caracteristicaDePocillo = ccpw.gettCaracteristica().getText();
			int tamanoImpresion = Integer.parseInt(ccpw.gettTamanoImpresion().getText());
			String aptoMicroondas = (String) ccpw.gettAptoMicro().getSelectedItem();
			int precio = Integer.parseInt(ccpw.gettPrecio().getText());
			
			PocilloPersonalizable pocilloPersonalizable = new PocilloPersonalizable(materialPocillo, color, caracteristicaDePocillo, tamanoImpresion, aptoMicroondas, precio);
			listaPocilloPersonalizable.add(pocilloPersonalizable);
			JOptionPane.showMessageDialog(null, "Ancheta creada: \n\n" + pocilloPersonalizable.toString());
			
			} catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso de datos, intente de nuevo",
						"Error de formarto", JOptionPane.ERROR_MESSAGE);
			}
			break;
		}
		
		case"boton_delete_candy": {
			
			try {
				int indiceUsuario = Integer.parseInt(dcw.getPosicion().getText());
				int indiceLista = indiceUsuario - 1;
				if(listaAnchetaDulce.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas dulces registradas.", "lista vacia", JOptionPane.WARNING_MESSAGE);
					
				}else if(indiceLista < 0 || indiceLista >= listaAnchetaDulce.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaDulce.size(), "Indice incorrecto", JOptionPane.WARNING_MESSAGE);
					
				}else {
					AnchetaDulce eliminada = listaAnchetaDulce.remove(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta dulce eliminada:\n\n" + eliminada.toString(), "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_delete_woman": {
			
			try {
				int indiceUsuario = Integer.parseInt(dww.getPosicion().getText());
				int indiceLista = indiceUsuario - 1;
				if(listaAnchetaMujer.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas para mujer registradas.", "lista vacia", JOptionPane.WARNING_MESSAGE);
				}else if(indiceLista < 0 || indiceLista >= listaAnchetaMujer.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaMujer.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				} else {
					AnchetaParaMujer eliminada = listaAnchetaMujer.remove(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta para mujer eliminada: \n\n" + eliminada.toString(), "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
				}	
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_delete_personal": {
			
			try {
				int indiceUsuario = Integer.parseInt(dpw.getPosicion().getText());
				int indiceLista = indiceUsuario - 1;
				if(listaAnchetaPersonalizable.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas personalizables registradas.", "lista vacia", JOptionPane.WARNING_MESSAGE);
				}else if(indiceLista < 0 || indiceLista >= listaAnchetaPersonalizable.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaPersonalizable.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				} else {
					AnchetaPersonalizable eliminada = listaAnchetaPersonalizable.remove(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta personalizada eliminada: \n\n" + eliminada.toString(), "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
				}	
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_delete_simple": {
			
			try {
				int indiceUsuario = Integer.parseInt(dsw.getPosicion().getText());
				int indiceLista = indiceUsuario - 1;
				if(listaAnchetaSencilla.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas sencillas registradas.", "lista vacia", JOptionPane.WARNING_MESSAGE);
				}else if(indiceLista < 0 || indiceLista >= listaAnchetaSencilla.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaSencilla.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				} else {
					AnchetaSencilla eliminada = listaAnchetaSencilla.remove(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta sencilla eliminada: \n\n" + eliminada.toString(), "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
				}	
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_delete_cup": {
			
			try {
				int indiceUsuario = Integer.parseInt(dcpw.getPosicion().getText());
				int indiceLista = indiceUsuario - 1;
				if(listaPocilloPersonalizable.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay pocillos registradas.", "lista vacia", JOptionPane.WARNING_MESSAGE);
				}else if(indiceLista < 0 || indiceLista >= listaPocilloPersonalizable.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaPocilloPersonalizable.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				} else {
					PocilloPersonalizable eliminada = listaPocilloPersonalizable.remove(indiceLista);
					JOptionPane.showMessageDialog(null, "Pocillo personalizable eliminado: \n\n" + eliminada.toString(), "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
				}	
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_upload_candy": {
			try {
				
				int indiceUsuario = Integer.parseInt(ucw.getPosicionDulce().getText());
				int indiceLista = indiceUsuario - 1; 
				
				if(listaAnchetaDulce.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas dulces registradas.", "Lista vacia", JOptionPane.WARNING_MESSAGE);	
				} else if(indiceLista < 0 || indiceLista >= listaAnchetaDulce.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaDulce.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				}else {
					AnchetaDulce anchetaDulce = listaAnchetaDulce.get(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta a actualizar: (posicion" + indiceUsuario + "):\n\n" + anchetaDulce.toString(), "Informacion actual", JOptionPane.INFORMATION_MESSAGE);
					
					String nuevaCantidadStr = JOptionPane.showInputDialog(null, "Nueva cantidad de dulces:",anchetaDulce.getCantidadDulce());
					String nuevosTipos = JOptionPane.showInputDialog(null, "Nuevos tipos de dulces:", anchetaDulce.getTiposDeDulce());
					String nuevoNivelDulzor = JOptionPane.showInputDialog(null, "Nuevo nivel de dulzor:", anchetaDulce.getNivelDulzor());
					String nuevaMarca = JOptionPane.showInputDialog(null, "Marca reconocida:", anchetaDulce.getIncluyeMarcaReconocida());
					String nuevoSinAzucar = JOptionPane.showInputDialog(null, "Es sin azucar? (Si/No)", anchetaDulce.getTieneProductoSinAzucar());
					String nuevoPrecioStr = JOptionPane.showInputDialog(null, "Nuevo precio:", anchetaDulce.getPrecio());
					
					int nuevaCantidad = Integer.parseInt(nuevaCantidadStr);
					int nuevoPrecio = Integer.parseInt(nuevoPrecioStr);
					
					anchetaDulce.setCantidadDulce(nuevaCantidad);
					anchetaDulce.setTiposDeDulce(nuevosTipos);
					anchetaDulce.setNivelDulzor(nuevoNivelDulzor);
					anchetaDulce.setIncluyeMarcaReconocida(nuevaMarca);
					anchetaDulce.setTieneProductoSinAzucar(nuevoSinAzucar);
					anchetaDulce.setPrecio(nuevoPrecio);
					
					JOptionPane.showMessageDialog(null, "Ancheta dulce actualizada:\n\n" + anchetaDulce.toString(), "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);				
				}
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: El indice y los campos numericos deben ser numeros enteros validos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_upload_woman": {
			
			try {
				
				int indiceUsuario = Integer.parseInt(uww.getPosicion().getText());
				int indiceLista = indiceUsuario - 1;
				
				if(listaAnchetaMujer.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas para mujer registradas.", "Lista vacia", JOptionPane.WARNING_MESSAGE);
					break;
			} 
				if(indiceLista < 0 || indiceLista >= listaAnchetaMujer.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaMujer.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
					break;
				}
					
					AnchetaParaMujer anchetaParaMujer = listaAnchetaMujer.get(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta a actualizar: (posicion" + indiceUsuario + "):\n\n" + anchetaParaMujer.toString(), "Informacion actual", JOptionPane.INFORMATION_MESSAGE);
					
					
					String nuevoEstilo = JOptionPane.showInputDialog(null, "Nueva estilo:",anchetaParaMujer.getEstilo());
					String nuevoAccesorio = JOptionPane.showInputDialog(null, "Nuevos accesorios:", anchetaParaMujer.getAccesorio());
					String nuevaPaletaColor = JOptionPane.showInputDialog(null, "Nueva paleta de colores:", anchetaParaMujer.getPaletaColor());
					String nuevoEnfoque = JOptionPane.showInputDialog(null, "Nuevo enfoque:", anchetaParaMujer.getEnfoque());
					String nuevoPrecioStr = JOptionPane.showInputDialog(null, "Nuevo precio", anchetaParaMujer.getPrecio());
					String nuevoNivelDetalle = JOptionPane.showInputDialog(null, "Nuevo nivel de detalle:", anchetaParaMujer.getNivelDeDetalle());
					
					int nuevoPrecio = Integer.parseInt(nuevoPrecioStr);
					
					anchetaParaMujer.setEstilo(nuevoEstilo);
					anchetaParaMujer.setAccesorio(nuevoAccesorio);
					anchetaParaMujer.setPaletaColor(nuevaPaletaColor);
					anchetaParaMujer.setEnfoque(nuevoEnfoque);
					anchetaParaMujer.setPrecio(nuevoPrecio);
					anchetaParaMujer.setNivelDeDetalle(nuevoNivelDetalle);
					
					JOptionPane.showMessageDialog(null, "Ancheta para mujer actualizada:\n\n" + anchetaParaMujer.toString(), "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: El indice y los campos numericos deben ser numeros enteros validos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_upload_personal": {
			
			try {
				
				int indiceUsuario = Integer.parseInt(upw.getPosicionPersonal().getText());
				int indiceLista = indiceUsuario - 1;
				
				if(listaAnchetaPersonalizable.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas personalizadas registradas.", "Lista vacia", JOptionPane.WARNING_MESSAGE);	
				} else if(indiceLista < 0 || indiceLista >= listaAnchetaPersonalizable.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaPersonalizable.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				} else {
					
					AnchetaPersonalizable anchetaPersonalizable = listaAnchetaPersonalizable.get(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta a actualizar: (posicion" + indiceUsuario + "):\n\n" + anchetaPersonalizable.toString(), "Informacion actual", JOptionPane.INFORMATION_MESSAGE);
					
					
					String tieneGlobo = JOptionPane.showInputDialog(null, "Tiene globos:",anchetaPersonalizable.getTieneGlobo());
					String nuevaCantidadProducto = JOptionPane.showInputDialog(null, "Nueva cantidad de productos:", anchetaPersonalizable.getMaximaCantidadProducto());
					String nuevoMensajeTarjeta = JOptionPane.showInputDialog(null, "Nuevo mensaje de tarjeta:", anchetaPersonalizable.getMensajeTarjeta());
					String nuevoColorElegido = JOptionPane.showInputDialog(null, "Nuevo color elegido:", anchetaPersonalizable.getColorElegido());
					String nuevoPreciostr = JOptionPane.showInputDialog(null, "Nuevo precio", anchetaPersonalizable.getPrecio());
					String nuevoTamano = JOptionPane.showInputDialog(null, "Nuevo tamano:", anchetaPersonalizable.getTamano());
					
					int nuevoCantidadProducto = Integer.parseInt(nuevaCantidadProducto);
					int nuevoPrecio = Integer.parseInt(nuevoPreciostr);
					
					anchetaPersonalizable.setTieneGlobo(tieneGlobo);
					anchetaPersonalizable.setMaximaCantidadProducto(nuevoCantidadProducto);
					anchetaPersonalizable.setMensajeTarjeta(nuevoMensajeTarjeta);
					anchetaPersonalizable.setColorElegido(nuevoColorElegido);
					anchetaPersonalizable.setPrecio(nuevoPrecio);
					anchetaPersonalizable.setTamano(nuevoTamano);
					
					JOptionPane.showMessageDialog(null, "Ancheta personalizable actualizada:\n\n" + anchetaParaMujer.toString(), "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: El indice y los campos numericos deben ser numeros enteros validos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_upload_simple": {
			
			try {
				
				int indiceUsuario = Integer.parseInt(usw.getPosicionSimple().getText());
				int indiceLista = indiceUsuario - 1;
				
				if(listaAnchetaSencilla.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay anchetas sencillas registradas.", "Lista vacia", JOptionPane.WARNING_MESSAGE);	
				} else if(indiceLista < 0 || indiceLista >= listaAnchetaSencilla.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaAnchetaSencilla.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				} else {
					
					AnchetaSencilla anchetaSencilla = listaAnchetaSencilla.get(indiceLista);
					JOptionPane.showMessageDialog(null, "Ancheta a actualizar: (posicion" + indiceUsuario + "):\n\n" + anchetaSencilla.toString(), "Informacion actual", JOptionPane.INFORMATION_MESSAGE);
					
					
					String cantidadDeProductoStr = JOptionPane.showInputDialog(null, "Cantidad de productos:",anchetaSencilla.getCantidadDeProducto());
					String tienePocillo = JOptionPane.showInputDialog(null, "tiene pocillo? (si/no)", anchetaSencilla.getTienePocillo());
					String nuevoNivelDecoracion = JOptionPane.showInputDialog(null, "Nivel de decoracion:", anchetaSencilla.getNivelDeDecoracion());
					String nuevoTipoEmpaque = JOptionPane.showInputDialog(null, "Nuevo tipo de empaque:", anchetaSencilla.getTipoEmpaque());
					String nuevoPrecioStr = JOptionPane.showInputDialog(null, "Nuevo precio", anchetaSencilla.getPrecio());
					String nuevoEstadoEntrega = JOptionPane.showInputDialog(null, "Nuevo estado de entrega:", anchetaSencilla.getAptaParaEntrega());
					
					int cantidadDeProducto = Integer.parseInt(cantidadDeProductoStr);
					int nuevoPrecio = Integer.parseInt(nuevoPrecioStr);
					
					anchetaSencilla.setCantidadDeProducto(cantidadDeProducto);
					anchetaSencilla.setTienePocillo(tienePocillo);
					anchetaSencilla.setNivelDeDecoracion(nuevoNivelDecoracion);
					anchetaSencilla.setTipoEmpaque(nuevoTipoEmpaque);
					anchetaSencilla.setPrecio(nuevoPrecio);
					anchetaSencilla.setAptaParaEntrega(nuevoEstadoEntrega);
					
					JOptionPane.showMessageDialog(null, "Ancheta sencilla actualizada:\n\n" + anchetaSencilla.toString(), "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: El indice y los campos numericos deben ser numeros enteros validos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				// TODO: handle exception
			}
			break;
		}
		case "boton_upload_cup": {
			
			try {
				
				int indiceUsuario = Integer.parseInt(ucpw.getPosicionPocillo().getText());
				int indiceLista = indiceUsuario - 1;
				
				if(listaPocilloPersonalizable.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay pocillos personalizados registrados.", "Lista vacia", JOptionPane.WARNING_MESSAGE);	
				} else if(indiceLista < 0 || indiceLista >= listaPocilloPersonalizable.size()) {
					JOptionPane.showMessageDialog(null, "Indice invalido. Debe estar entre 1 y " + listaPocilloPersonalizable.size(), "indice incorrecto", JOptionPane.WARNING_MESSAGE);
				} else {
					
					PocilloPersonalizable pocilloPersonalizable = listaPocilloPersonalizable.get(indiceLista);
					JOptionPane.showMessageDialog(null, "Pocillo a actualizar: (posicion" + indiceUsuario + "):\n\n" + pocilloPersonalizable.toString(), "Informacion actual", JOptionPane.INFORMATION_MESSAGE);
					
					
					String NuevoMaterialPocillo = JOptionPane.showInputDialog(null, "Nuevo material:", pocilloPersonalizable.getMaterialPocillo());
					String nuevoColor = JOptionPane.showInputDialog(null, "Nuevo color:", pocilloPersonalizable.getColor());
					String nuevaCaracteristicaDePocillo = JOptionPane.showInputDialog(null, "Nueva caracteristica de pocillo:", pocilloPersonalizable.getCaracteristicaDePocillo());
					String nuevoTamanoImpresionStr = JOptionPane.showInputDialog(null, "Nuevo tamaño de impresion:", pocilloPersonalizable.getTamanoImpresion());
					String nuevoAptoMicroondas = JOptionPane.showInputDialog(null, "Apto para microondas? (si/no)", pocilloPersonalizable.getAptoMicroonda());
					String nuevoPrecioStr = JOptionPane.showInputDialog(null, "Nuevo precio:", pocilloPersonalizable.getPrecio());
					
					int tamanoImpresion = Integer.parseInt(nuevoTamanoImpresionStr);
					int nuevoPrecio = Integer.parseInt(nuevoPrecioStr);
					
					pocilloPersonalizable.setMaterialPocillo(NuevoMaterialPocillo);
					pocilloPersonalizable.setColor(nuevoColor);
					pocilloPersonalizable.setCaracteristicaDePocillo(nuevaCaracteristicaDePocillo);
					pocilloPersonalizable.setTamanoImpresion(tamanoImpresion);
					pocilloPersonalizable.setAptoMicroonda(nuevoAptoMicroondas);
					pocilloPersonalizable.setPrecio(nuevoPrecio);
					
					JOptionPane.showMessageDialog(null, "Pocillo personalizable actualizado:\n\n" + pocilloPersonalizable.toString(), "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Error: El indice y los campos numericos deben ser numeros enteros validos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
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
