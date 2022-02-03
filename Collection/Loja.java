package Collection;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	public static void main(String [] args)
	
	{
		List<String> estoque = new ArrayList<>();
		
		estoque.add("Sapato");
		estoque.add("Tenis");
		estoque.add("Chinelo");
		estoque.add("Sapatenis");
		estoque.add("Sandalia");
		estoque.add("Sandalia Feminina");
		
		System.out.println(estoque); //Armazenando dados
		
	
		estoque.remove(4); //Removendo dados
		
		estoque.set(4, "Sandalia Masc/Femin");
													//Atualizando dados				
		estoque.add(2, "Chuteira");
		
		System.out.println(estoque);  //Apresentando dados
		
		System.out.println("Produtos no estoque: "+ estoque.size());
		
		
		
		
	}

}
