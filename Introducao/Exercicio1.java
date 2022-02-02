package Introducao;

import java.util.Scanner;

public class Exercicio1 {
 
	public static void main(String[] args) {
	int anos, meses, dias, n1, n2, n3;
	Scanner x = new Scanner (System.in);	
	
	System.out.println("Digite quantos anos: ");
	anos = x.nextInt();
	System.out.println("Digite quantos meses: ");
	meses = x.nextInt();
	System.out.println("Digite quantos dias: ");
	dias = x.nextInt();
	
	n1 = anos * 365;
	n2 = meses * 30;
	n3 = dias + n1 + n2;
	
	System.out.println("A quantidade em dias é: " + n3);
	
	x.close();
}
}