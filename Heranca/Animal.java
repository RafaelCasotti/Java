package Heranca;

public class Animal {

	private String nome;
	private int idade;
	private String emitirSom;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void emitirSom()
	{
	System.out.println("Som padrão");
	}
	
	

}
