package aplicacion;
import Clases.Cajero;

public class Aplicacion {
	public static void main(String[] args) {
		
		final double FACTURA_A_PAGAR = 7500.50;
		final double DINERO_A_RETIRAR = 7700.50;
		final int CANTIDAD_DINERO_BANCO = 8000;
		final int BILLETE_A_CAMBIAR = 20;
		final int DINERO_MONEDA_BILLETE = 7537;
		
		Cajero.retirarDinero(DINERO_A_RETIRAR);
		Cajero.pagarFactura(FACTURA_A_PAGAR, DINERO_A_RETIRAR);
		
		if (Cajero.cambiarBilletes(CANTIDAD_DINERO_BANCO, BILLETE_A_CAMBIAR) == true) {
			System.out.println("El dinero si puede ser cambiado por billetes de " + BILLETE_A_CAMBIAR);
		}
		else {
			System.out.println("El dinero no puede ser cambiado por billetes de " + BILLETE_A_CAMBIAR);
		}
		
		String resultado = Cajero.totalDeBilletesYMonedas(DINERO_MONEDA_BILLETE);
		System.out.println(resultado);
	}
}
