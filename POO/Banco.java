package POO;

public class Banco {
	
	String banco;
	String tipoConta;
	double saldo;
	
	public void movimentacao() {
		System.out.println("Qual o banco: "+this.banco);
		System.out.println("Qual o tipo de conta: "+this.tipoConta);
		System.out.println("Saldo: "+this.saldo);
	}
}
