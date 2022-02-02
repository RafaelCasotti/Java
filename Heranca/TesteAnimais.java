package Heranca;

public class TesteAnimais extends Animal {

	public static void main (String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguica p = new Preguica();
		
		c1.setNome("Akira");
		c1.setIdade(2);
		c1.setCorrer("Brinca Corre");
		
		
		c2.setNome("Jose");
		c2.setIdade(8);
		c2.setBrincarCorrer("Corrida");
		
		
		p.setNome("Joao");
		p.setIdade(3);
		p.setSubirArvore("Sobe em árvore");
		
		
		System.out.println("Nome do cachorro: " + c1.getNome()+"\t Idade do cachorro: "+c1.getIdade()+" anos" + "\t O que ele faz: "+ c1.getCorrer());
		c1.emitirSom();
		System.out.println("Nome do cavalo: " + c2.getNome()+"\t Idade do cavalo: "+c2.getIdade()+" anos" + "\t O que ele faz: "+ c2.getBrincarCorrer());
		c2.emitirSom();
		System.out.println("Nome do Preguiça: " + p.getNome()+"\t Idade do preguiça: "+p.getIdade()+" anos" + "\t O que ele faz: "+ p.getSubirArvore());
		p.emitirSom();
		
		
		
	}
}
