package OrientacaoObjeto.Abstrato;

public class TesteAbstrato 
{
	public static void main(String[] args) 
	{
		Animal a = new Cachorro();
		System.out.println(a.respirar());
		System.out.println(a.mover());
		
		Mamifero b = new Cachorro();
		
		System.out.println(b.mamar());
	}	
}
