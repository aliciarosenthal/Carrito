package ar.edu.unlam.tallerweb.carrito;

public class Articulo extends Comprable {
	private String tipo;

	public Articulo(double precio, String tipo) {
		this.precio = precio;
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	@Override
	public double getPrecio() {
		return precio;
	}
}
