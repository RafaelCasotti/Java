package Heranca;

public class Cachorro extends Animal {

	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	@Override
	public void emitirSom()
	{
		
		System.out.println("AUAUAUAU");
	}
	
}
