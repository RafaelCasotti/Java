package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio6DOWHILE {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numero, soma=0, quant=0;
		double media;
		
			System.out.println("Digite um numero: ");
		numero = scan.nextInt();
		
		do {
			if (numero%3==0) {
				soma = soma + numero;
				quant = quant + 1;
				}
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
	}
		
		while (numero != 0);
		 
		media = (double) soma / quant;
		
		System.out.println("A média dos multiplos de 3 são:" + media);

		scan.close();
	}

}
