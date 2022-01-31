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
			System.out.println("A cor do avião é: "+this.cor);
		}
		public void modeloAviao()
		{
			System.out.println("O modelo do avião é: "+this.modelo);
		}
		public void pesoAviao()
		{
			System.out.println("O peso do avião é: "+this.peso+" quilo" );
		}
		public void funcao()
		{
			if(this.funcionamento==true)
			System.out.println("O avião está em funcionamento: " + this.funcionamento);
				
			else
				System.out.println("O avião está desligado :" +this.funcionamento);
	}
}


