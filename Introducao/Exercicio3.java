package Introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int seg, min, horas;
		
		Scanner tempo = new Scanner (System.in);
		
		System.out.println("Digite o seu tempo em segundos: ");
		seg = tempo.nextInt();
		
		horas = seg/3600;
		System.out.println("Em horas: " + horas + " horas");
		
		min = (seg % 3600)/60;
		System.out.println("Em minutos: " + min + " minutos");
		
		seg = (seg % 3600)%60;
		System.out.println("Em segundos: " + seg + " segundos");
		
		tempo.close();
	}

}
