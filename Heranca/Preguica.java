package Heranca;

public class Preguica extends Animal {
	
	private String subirArvore;

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	@Override
	public void emitirSom()
	{
		
		System.out.println("ZZzzzZZZZZZZZZZZZ");
	}

}
