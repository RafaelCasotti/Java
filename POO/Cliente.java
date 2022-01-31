package POO;

public class Cliente {

	String nome;
	int idade;
	String endereco;
	
	public Cliente()
	{
		this.nome="Rafael";
		this.idade=27;
		this.endereco="Praça 7 de Setembro";
	}
	
	public void informarNome()
	{
		System.out.println("Nome: "+nome);
		
	}
	public void informarIdade()
	{
		System.out.println("Idade: "+idade+" anos");
	}
	public void infomarEndereco()
	{
		System.out.println("Endereço: "+endereco);
	}
}
