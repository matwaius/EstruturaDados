package ExemploListaSimplesLuciano;

public class Main {

	public static void main(String[] args) 
	{
		ListaSimples l = new ListaSimples();
		l.inserePrimeiro(1);
		l.inserePrimeiro(2);
		l.insereUltimo(3);
		l.insereNaPosicao(5, 2);
		System.out.println(l.comprimento());
	}
}
