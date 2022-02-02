package Introducao;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int dias, n1, n2, n3;
		Scanner idade = new Scanner (System.in);
		
		System.out.println("Digite a sua idade em dias: ");
		dias = idade.nextInt();
		
		n1 = dias/365;
		System.out.println("A sua idade em anos é: " + n1 + " anos");
		
		n2 = (dias%365)/30;
		System.out.println("A sua idade em meses é: " + n2 + " meses");
		
		n3 = (dias%365)%30;
		System.out.println("A sua idade em dias é: " + n3 + " dias");
		
		idade.close();
	}
}
