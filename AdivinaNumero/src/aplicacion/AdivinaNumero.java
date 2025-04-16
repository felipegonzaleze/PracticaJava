package aplicacion;

import java.util.Scanner;
import java.util.ArrayList;

public class AdivinaNumero {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int num = 0;
		int intentos = 1;
		final int NUMERO_ALEATORIO = (int)((Math.random()*100) + 1);
		
		System.out.println("Por favor ingresa un número entre 1 - 100: ");
		num = Integer.parseInt(entrada.nextLine());
		numeros.add(num);
		
		while (num != NUMERO_ALEATORIO) {
			
			if (num > NUMERO_ALEATORIO) {
				System.out.println("Intenta con un número más pequeño");
				num = Integer.parseInt(entrada.nextLine());
				numeros.add(num);
				intentos++;
			}
			else if (num < NUMERO_ALEATORIO) {
				System.out.println("Intenta con un número más grande");
				num = Integer.parseInt(entrada.nextLine());
				numeros.add(num);
				intentos++;
			}
		}
		
		System.out.println("¡Has conseguido adivinar el número!");
		System.out.println("Te tomó " + intentos + " veces adivinar el número.");
		System.out.println("Intentaste con los números:");
		System.out.println(numeros);
	       
	   entrada.close();  
	   }
	}