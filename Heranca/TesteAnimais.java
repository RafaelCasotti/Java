package Heranca;

public class TesteAnimais extends Animal {

	public static void main (String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguica p = new Preguica();
		
		c1.setNome("Akira");
		c1.setIdade(2);
		c1.setCorrer("Brinca Corre");
		c1.setEmitirSom(true);
		
		c2.setNome("Jose");
		c2.setIdade(8);
		c2.setBrincarCorrer("Corrida");
		c2.setEmitirSom(true);
		
		p.setNome("Joao");
		p.setIdade(3);
		p.setSubirArvore("Sobe em árvore");
		p.setEmitirSom(false);
		
		System.out.println("Nome do cachorro: " + c1.getNome()+"\t Idade do cachorro: "+c1.getIdade()+" anos" + "\t O que ele faz: "+ c1.getCorrer() + " \t Emite som: " + c1.isEmitirSom());
		System.out.println("Nome do cavalo: " + c2.getNome()+"\t Idade do cavalo: "+c2.getIdade()+" anos" + "\t O que ele faz: "+ c2.getBrincarCorrer() + " \t Emite som: " + c2.isEmitirSom());	
		System.out.println("Nome do Preguiça: " + p.getNome()+"\t Idade do preguiça: "+p.getIdade()+" anos" + "\t O que ele faz: "+ p.getSubirArvore() + "\t Emite som: " + p.isEmitirSom());
		
		
		
	}
}
