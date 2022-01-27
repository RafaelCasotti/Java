package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio1FOR {
	
	public static void main(String[] args) {
		
		int x;

		Scanner ler = new Scanner (System.in);
		
		for( x=1000 ; x<=1999 ; x++) {
									
		if (x % 11==5) {
			System.out.println(x);
			
			
		}
		}	
		ler.close();
	}
}