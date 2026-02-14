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
		
		pw.getStart().addActionListener(this);
		pw.getStart().setActionCommand("boton_start");
		
		ow.getbCreate().addActionListener(this);
		ow.getbCreate().setActionCommand("boton_create");
		
		ow.getbRead().addActionListener(this);
		ow.getbRead().setActionCommand("boton_read");
		
		ow.getbUpload().addActionListener(this);
		ow.getbUpload().setActionCommand("boton_upload");
		
		ow.getbDeleted().addActionListener(this);
		ow.getbDeleted().setActionCommand("boton_deleted");
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String alias = e.getActionCommand();
		switch (alias) {
		case "boton_start": {
			pw.setVisible(false);
			ow.setVisible(true);
			break;
		}
		
		case "boton_create":{
			ow.setVisible(false);
			cw.setVisible(true);
			break;
		}
		case "boton_read":{
			ow.setVisible(false);
			rw.setVisible(true);
			break;
		}
		case "boton_upload":{
			ow.setVisible(false);
			uw.setVisible(true);
			break;
		}
		case "boton_deleted":{
			ow.setVisible(false);
			dw.setVisible(true);
			break;
		}
		/*case "boton_":{
			
			break;
		}*/
		default:
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void runGui() {
		pw.setVisible(true);
		
	}

}
