package co.edu.unbosque.controller;

import co.edu.unbosque.view.PrincipalWindow;

public class Controller {
	
	private PrincipalWindow pw;
	
	public Controller() {
		pw = new PrincipalWindow();
	}
	
	public void runGui() {
		pw.setVisible(true);
		
	}

}
