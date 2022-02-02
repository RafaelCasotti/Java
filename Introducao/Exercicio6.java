package Introducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, p1, p2, d;
		
		Scanner dist = new Scanner (System.in);
		
		System.out.println("Digite o valor de x1: ");
		x1 = dist.nextInt();
		
		System.out.println("Digite o valor de x2: ");
		x2 = dist.nextInt();
		
		System.out.println("Digite o valor de y1: ");
		y1 = dist.nextInt();
		
		System.out.println("Digite o valor de y2: ");
		y2 = dist.nextInt();
		
		p1 = Math.pow((x1 - x2),2);
		p2 = Math.pow((y2 - y1),2);
		d = Math.sqrt(p1 + p2);
		
		System.out.println("Distancia entre os pontos é de: " +d);
		
		dist.close();
		
	}
}
