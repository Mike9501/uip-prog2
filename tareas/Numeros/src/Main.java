/*2. La rúbrica de laboratorios de este curso se calcula en base a cinco laboratorios calificados.
De los cinco laboratorios se elimina la menor nota y se efectúa un promedio de las notas restantes.
Su programa debe captar las calificaciones de los laboratorios por teclado, imprimir en pantalla la calificación
eliminada e imprimir en pantalla el promedio de la rúbrica de laboratorios para 3 estudiantes.*/


	import java.util.Scanner;
	public class Main {
	     //attributes
		private static Scanner keyboard;
		private String name,lastname;
		private float lab[];
		private double suma=0,menor, prom=0, ex=0;
		
		public void Initialize() {
		keyboard = new Scanner (System.in);
		lab=new float[5];
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("\t\t\tCOLEGIO     MARIA     INMACULADA");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("\tMATERIA: QUÍMICA - AÑO LECTIVO: 2014 - SEGUNDO CUATRIMESTRE");
		System.out.println("Introduzca su nombre y apellido:");
		name=keyboard.next();
		lastname=keyboard.next();
		System.out.println("\nPor favor introduzca las calificaciones para poder obtener su promedio (5):");
		for (int f=0;f<lab.length;f++){
		System.out.println("Laboratorio #"+f+":");
		lab[f]=keyboard.nextFloat();
		}
		}
	    public void Checking(){
        	for(int i=1;i<lab.length;++i){
        		if(lab[i]<71){
		menor=lab[0];
	    for (int f=1;f<lab.length;f++) {
			 if (lab[f]<menor) {
				menor=lab[f];		

			 }
	    }
   }
       }
 }
		
	    public void Promedio() {
			for (int f=0; f<lab.length;f++){
			 suma+=lab[f];
			 ex=suma-menor;
			 prom=ex/5;
			}
		}	
		public void Printing() {
	    System.out.println("-----------------------------------------------------------------------------------------");
	    System.out.println("Resultado del rendimiento del/la estudiante " + name + " " + lastname + " " + "en la materia Química:\n");
		System.out.println("La calificación más baja que obtuvo (se elimina): " + menor);
		//System.out.println("La suma de las calificaciones es de: "+suma);
		System.out.println("El promedio de sus calificaciones es de: "+prom);
		
		if (prom<71.0) {
			    System.out.println("\n\t\tLASTIMOSAMENTE USTED  NO APROBÓ LA MATERIA DE QUÍMICA.\n\n");
		}
			else {
				System.out.println("\n\t\t¡FELICIDADES USTED APROBÓ LA MATERIA QUÍMICA! :D\n\n");
			}
		}
		
				
		public static void main(String[] args) {
		// TODO Auto-generated method stub
               Main Main1;
               Main1 = new Main();
               Main1.Initialize();
               Main1.Checking();
               Main1.Promedio();
               Main1.Printing();
               
               Main Main2;
               Main2 = new Main();
               Main2.Initialize();
               Main2.Checking();
               Main2.Promedio();
              Main2.Printing();
               
               Main Main3;
               Main3 = new Main();
               Main3.Initialize();
               Main3.Checking();
               Main3.Promedio();
               Main3.Printing();
	}

}
 