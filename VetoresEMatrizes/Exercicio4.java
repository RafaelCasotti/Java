package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {
	

public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int [][]matrix = new int[3][3];
		int coluna=0, linha=0, soma=0, diag=0;
		
		for(linha=0 ; linha<3 ; linha++)
		
			
		for(coluna=0 ; coluna<3 ; coluna++)
		{
			System.out.println("Entre com um valor: ");
			matrix[linha][coluna]=ler.nextInt();
			soma = matrix[linha][coluna] + soma;
			
		if (linha == coluna)
		{
			diag=diag + matrix[linha][coluna];
		}
		}
		for(linha=0 ; linha<3 ; linha++)
		{
		for(coluna=0 ; coluna<3 ; coluna++)
		{
		
		System.out.print("\t"+ matrix[linha][coluna]);
		}
		System.out.print("\n");
		}
		System.out.println("A soma de todos os numeros: "+soma);
		System.out.println("A soma da diagonal :" + diag);
		
		ler.close();
		}
	
}

