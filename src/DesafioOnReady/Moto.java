package DesafioOnReady;

public class Moto extends Vehiculo {
	private String cilindrada;

	public Moto(Marca marca, String modelo, double precio, String cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	public String getCilindrada() {
		return this.cilindrada;
	}

	@Override
	public String toString() {
		return super.toString()+ "Cilindrada: "+this.getCilindrada()+Main.imprimirBarra()+"Precio: $"+this.getPrecio();
	}
	
	
	
	
	
}
