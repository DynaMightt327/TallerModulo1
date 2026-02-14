package co.edu.unbosque.model;

public class AnchetaDulce {
	
	private int cantidadDulces;
	private String tiposDeDulces;
	private String nivelDulzor;
	private boolean incluyeMarcaReconocida;
	private boolean tieneProductoSinAzucar;
	private boolean aptaParaNinnos;
	
	public AnchetaDulce() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaDulce(int cantidadDulces, String tiposDeDulces, String nivelDulzor, boolean incluyeMarcaReconocida,
			boolean tieneProductoSinAzucar, boolean aptaParaNinnos) {
		super();
		this.cantidadDulces = cantidadDulces;
		this.tiposDeDulces = tiposDeDulces;
		this.nivelDulzor = nivelDulzor;
		this.incluyeMarcaReconocida = incluyeMarcaReconocida;
		this.tieneProductoSinAzucar = tieneProductoSinAzucar;
		this.aptaParaNinnos = aptaParaNinnos;
	}

	public int getCantidadDulces() {
		return cantidadDulces;
	}

	public void setCantidadDulces(int cantidadDulces) {
		this.cantidadDulces = cantidadDulces;
	}

	public String getTiposDeDulces() {
		return tiposDeDulces;
	}

	public void setTiposDeDulces(String tiposDeDulces) {
		this.tiposDeDulces = tiposDeDulces;
	}

	public String getNivelDulzor() {
		return nivelDulzor;
	}

	public void setNivelDulzor(String nivelDulzor) {
		this.nivelDulzor = nivelDulzor;
	}

	public boolean isIncluyeMarcaReconocida() {
		return incluyeMarcaReconocida;
	}

	public void setIncluyeMarcaReconocida(boolean incluyeMarcaReconocida) {
		this.incluyeMarcaReconocida = incluyeMarcaReconocida;
	}

	public boolean isTieneProductoSinAzucar() {
		return tieneProductoSinAzucar;
	}

	public void setTieneProductoSinAzucar(boolean tieneProductoSinAzucar) {
		this.tieneProductoSinAzucar = tieneProductoSinAzucar;
	}

	public boolean isAptaParaNinnos() {
		return aptaParaNinnos;
	}

	public void setAptaParaNinnos(boolean aptaParaNinnos) {
		this.aptaParaNinnos = aptaParaNinnos;
	}

	@Override
	public String toString() {
		return "AnchetaDulce: \ncantidadDulces: " + cantidadDulces + "\ntiposDeDulces: " + tiposDeDulces + "\nnivelDulzor: "
				+ nivelDulzor + "\nincluyeMarcaReconocida: " + incluyeMarcaReconocida + "\ntieneProductoSinAzucar: "
				+ tieneProductoSinAzucar + "\naptaParaNinnos: " + aptaParaNinnos;
	}
	
	

}
