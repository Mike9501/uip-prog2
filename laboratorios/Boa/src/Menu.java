import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	
	 public void mostrar_opciones () throws IOException{
		String nombre;
		char E = 's';
		int opciones;
		int peso = 0;
	
		BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("La Boa");
		System.out.println("\nIngrese nombre de la Boa");
		nombre = keyboard2.readLine();
			
		do{
		System.out.println("Eliga 1 para alimentar la boa");
		System.out.println("Eliga 2 para jugar con la boa");
		System.out.println("Eliga 3 para dormir la boa");
		System.out.println("Eliga 4 para salir");
		opciones = Integer.parseInt(keyboard2.readLine());
		
		 switch (opciones) {
			case 1:
			peso= peso+5;
			if(peso>15 || peso<2){
			System.out.println("\nSe murio la boa " + nombre);
			System.exit(opciones); 
		}   
			System.out.println("\nEl peso de la boa " + peso);
			
			break;
			case 2:
			peso= peso-3;
			if(peso>15|| peso<2){
			System.out.println("\nSe murio la boa " + nombre);
			System.exit(peso); 

		}
			System.out.println("\nEstas jugando con la boa ");
			System.out.println("\nEl peso de la boa es: " + peso);
			
			break;
			case 3:
			peso=peso+1;
			if(peso>15 || peso<2 ){
			System.out.println("\nSe murio la boa " + nombre);
			System.exit(peso); 
		}
			System.out.println("\nLa boa esta durmiendo");
			
			break;
			case 4:
			System.out.println("\nFin de la boa " + nombre);
			System.exit(peso); 
			break;		
		 }
	} 		while(E!= 'x');
 }

}
			
	 