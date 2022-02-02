package Introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media;
		
 Scanner nota = new Scanner (System.in);
		
		
		System.out.println("Digite a primeira nota: ");
		nota1 = nota.nextInt();
		
		System.out.println("Digite a sesgunda nota: ");
		nota2 = nota.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = nota.nextInt();
		
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.println("A média das notas são: " + media);
		
		nota.close();
	}
}
