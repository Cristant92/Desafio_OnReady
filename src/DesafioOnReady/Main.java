package DesafioOnReady;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concesionaria clama = new Concesionaria();
		Vehiculo auto1 = new Auto(Marca.Peugeot,"206",200000.00,4);
		Vehiculo moto1 = new Moto(Marca.Honda, "Titan", 60000.00, "125cc"); 
		Vehiculo auto2 = new Auto(Marca.Peugeot,"208",250000.00,5);
		Vehiculo moto2 = new Moto(Marca.Yamaha,"YBR",80500.50, "160cc");
		
		clama.cargarVehiculo(auto1);
		clama.cargarVehiculo(moto1);
		clama.cargarVehiculo(auto2);
		clama.cargarVehiculo(moto2);
		
		clama.mostrarVehiculos();
		separador();
		System.out.print("\n");
		// Obtengo el auto más caro y el más barato
		Vehiculo masCaro = clama.vehiculoMasCaro();
		Vehiculo masBarato = clama.vehiculoMasBarato();
		/* Una vez obtenidos el auto más caro y el más barato
		 llamo a la función imprimir y le paso
		 por párametro el msj que corresponda según
		 si es el auto de mayor o menor valor */
		imprimir("caro",masCaro);
		imprimir("barato",masBarato);
		Vehiculo contieneY = clama.contieneY();
		imprimir(" que contiene en el modelo la letra 'Y': ",contieneY.getMarca(),contieneY.getModelo(),contieneY.getPrecio());
		separador();
		System.out.print("\n");
		
		clama.mostrarVehiculosOrdenados(clama.mayorAMenor());
		
		
	}
	public static String imprimirBarra() {
		return (" // ");
	}
	public static void separador() {
		for (int i = 0; i < 29 ; i++ ) {
			System.out.print("=");
		}
	}
	public static void imprimir(String msg, Vehiculo veh) {
		System.out.println("Vehiculo más "+msg+": "+veh.getMarca()+" "+veh.getModelo());
	}
	public static void imprimir(String msg, Marca marca, String modelo, double precio) {
		System.out.println("Vehiculo "+msg+" "+marca+ " "+modelo+" $"+precio);
	}

}
