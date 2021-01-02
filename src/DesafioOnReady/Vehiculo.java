package DesafioOnReady;

public abstract class Vehiculo {
	private Marca marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(Marca marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Marca: " + this.marca + Main.imprimirBarra()+"Modelo: " +this.modelo + Main.imprimirBarra();
	}
	
	
	
}
