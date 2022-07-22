package OrientacaoObjeto.Heranca.Desafio;

public class Carro 
{
	//atributos
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	int fator_aceleracao = 5;
	int fator_frenagem = 5;
	
	//construtores
	Carro(int vel_max)
	{
		VELOCIDADE_MAXIMA = vel_max;
	}
	
	//metodos
	void acelerar()
	{
		if(velocidadeAtual + fator_aceleracao > VELOCIDADE_MAXIMA)
			velocidadeAtual = VELOCIDADE_MAXIMA;
		else
			velocidadeAtual += fator_aceleracao;
	}
	
	void frear()
	{
		if(velocidadeAtual > 0)
			velocidadeAtual -= fator_frenagem;
	}
	
	public String toString(Carro carro, String nome)
	{
		return nome + " -> " + carro.velocidadeAtual;
	}
	
}
