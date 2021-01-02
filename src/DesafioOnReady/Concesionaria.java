package DesafioOnReady;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {
	private ArrayList<Vehiculo> l_vehiculos;
	
	public Concesionaria() {
		l_vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void cargarVehiculo(Vehiculo vehiculo) {
		l_vehiculos.add(vehiculo);
	}
	public void mostrarVehiculos() {
		for(Vehiculo v: l_vehiculos) {
			System.out.println(v.toString());
		}
	}
	
	public Vehiculo vehiculoMasCaro() {
		Vehiculo vehiculo = l_vehiculos.get(0);
		double max = l_vehiculos.get(0).getPrecio();
		
		for (Vehiculo veh: l_vehiculos) {
			if(veh.getPrecio() > max) {
				max = veh.getPrecio();
				vehiculo = veh;
			}
		}
		return vehiculo;
	}
	
	public Vehiculo vehiculoMasBarato() {
		Vehiculo vehiculo = l_vehiculos.get(0);
		double min = l_vehiculos.get(0).getPrecio();
		
		for (Vehiculo veh: l_vehiculos) {
			if(veh.getPrecio() < min) {
				min = veh.getPrecio();
				vehiculo = veh;
			}
		}
		return vehiculo;
	}
	
	public Vehiculo contieneY() {
		Vehiculo veh = null;
		for (Vehiculo vehiculo: l_vehiculos) {
			if(vehiculo.getModelo().contains("Y")) {
				veh = vehiculo;
			}
		}
		return veh;
	}
	
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public Vehiculo[] mayorAMenor(){
		Vehiculo [] vehiculos = new Vehiculo[l_vehiculos.size()];
		Vehiculo aux ;
		// Copio los vehiculos del ArrayList a un vector para poder hacer los intercambios
		for (int i = 0 ; i < l_vehiculos.size(); i++) {
			vehiculos[i] = l_vehiculos.get(i);
		}
		for (int i = 0 ; i < vehiculos.length - 1; i++) {
			for (int j = 0 ; j < vehiculos.length - 1; j++ ) {
				if (vehiculos[j].getPrecio() < vehiculos[j+1].getPrecio()) {
					aux = vehiculos[j];
					vehiculos[j] = vehiculos[j+1];
					vehiculos[j+1] = aux;
				}
			}
		}
		// Muestro los autos ordenados de mayor a menor según el precio
		return vehiculos;
		
		}
	public void mostrarVehiculosOrdenados(Vehiculo[] mayorAMenor) {
		for (Vehiculo vehiculo: mayorAMenor) {
			System.out.println(vehiculo.getMarca()+" "+vehiculo.getModelo()+"");
		}
	}
		
		
}
