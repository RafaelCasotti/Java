package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio5DOWHILE {

		public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
		
		int x, soma=0;
			
			System.out.println("Digite um numero: ");
			x = scan.nextInt();
		
		do{
			soma = soma + x;
			
			System.out.println("Digite um numero: ");
			x = scan.nextInt();
		}
		while (x!=0);
		{
			System.out.println("A soma dos numeros é: " + soma);
			
			scan.close();
		}
		}
		

}
