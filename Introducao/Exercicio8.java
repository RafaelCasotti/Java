package Introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double cr, cf;
		
		Scanner carro = new Scanner (System.in);
		
		System.out.println("Digite o custo de fabrica do carro: ");
		cf = carro.nextInt();
		
		cr = (cf + (cf * 0.28) + (cf * 0.45));
		
		System.out.println("O valor do carro novo é: " + cr);
	}

}
