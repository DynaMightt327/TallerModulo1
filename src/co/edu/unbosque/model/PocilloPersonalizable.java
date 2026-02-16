package co.edu.unbosque.model;

public class PocilloPersonalizable {
	
	private String materialPocillo;
	private String color;
	private String caracteristicaDePocillo;
	private int tamanoImpresion;
	private String aptoMicroonda;
	private int precio;
	
	public PocilloPersonalizable() {
		// TODO Auto-generated constructor stub
	}

	public PocilloPersonalizable(String materialPocillo, String color, String caracteristicaDePocillo,
			int tamanoImpresion, String aptoMicroonda, int precio) {
		super();
		this.materialPocillo = materialPocillo;
		this.color = color;
		this.caracteristicaDePocillo = caracteristicaDePocillo;
		this.tamanoImpresion = tamanoImpresion;
		this.aptoMicroonda = aptoMicroonda;
		this.precio = precio;
	}

	public String getMaterialPocillo() {
		return materialPocillo;
	}

	public void setMaterialPocillo(String materialPocillo) {
		this.materialPocillo = materialPocillo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCaracteristicaDePocillo() {
		return caracteristicaDePocillo;
	}

	public void setCaracteristicaDePocillo(String caracteristicaDePocillo) {
		this.caracteristicaDePocillo = caracteristicaDePocillo;
	}

	public int getTamanoImpresion() {
		return tamanoImpresion;
	}

	public void setTamanoImpresion(int tamanoImpresion) {
		this.tamanoImpresion = tamanoImpresion;
	}

	public String getAptoMicroonda() {
		return aptoMicroonda;
	}

	public void setAptoMicroonda(String aptoMicroonda) {
		this.aptoMicroonda = aptoMicroonda;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pocillo Personalizable: \nmaterial del pocillo: " + materialPocillo + "\ncolor: " + color
				+ "\ncaracteristicas del pocillo: " + caracteristicaDePocillo + "\ntamaño de impresion: " + tamanoImpresion
				+ "\napto para microonda: " + aptoMicroonda + "\nprecio: " + precio + "\nrecuerde que cada pedido tarda 24 horas" + "\n---------------------";
	}
	
	

}
