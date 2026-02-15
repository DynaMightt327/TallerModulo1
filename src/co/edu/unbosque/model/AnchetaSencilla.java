package co.edu.unbosque.model;

public class AnchetaSencilla {
	
	private int cantidadDeProducto;
	private String tienePocillo;
	private String nivelDeDecoracion;
	private String tipoEmpaque;
	private int precio;
	private String aptaParaEntrega;
	
	public AnchetaSencilla() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaSencilla(int cantidadDeProducto, String tienePocillo, String nivelDeDecoracion, String tipoEmpaque,
			int precio, String aptaParaEntrega) {
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

	public String getTienePocillo() {
		return tienePocillo;
	}

	public void setTienePocillo(String tienePocillo) {
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

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getAptaParaEntrega() {
		return aptaParaEntrega;
	}

	public void setAptaParaEntrega(String aptaParaEntrega) {
		this.aptaParaEntrega = aptaParaEntrega;
	}

	@Override
	public String toString() {
		return "Ancheta Sencilla: \ncantidad de productos: " + cantidadDeProducto + "\ntiene pocillo: " + tienePocillo
				+ "\nnivel de decoracion: " + nivelDeDecoracion + "\ntipo de empaque: " + tipoEmpaque + "\nprecio: " + precio
				+ "\napta para la entrega: " + aptaParaEntrega;
	}
	
	

}
