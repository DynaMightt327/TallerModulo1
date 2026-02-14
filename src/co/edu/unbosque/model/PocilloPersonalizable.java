package co.edu.unbosque.model;

public class PocilloPersonalizable {
	
	private String materialPocillo;
	private String color;
	private String caracteristicaDePocillo;
	private int tamanoImpresion;
	private boolean aptoMicroonda;
	private boolean aptoLavavajilla;
	
	public PocilloPersonalizable() {
		// TODO Auto-generated constructor stub
	}

	public PocilloPersonalizable(String materialPocillo, String color, String caracteristicaDePocillo,
			int tamanoImpresion, boolean aptoMicroonda, boolean aptoLavavajilla) {
		super();
		this.materialPocillo = materialPocillo;
		this.color = color;
		this.caracteristicaDePocillo = caracteristicaDePocillo;
		this.tamanoImpresion = tamanoImpresion;
		this.aptoMicroonda = aptoMicroonda;
		this.aptoLavavajilla = aptoLavavajilla;
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

	public boolean isAptoMicroonda() {
		return aptoMicroonda;
	}

	public void setAptoMicroonda(boolean aptoMicroonda) {
		this.aptoMicroonda = aptoMicroonda;
	}

	public boolean isAptoLavavajilla() {
		return aptoLavavajilla;
	}

	public void setAptoLavavajilla(boolean aptoLavavajilla) {
		this.aptoLavavajilla = aptoLavavajilla;
	}

	@Override
	public String toString() {
		return "PocilloPersonalizable: \nmaterialPocillo: " + materialPocillo + "\ncolor: " + color
				+ "\ncaracteristicaDePocillo: " + caracteristicaDePocillo + "\ntamanoImpresion: " + tamanoImpresion
				+ "\naptoMicroonda: " + aptoMicroonda + "\naptoLavavajilla: " + aptoLavavajilla;
	}
	
	

}
