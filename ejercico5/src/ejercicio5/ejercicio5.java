package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		System.out.println ("Por favor introduzca cadena1:");
		String cadena1 = "";
		Scanner entradaEscaner = new Scanner (System.in); 
		cadena1 = entradaEscaner.nextLine (); 

		System.out.println("Ingrese cadena2"); 

		String cadena2 = "";
		Scanner entradaEscaner2 = new Scanner (System.in); 
		cadena2 = entradaEscaner2.nextLine (); 

		System.out.println("Salida: "+compararcaracteres(cadena1,cadena2));

	}

	public static String compararcaracteres(String cadena1, String cadena2) {
		String aux="";
		 for (int n = 0; n <cadena1.length (); n++)
		 { 
			 char c = cadena1.charAt(n); 
			String elemento=c+"";
			 
			 if(!cadena2.contains(elemento)){
				 aux=aux+elemento;
			 }
			 
		 } 
		 
		 return aux;
	}

}
