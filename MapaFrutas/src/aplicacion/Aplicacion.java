package aplicacion;

import java.util.HashMap;
import java.util.Set;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> frutas = new HashMap<String, Integer>();
		
		frutas.put("Melón", 2);
		frutas.put("Sandía", 1);
		frutas.put("Peras", 5);
		frutas.put("Manzanas", 5);
		frutas.put("Naranjas", 10);
		
		Set<String> nombreFruta = frutas.keySet();
		
		
		for (String fruta : nombreFruta) {
			System.out.println(fruta + " " + frutas.get(fruta));
		}
	}

}
