package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio3WHILE {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int x, idade21=0, idade50=0;
		
		System.out.println("Digite sua idade: ");
		
		x = scan.nextInt();
		
		while(x != -99) {
			if(x < 21) {
				idade21 = idade21 + 1;
			}
			else if (x > 50) {
				idade50 = idade50 + 1;	
			}
			System.out.println("Digite sua idade: ");
			x = scan.nextInt();
	}
		System.out.println("Pessoas abaixo de 21: " + idade21);
		System.out.println("Pessoas com mais de 50: " + idade50);
		
		scan.close();
}
}
