package Introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double d, r, s;
		int a, b, c;
		
		Scanner calc = new Scanner (System.in);
		
		
		System.out.println("Digite o valor de A: ");
		a = calc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = calc.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = calc.nextInt();
		
		r=Math.pow((a + b),2);
		s=Math.pow((b + c),2);
		d=(r+s)/2;
		
		System.out.println("O valor de D é: " + d);
		
				
	
		calc.close();
		
	}
}
