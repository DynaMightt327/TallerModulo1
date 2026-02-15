package co.edu.unbosque.model;

public class AnchetaPersonalizable {
	
	private String tieneGlobo;
	private int maximaCantidadProducto;
	private String mensajeTarjeta;
	private String colorElegido;
	private int precio;
	private String tamano;
	
	public AnchetaPersonalizable() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaPersonalizable(String tieneGlobo, int maximaCantidadProducto, String mensajeTarjeta,
			String colorElegido, int precio, String tamano) {
		super();
		this.tieneGlobo = tieneGlobo;
		this.maximaCantidadProducto = maximaCantidadProducto;
		this.mensajeTarjeta = mensajeTarjeta;
		this.colorElegido = colorElegido;
		this.precio = precio;
		this.tamano = tamano;
	}

	public String getTieneGlobo() {
		return tieneGlobo;
	}

	public void setTieneGlobo(String tieneGlobo) {
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

	public String getColorElegido() {
		return colorElegido;
	}

	public void setColorElegido(String coloresElegido) {
		this.colorElegido = coloresElegido;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Ancheta Personalizable: \ntiene Globos: " + tieneGlobo + "\nmaxima cantidad de productos: " + maximaCantidadProducto
				+ "\nmensaje de la tarjeta: " + mensajeTarjeta + "\ncolores elegidos: " + colorElegido + "\nprecio: "
				+ precio + "\ntamaño: " + tamano + "\nrecuerde que cada tarda 24 horas" + "\n---------------------";
	}
	
	
	
}
