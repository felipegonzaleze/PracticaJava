package aplicacion;

import clases.Libro;
import clases.Prestamo;

public class Aplicacion {

	public static void main(String[] args) {
		
		Prestamo usuarioNoEspecificado1 = new Prestamo();
		Prestamo usuarioNoEspecificado2 = new Prestamo();
		
		Prestamo usuarioEspecificado1 = new Prestamo("Felipe", true);
		Prestamo usuarioEspecificado2 = new Prestamo("Fiorella", false);
		Prestamo usuarioEspecificado3 = new Prestamo("Andrés", true);
		
		Libro libro1 = new Libro("Hábitos Atómicos", "James Clear", 25.50);
		Libro libro2 = new Libro("La disciplina marcará tu destino", "Ryan Holiday", 35.50);
		Libro libro3 = new Libro("Pensar con Claridad", "Shane Parrish", 15.50);
		
		usuarioNoEspecificado1.agregarLibro(libro1);
		usuarioNoEspecificado1.agregarLibro(libro2);
		
		usuarioNoEspecificado2.agregarLibro(libro1);
		usuarioNoEspecificado2.agregarLibro(libro3);
		
		usuarioEspecificado1.agregarLibro(libro1);
		usuarioEspecificado1.agregarLibro(libro2);
		usuarioEspecificado1.agregarLibro(libro3);
		
		usuarioEspecificado3.agregarLibro(libro3);
		
		usuarioNoEspecificado1.mostrarDetallesDelPrestamo();
		usuarioNoEspecificado2.mostrarDetallesDelPrestamo();
		usuarioEspecificado1.mostrarDetallesDelPrestamo();
		usuarioEspecificado2.mostrarDetallesDelPrestamo();
		usuarioEspecificado3.mostrarDetallesDelPrestamo();
		
		usuarioEspecificado1.mostrarEstatus();
		usuarioEspecificado2.mostrarEstatus();
		
		System.out.println(usuarioNoEspecificado1.calcularTotalDeReemplazo());
		System.out.println(usuarioEspecificado1.calcularTotalDeReemplazo());
	}

}
