package clases;

import java.util.ArrayList;

public class Prestamo {
	
	// Atributos
	private String nombre;
	private ArrayList<Libro> libros;
	private boolean estatus;

	// Constructor
	public Prestamo() {
		this.nombre = "Invitado";
		this.libros = new ArrayList<Libro>();
		this.estatus = true;
	}
	
	public Prestamo(String nombre, boolean estatus) {
		this.nombre = nombre;
		this.libros = new ArrayList<Libro>();
		this.estatus = estatus;
	}
	
	// Métodos de instancia
	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
		System.out.println("Libro agregado con éxito!");
	}
	
	public void mostrarEstatus() {
		if (this.estatus == true) {
			System.out.println("El préstamo está activo.");
		}
		else {
			System.out.println("No hay ningún préstamo en activo");
		}
	}
	
	public void mostrarDetallesDelPrestamo() {
		ArrayList<String> librosEnPrestamo = new ArrayList<String>();
		for (Libro libro : libros) {
			librosEnPrestamo.add(libro.getTitulo());
		}
		if (librosEnPrestamo.size() > 0) {
			System.out.println("Usuario: " + this.nombre + ", los libros que tienes en préstamo son: " + librosEnPrestamo);
		}
		else {
			System.out.println("Usuario: " + this.nombre + ", no tienes ningún libro en préstamo");
		}
	}
	
	public double calcularTotalDeReemplazo() {
		double total = 0.0;
		for (Libro libro : libros) {
			total += libro.getPrecioDeReemplazo();
		}
		return total;
	}
	
	// Getters
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Libro> getLibros( ) {
		return libros;
	}
	public boolean getEstatus() {
		return estatus;
	}
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
