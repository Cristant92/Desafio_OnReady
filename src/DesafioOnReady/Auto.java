package DesafioOnReady;

public class Auto extends Vehiculo {
	private int puertas;

	public Auto(Marca marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return this.puertas;
	}

	@Override
	public String toString() {
		return super.toString()+" Puertas: "+this.getPuertas() + Main.imprimirBarra()+"Precio: $"+ this.getPrecio();
	}
	
	
}
