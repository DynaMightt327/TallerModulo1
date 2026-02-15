package co.edu.unbosque.model;

public class AnchetaSencilla {
	
	private int cantidadDeProducto;
	private boolean tienePocillo;
	private String nivelDeDecoracion;
	private String tipoEmpaque;
	private float precio;
	private boolean aptaParaEntrega;
	
	public AnchetaSencilla() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaSencilla(int cantidadDeProducto, boolean tienePocillo, String nivelDeDecoracion, String tipoEmpaque,
			float precio, boolean aptaParaEntrega) {
		super();
		this.cantidadDeProducto = cantidadDeProducto;
		this.tienePocillo = tienePocillo;
		this.nivelDeDecoracion = nivelDeDecoracion;
		this.tipoEmpaque = tipoEmpaque;
		this.precio = precio;
		this.aptaParaEntrega = aptaParaEntrega;
	}

	public int getCantidadDeProducto() {
		return cantidadDeProducto;
	}

	public void setCantidadDeProducto(int cantidadDeProducto) {
		this.cantidadDeProducto = cantidadDeProducto;
	}

	public boolean isTienePocillo() {
		return tienePocillo;
	}

	public void setTienePocillo(boolean tienePocillo) {
		this.tienePocillo = tienePocillo;
	}

	public String getNivelDeDecoracion() {
		return nivelDeDecoracion;
	}

	public void setNivelDeDecoracion(String nivelDeDecoracion) {
		this.nivelDeDecoracion = nivelDeDecoracion;
	}

	public String getTipoEmpaque() {
		return tipoEmpaque;
	}

	public void setTipoEmpaque(String tipoEmpaque) {
		this.tipoEmpaque = tipoEmpaque;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isAptaParaEntrega() {
		return aptaParaEntrega;
	}

	public void setAptaParaEntrega(boolean aptaParaEntrega) {
		this.aptaParaEntrega = aptaParaEntrega;
	}

	@Override
	public String toString() {
		return "Ancheta Sencilla: \ncantidad de productos: " + cantidadDeProducto + "\ntiene pocillo: " + tienePocillo
				+ "\nnivel de decoracion: " + nivelDeDecoracion + "\ntipo de empaque: " + tipoEmpaque + "\nprecio: " + precio
				+ "\napta para la entrega: " + aptaParaEntrega;
	}
	
	

}
