import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int compra;
		double descuento, tcompra1 = 0;
		BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\n---El Emperador---\n");
		System.out.print("Ingresa el total de la compra: ");
		compra = Integer.parseInt(keyboard2.readLine());
			if (compra >= 500) {
			descuento=(compra*0.30);
			tcompra1=(compra - descuento);
		} 
			else if (compra < 500 || compra >= 200) {
			descuento=(compra*0.20);
			tcompra1=(compra - descuento);
		}
			else if (compra < 200 || compra >= 100) {
			descuento=(compra*0.10);
			tcompra1=(compra - descuento);
		}
			System.out.println("\nEl total de tu compra es: " + tcompra1);
	}
}
