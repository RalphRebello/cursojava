package OrientacaoObjeto.Heranca.Desafio;

public class Ferrari extends Carro
{
	//construtores
	Ferrari()
	{
		this(300); //aponta para o de baixo
	}
	
	Ferrari(int vel_max) //aponta para o construtor da classe pai
	{
		super(vel_max);
		fator_aceleracao = 15;
		fator_frenagem = 15; //variaveis acessiveis devido a herança da classe Carro
	}
	
//	@Override  //sobrescreve um metodo da classe pai (Carro)
//	void acelerar()
//	{
//		super.acelerar();
//	}
}
