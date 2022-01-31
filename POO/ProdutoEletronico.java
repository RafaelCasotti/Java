package POO;

public class ProdutoEletronico {

	String modelo;
	String cor;
	double peso;
	boolean camera;
	
	
	public ProdutoEletronico()
	{
		this.camera=true;
		this.modelo="Iphone 13";
		this.cor="Azul";
		this.peso=250.00;
	}
	public void modeloProd()
	{
		System.out.println("Qual o modelo do do aparelho eletronico: " +this.modelo);
	}
	public void corProd()
	{
		System.out.println("Qual a cor do aparelho :" + this.cor);
	}
	public void pesoProd()
	{
		System.out.println("Qual o peso do aparelho: " + this.peso + " grama");
	}
	public void cameraProd()
	{
		if(this.camera==true)
		System.out.println("Este celular tem camera de alta qualidade!!");
		else
		System.out.println("Este celular não tem camera boa!!!");		
	}
	{
	
	}
}
