package co.edu.unbosque.model;

public class AnchetaParaMujer {
	
	private String estilo;
	private String accesorio;
	private String paletaColor;
	private String enfoque;
	private float precio;
	private String nivelDeDetalle;
	
	public AnchetaParaMujer() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaParaMujer(String estilo, String accesorio, String paletaColor, String enfoque, float precio,
			String nivelDeDetalle) {
		super();
		this.estilo = estilo;
		this.accesorio = accesorio;
		this.paletaColor = paletaColor;
		this.enfoque = enfoque;
		this.precio = precio;
		this.nivelDeDetalle = nivelDeDetalle;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getAccesorio() {
		return accesorio;
	}

	public void setAccesorio(String accesorio) {
		this.accesorio = accesorio;
	}

	public String getPaletaColor() {
		return paletaColor;
	}

	public void setPaletaColor(String paletaColor) {
		this.paletaColor = paletaColor;
	}

	public String getEnfoque() {
		return enfoque;
	}

	public void setEnfoque(String enfoque) {
		this.enfoque = enfoque;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getNivelDeDetalle() {
		return nivelDeDetalle;
	}

	public void setNivelDeDetalle(String nivelDeDetalle) {
		this.nivelDeDetalle = nivelDeDetalle;
	}

	@Override
	public String toString() {
		return "AnchetaParaMujer: \nestilo: " + estilo + "\naccesorios: " + accesorio + "\npaletaColor:" + paletaColor
				+ "\nenfoque: " + enfoque + "\nprecio: " + precio + "\nnivelDeDetalle: " + nivelDeDetalle;
	}
	
	
	

}
