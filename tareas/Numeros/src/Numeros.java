/*1. Usted debe escribir un programa que lea dos números menores a 1000 a través del teclado. El programa debe
  indicar en pantalla cuántos dígitos suman entre ambos números.*/


import java.util.Scanner;
public class Numeros {
     //attributes
	private static Scanner keyboard;
	private String name;
	private int num1, num2, dig1, dig2;
	private int suma=0;
	public void Initialize() {
	keyboard = new Scanner (System.in);
	System.out.println("***********¡HOLA BIENVENIDO!************* \nDIGITE SU NOMBRE:");
    name=keyboard.next( ); 
    System.out.println("Digite dos números enteros: ");
    num1=keyboard.nextInt();
    num2=keyboard.nextInt();
	}
	
    public void Counting() {
    	if (num1 < 1000){
    	dig1=0; //contador
    	while(num1!=0) {
    		num1= num1/10; 
    		dig1++; //se le suma 1 al contador
    }
}
      if (num2 < 1000){
    	dig2=0; 
    	while(num2!=0) { 
    		num2=num2/10;
    		dig2++;
    	}
    }
  }
	public void Suma(){
		suma=dig1+dig2;
	}
    public void Printing() {
    	System.out.println("----------------------------------------------------------------------------------");
    	System.out.println("\t\t" + name + ", este es el resultado de tu consulta:");
    	if(num1<1000){
    	System.out.println("\na) El primer numero introducido tiene: " + dig1 +" digitos." );
    	}
    	else {
    		System.out.println("\na) ERROR NÚMERO INTRODUCIDO NO VALIDO!!!");
    	}
    	if(num2<1000){
    	System.out.println("\nb) El segundo numero introducido tiene: " + dig2 + " digitos.");
    	}
    	else {
    		System.out.println("\nb) ERROR NÚMERO INTRODUCIDO NO VALIDO!!!");
    	}
    	System.out.println("\nLa suma total de digitos de los numeros introducidos es: "+ suma );
    }
    public static void main(String[] args)  {
		// TODO Auto-generated method stub

    	   Numeros Numeros1;
           Numeros1=new Numeros();
           Numeros1.Initialize();
           Numeros1.Counting();
           Numeros1.Suma();
           Numeros1.Printing();
	}

}

