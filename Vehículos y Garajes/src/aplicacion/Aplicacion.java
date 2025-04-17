package aplicacion;

import java.util.ArrayList;
import clases.Vehiculo;
import clases.Garage;

public class Aplicacion {

	public static void main(String[] args) {

		Vehiculo auto1 = new Vehiculo("Kia", "Cerato", 2017);
		Vehiculo auto2 = new Vehiculo("Kia", "Sorento", 2019);
		Vehiculo auto3 = new Vehiculo("Kia", "Sportage", 2021);
		
		ArrayList<Vehiculo> autos = new ArrayList<Vehiculo>();
		
		Garage garaje = new Garage(autos, 2);
		
		garaje.agregarVehiculo(auto1);
		garaje.agregarVehiculo(auto2);
		
		garaje.mostrarVehiculos();
		
		garaje.agregarVehiculo(auto3);
	}

}
