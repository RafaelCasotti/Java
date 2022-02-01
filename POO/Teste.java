package POO;

public class Teste {

	String nome;
	String endereco;
	String cidade;
	
	public Teste (String nome, String endereco, String cidade)
	{
		this.nome=nome;
		this.endereco=endereco;
		this.cidade=cidade;
		
	}
	
	public void cadastro()
	{
		System.out.println("Digite o seu nome: " +this.nome);
		System.out.println("Digite o seu endereco: " +this.endereco);
		System.out.println("Digite sua cidade: " +this.cidade);
		
	}
	
}
