package POO;

public class Aviao {

	String cor;
	String modelo;
	double peso;
	boolean funcionamento;
	
	public Aviao()
	{
		this.cor="branco";
		this.modelo="Passageiro";
		this.peso=10.000;
		this.funcionamento=true;
	}
	
		public void corAviao()
		{
			System.out.println("A cor do avi�o �: "+this.cor);
		}
		public void modeloAviao()
		{
			System.out.println("O modelo do avi�o �: "+this.modelo);
		}
		public void pesoAviao()
		{
			System.out.println("O peso do avi�o �: "+this.peso+" quilo" );
		}
		public void funcao()
		{
			if(this.funcionamento==true)
			System.out.println("O avi�o est� em funcionamento: " + this.funcionamento);
				
			else
				System.out.println("O avi�o est� desligado :" +this.funcionamento);
	}
}


