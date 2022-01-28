package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 {
	
 public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
		int[]lan = new int[10]; 
		int x, maior=0, cont=0;
		double soma=0, media=0;
		 
		
		for( x=0 ; x<10 ; x++){
			System.out.println("Lance as 10 jogadas do dado: ");
			lan[x]=ler.nextInt();
			
		}
		for(x=0 ; x<10 ; x++){	
			System.out.println( lan[x]);
		}
		for(x=0 ; x<10 ; x++){	
			
			soma = soma + lan[x];
			media = soma /10;
	
		
		if(maior<lan[x]) {
			maior = lan[x];
		}		
		}
		
		for(x=0 ; x<10 ; x++) {
		if(maior == lan[x]) {
				cont=cont + 1;
			}
		
		}	
		System.out.println("Media: "+ media);
		System.out.println("Maior: "+ maior);
		System.out.println("Contagem do maior: "+ cont);
			
		ler.close();
		}
 }

	
		



