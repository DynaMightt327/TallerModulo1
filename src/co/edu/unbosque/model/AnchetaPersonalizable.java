package co.edu.unbosque.model;

public class AnchetaPersonalizable {
	
	private boolean tieneGlobo;
	private int maximaCantidadProducto;
	private String mensajeTarjeta;
	private String coloresElegidos;
	private boolean incluyeFoto;
	private String tamano;
	
	public AnchetaPersonalizable() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaPersonalizable(boolean tieneGlobo, int maximaCantidadProducto, String mensajeTarjeta,
			String coloresElegidos, boolean incluyeFoto, String tamano) {
		super();
		this.tieneGlobo = tieneGlobo;
		this.maximaCantidadProducto = maximaCantidadProducto;
		this.mensajeTarjeta = mensajeTarjeta;
		this.coloresElegidos = coloresElegidos;
		this.incluyeFoto = incluyeFoto;
		this.tamano = tamano;
	}

	public boolean isTieneGlobo() {
		return tieneGlobo;
	}

	public void setTieneGlobo(boolean tieneGlobo) {
		this.tieneGlobo = tieneGlobo;
	}

	public int getMaximaCantidadProducto() {
		return maximaCantidadProducto;
	}

	public void setMaximaCantidadProducto(int maximaCantidadProducto) {
		this.maximaCantidadProducto = maximaCantidadProducto;
	}

	public String getMensajeTarjeta() {
		return mensajeTarjeta;
	}

	public void setMensajeTarjeta(String mensajeTarjeta) {
		this.mensajeTarjeta = mensajeTarjeta;
	}

	public String getColoresElegidos() {
		return coloresElegidos;
	}

	public void setColoresElegidos(String coloresElegidos) {
		this.coloresElegidos = coloresElegidos;
	}

	public boolean isIncluyeFoto() {
		return incluyeFoto;
	}

	public void setIncluyeFoto(boolean incluyeFoto) {
		this.incluyeFoto = incluyeFoto;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "AnchetaPersonalizable: \ntieneGlobo: " + tieneGlobo + "\nmaximaCantidadProducto: " + maximaCantidadProducto
				+ "\nmensajeTarjeta: " + mensajeTarjeta + "\ncoloresElegidos: " + coloresElegidos + "\nincluyeFoto: "
				+ incluyeFoto + "\ntamano: " + tamano;
	}
	
	
	
}
