package Arreglos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		float numeros[] = new float [5];
		
		
		for (int i=0; i<5; i++) {
			System.out.println("Ingresa el numero " +i+1);
			numeros [i] = entrada.nextFloat();
		}
		
		System.out.println("Imprimiendo los numeros en orden");
		for (int i=0; i<5; i++) {
			System.out.println(numeros[i]);
		}

	}

}
