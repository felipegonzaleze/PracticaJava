package clases;

import java.util.ArrayList;

public class Garage {
	
	// Atributos
	private ArrayList<Vehiculo> vehiculos;
	private int capacidad;
	
	// Constructor
	public Garage(ArrayList<Vehiculo> vehiculos, int capacidad) {
		this.vehiculos = vehiculos;
		this.capacidad = capacidad;
	}
	
	// Métodos de instancia
	public void agregarVehiculo(Vehiculo vehiculo) {
		if (this.vehiculos.size() < this.capacidad) {
			vehiculos.add(vehiculo);
			System.out.println("Vehículo Añadido!");
		}
		else {
			System.out.println("El Garage esta lleno, no puedes añadir más vehículos");
		}
		
	}
	
	public void mostrarVehiculos() {
		for (Vehiculo vehiculo : this.vehiculos) {
			vehiculo.despliegaInformacion();
		}
	}
}
