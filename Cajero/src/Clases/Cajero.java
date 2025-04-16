package Clases;
import java.util.Date;

public class Cajero {
	
	public static void retirarDinero(double dinero) {
		
		final String MENSAJE_RECHAZO = "Estás tratando de retirar mucho dinero, el límite es $8000";
		final String MENSAJE_ERROR = "Error, cantidad inválida";
		final String MENSAJE_CONFIRMACION = "Retiraste exitosamente la cantidad de ";
		
		if (dinero > 8000) {
			System.out.println(MENSAJE_RECHAZO);
		}
		else if (dinero > 0) {
			System.out.println(MENSAJE_CONFIRMACION + dinero);
		}
		else {
			System.out.println(MENSAJE_ERROR);
		}
	}
	
	public static void pagarFactura(double totalFactura, double cantidadDinero) {
		
		Date fechaActual = new Date();
		if (cantidadDinero < totalFactura) {
			System.out.println("El día de " + fechaActual + " pagaste " + cantidadDinero + " aún te hacen falta " + (totalFactura - cantidadDinero));
		}
		else if (cantidadDinero == totalFactura) {
			System.out.println("Gracias por tu pago el día de " + fechaActual);
		}
		else if (cantidadDinero > totalFactura) {
			System.out.println("Gracias por tu pago el día de " + fechaActual + ", tu cambio es de " + (cantidadDinero - totalFactura));
		}
	}
	
	public static boolean cambiarBilletes(int cantidadDinero, int valorBillete) {
		
		if ((cantidadDinero % valorBillete) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String totalDeBilletesYMonedas(int cantidadDinero) {
		
		int billete500 = cantidadDinero / 500;
		cantidadDinero = cantidadDinero % 500;
		int billete200 = cantidadDinero / 200;
		cantidadDinero = cantidadDinero % 200;
		int billete100 = cantidadDinero / 100;
		cantidadDinero = cantidadDinero % 100;
		int billete50 = cantidadDinero / 50;
		cantidadDinero = cantidadDinero % 50;
		int billete20 = cantidadDinero / 20;
		cantidadDinero = cantidadDinero % 20;
		int moneda10 = cantidadDinero / 10;
		cantidadDinero = cantidadDinero % 10;
		int moneda5 = cantidadDinero / 5;
		cantidadDinero = cantidadDinero % 5;
		int moneda2 = cantidadDinero / 2;
		cantidadDinero = cantidadDinero % 2;
		int moneda1 = cantidadDinero / 1;
		
		String total = 
				billete500 + " billetes de 500, " + 
				billete200 + " billetes de 200, " + 
				billete100 + " billetes de 100, " +
				billete50 + " billetes de 50, " +
				billete20 + " billetes de 20, " +
				moneda10 + " monedas de 10," +
				moneda5 + " monedas de 5, " +
				moneda2 + " monedas de 2, " +
				moneda1 + " monedas de 1.";
		
		return total;
	}
	
	
}