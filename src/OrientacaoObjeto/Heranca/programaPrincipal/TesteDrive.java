package OrientacaoObjeto.Heranca.programaPrincipal;

import OrientacaoObjeto.Heranca.Desafio.Civic;
import OrientacaoObjeto.Heranca.Desafio.Ferrari;

public class TesteDrive 
{
	public static void main(String[] args) 
	{
		//Carro civic = new Civic(); # funciona da mesma forma que o de baixo
		Civic civic = new Civic();
		System.out.println("Civic " + civic.VELOCIDADE_MAXIMA);
		
		Ferrari ferrari = new Ferrari();
		System.out.println("Ferrari " + ferrari.VELOCIDADE_MAXIMA);
		
		//System.out.println("Civic -> " + civic.velocidadeAtual);
		//System.out.println("Ferrari -> " + ferrari.velocidadeAtual);

		//ferrari.ligarTurbo();
		ferrari.desligarTurbo();
		ferrari.ligarAr();
		//ferrari.desligarAr();
		
		for(int i=0; i<30; i++)
		{
			civic.acelerar();
			ferrari.acelerar();
			System.out.println(civic.toString(civic, "Civic"));
			System.out.println(civic.toString(ferrari, "Ferrari"));
		}
		
		for(int i=0; i<25; i++)
		{
			civic.frear();
			ferrari.frear();
			System.out.println(civic.toString(civic, "Civic"));
			System.out.println(civic.toString(ferrari, "Ferrari"));
		}

	}
}
