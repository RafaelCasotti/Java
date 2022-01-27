package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio2FOR {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x, y, contImpar=0, contPar=0;
		
		System.out.println("Entre com 10 valores: ");
		
		for(x=0 ; x<10 ; x++) {
		y = sc.nextInt();
		if (y %2 == 0) {
			contPar = contPar + 1;
		}
		else {
			contImpar = contImpar + 1;
			
		}
		
	}
		System.out.println("Pares: " + contPar);
		System.out.println("Impar: "+ contImpar);
		
		sc.close();
}
}