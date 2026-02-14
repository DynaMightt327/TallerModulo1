package co.edu.unbosque.controller;

import co.edu.unbosque.view.OpWindow;
import co.edu.unbosque.view.PrincipalWindow;

public class Controller {
	
	private PrincipalWindow pw;
	private OpWindow ow;
	
	public Controller() {
		pw = new PrincipalWindow();
		ow = new OpWindow();
	}
	
	public void runGui() {
		ow.setVisible(true);
		
		//El panadero con el pann, TUTU!
		
	}

}
