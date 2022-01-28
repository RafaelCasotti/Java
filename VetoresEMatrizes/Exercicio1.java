package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int[]nota = new int[5];
		int maior=0, x;
		
		for(x=0 ; x<5 ; x++){
			System.out.print("Digite um numero: ");
			nota[x]=ler.nextInt();
		}
		for(x=0 ; x<5 ; x++) {
			System.out.print(nota[x]+"\t");
		if (nota[x] > maior) 
				maior=nota[x];
		}
	
			System.out.println("\nO numero maior é: " + maior);
				
		
			
			ler.close();
	}

}

