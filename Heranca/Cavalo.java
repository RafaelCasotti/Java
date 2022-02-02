package Heranca;

public class Cavalo extends Animal {
	
	private String brincarCorrer;

	public String getBrincarCorrer() {
		return brincarCorrer;
	}

	public void setBrincarCorrer(String brincarCorrer) {
		this.brincarCorrer = brincarCorrer;
	}
	
	@Override
	public void emitirSom()
	{
		
		System.out.println("SMURFSMURF");
	}
	
	

}
