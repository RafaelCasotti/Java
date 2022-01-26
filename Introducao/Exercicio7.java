package Introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b , c, d, e , f, x, y;
		
		Scanner lin = new Scanner (System.in);
		
		System.out.println("Digite o valor de A: ");
		a = lin.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = lin.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = lin.nextInt();
		
		System.out.println("Digite o valor de D: ");
		d = lin.nextInt();
		
		System.out.println("Digite o valor de E: ");
		e = lin.nextInt();
		
		System.out.println("Digite o valor de F: ");
		f = lin.nextInt();
		
		x = ((c * e) - (b * f))/((a * e) - (b * d));
		y = ((a * f) - (c *d))/((a * e) - (b * d));
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);
		
		
		
		

	}

}
