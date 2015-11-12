package Constructor;

public class Principal {
public static void main(String[] args) {
	Persona x = new Persona();
	System.out.println(x.getNombre());
	System.out.println(x.getEdad());
	
	Sedan y = new Sedan();
	System.out.println(y.getMarca());
	System.out.println(y.getModelo());

	}
}


