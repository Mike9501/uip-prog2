import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lata {

	 private float altura;
	 private float diametro;
	 public void lata () {
		altura= 4.8F;
 		diametro= 2.5F;
	 }
	 
	 public static void main(String[] args) throws NumberFormatException, IOException {
	  double radio, volumen, altura, superficie;	
	  BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Introduzca la altura: ");
	  altura= Integer.parseInt(keyboard2.readLine());
	  System.out.println("Introduzca el radio: ");
	  radio= Integer.parseInt(keyboard2.readLine());
	  volumen= (3.1416*radio*radio*altura);
	  superficie=(2 * 3.1416)*(radio*radio)+(2*3.1416)*(radio*altura);
	  System.out.println("El volumen es: " + volumen);
	  System.out.println("La superficie es: " + superficie);

	}

}
