package clases;

public class Vehiculo {

	// Atributos
	private String marca;
	private String modelo;
	private int año;
	
	// Constructor
	public Vehiculo(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
	// Métodos de instancia
	public void despliegaInformacion() {
		System.out.println(this.marca + " " + this.modelo + " " + this.año);
	}
}
