import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ambulancia {
	
	public static void main(String[] args) throws IOException {
		
		double velocidad, distancia, tiempo;
		char confir='s';
		
		BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));
	
		
	
		do {
			System.out.println("Ingresa la velocidad: ");
			
			velocidad = Double.parseDouble(keyboard2.readLine());
		
			System.out.println("Ingresa el distancia: ");
		
			distancia = Double.parseDouble(keyboard2.readLine());
		
			tiempo= (distancia/velocidad);
			
			System.out.println("El tiempo es:" + tiempo + "horas");
			System.out.println("Desea continuar: ");		
			confir = (keyboard2.readLine ()).charAt(0 ); 
		} while (confir=='s'||confir=='S');
	
	}

}
