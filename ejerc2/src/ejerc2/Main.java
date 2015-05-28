package ejerc2;

import java.util.Scanner;

public class Main {

	public static void main (String [] args){ 

		Scanner entrada = new Scanner(System.in); 
		int num; 

		System.out.println("Ingrese numero"); 

		num = entrada.nextInt(); 
		
		if(comprobarnumero(num)==true)
		{
			System.out.print("El numero es positivo"); 
		}else{

			System.out.print("El numero es negativo"); 
		}

		
		}

	public static boolean comprobarnumero(int num) {

		if (num >=0) { 
			return true;
			} else { 
			return false;
			} 
		
	} 
}
