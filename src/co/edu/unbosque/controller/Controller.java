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
import co.edu.unbosque.view.UploadProductWindow;
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
	
	//aaaaa
	
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
		
		//--------------------------------
		case "boton_deleted": {
			ow.setVisible(false);
			dw.setVisible(true);
			break;
		}
		case "boton_candy_deleted": {
			dw.setVisible(false);
			dcw.setVisible(true);
			break;
		}
		case "boton_woman_deleted": {
			dw.setVisible(false);
			dww.setVisible(true);
			break;
		}
		case "boton_personal_deleted": {
			dw.setVisible(false);
			dpw.setVisible(true);
			break;
		}

		case "boton_simple_deleted": {
			dw.setVisible(false);
			dsw.setVisible(true);
			break;
		}
		case "boton_cup_deleted": {
			dw.setVisible(false);
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
		default:
			break;
		}
	}
	


	public void iniciar() {
		pw.setVisible(true);

	}

}
