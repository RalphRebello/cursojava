package OrientacaoObjeto.Heranca;

public class Jogador 
{
	int x;
	int y;
	int vida = 100;
	
	Jogador(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	boolean atacar(Jogador oponente)
	{
		int difX = Math.abs(x - oponente.x);
		int difY = Math.abs(y - oponente.y);
		
		if(difX == 0 && difY == 1)
		{
			oponente.vida -= 10;
			return true;
		}
		else if(difX == 1 && difY == 0)
		{
			oponente.vida -= 10;
			return true;
		}
		else
			return false;
	}
	
	boolean andar(Direcao direcao)
	{
		switch (direcao) 
		{
			case NORTE:
				y++;
				break;
			case SUL:
				y--;
				break;
			case LESTE:
				x++;
				break;
			case OESTE:
				x--;
				break;
		}
		
		return true;
	}
}
