package co.edu.unbosque.model;

public class AnchetaDulce {
	
	private int cantidadDulce;
	private String tiposDeDulce;
	private String nivelDulzor;
	private boolean incluyeMarcaReconocida;
	private boolean tieneProductoSinAzucar;
	private float precio;
	
	public AnchetaDulce() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaDulce(int cantidadDulce, String tiposDeDulce, String nivelDulzor, boolean incluyeMarcaReconocida,
			boolean tieneProductoSinAzucar, float precio) {
		super();
		this.cantidadDulce = cantidadDulce;
		this.tiposDeDulce = tiposDeDulce;
		this.nivelDulzor = nivelDulzor;
		this.incluyeMarcaReconocida = incluyeMarcaReconocida;
		this.tieneProductoSinAzucar = tieneProductoSinAzucar;
		this.precio = precio;
	}

	public int getCantidadDulce() {
		return cantidadDulce;
	}

	public void setCantidadDulce(int cantidadDulce) {
		this.cantidadDulce = cantidadDulce;
	}

	public String getTiposDeDulce() {
		return tiposDeDulce;
	}

	public void setTiposDeDulce(String tiposDeDulce) {
		this.tiposDeDulce = tiposDeDulce;
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "AnchetaDulce: \ncantidadDulces: " + cantidadDulce + "\ntiposDeDulces: " + tiposDeDulce + "\nnivelDulzor: "
				+ nivelDulzor + "\nincluyeMarcaReconocida: " + incluyeMarcaReconocida + "\ntieneProductoSinAzucar: "
				+ tieneProductoSinAzucar + "\nprecio: " + precio;
	}
	
	

}
