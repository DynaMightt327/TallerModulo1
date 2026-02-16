package co.edu.unbosque.model;

public class AnchetaDulce {
	
	private int cantidadDulce;
	private String tiposDeDulce;
	private String nivelDulzor;
	private String incluyeMarcaReconocida;
	private String tieneProductoSinAzucar;
	private int precio;
	
	public AnchetaDulce() {
		// TODO Auto-generated constructor stub
	}

	public AnchetaDulce(int cantidadDulce, String tiposDeDulce, String nivelDulzor, String incluyeMarcaReconocida,
			String tieneProductoSinAzucar, int precio) {
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

	public String getIncluyeMarcaReconocida() {
		return incluyeMarcaReconocida;
	}

	public void setIncluyeMarcaReconocida(String incluyeMarcaReconocida) {
		this.incluyeMarcaReconocida = incluyeMarcaReconocida;
	}

	public String getTieneProductoSinAzucar() {
		return tieneProductoSinAzucar;
	}

	public void setTieneProductoSinAzucar(String tieneProductoSinAzucar) {
		this.tieneProductoSinAzucar = tieneProductoSinAzucar;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Ancheta Dulce: \ncantidad de dulces: " + cantidadDulce + "\ntipos de Dulces: " + tiposDeDulce + "\nnivel de dulzor: "
				+ nivelDulzor + "\nincluye marca reconocida: " + incluyeMarcaReconocida + "\ntiene producto sin azucar: "
				+ tieneProductoSinAzucar + "\nprecio: " + precio + "\nrecuerde que cada pedido tarda 24 horas" + "\n---------------------";
	}
	

}
