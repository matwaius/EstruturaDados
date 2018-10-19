package ExemploListaSimplesLuciano;

public class ListaSimples 
{
	private Elemento primeiro, ultimo, atual;
	
	public ListaSimples() 
	{
		primeiro = ultimo = atual = null;
	}
	
	// Retorna um booleano indicando se a lista est� vazia
	public boolean estaVazio() 
	{
		return primeiro == null;
	}
	
	// Retorna o n�mero de objetos da lista (tamanho)
	public int comprimento() 
	{
		int comp = 0;
		atual = primeiro;
		while(atual != null)
		{
			comp++;
			atual = atual.proximo;
		}
		return comp;
	}
	
	// Insere um novo objeto como primeiro elemento
	public void inserePrimeiro(int v) 
	{
		Elemento novo = new Elemento(v);
		if (estaVazio()) 
		{
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} 
		else 
		{
			novo.proximo = primeiro;
			primeiro = novo;
		}
	}
	
	// Insere um novo objeto como �ltimo elemento
	public void insereUltimo(int v) 
	{
		Elemento novo = new Elemento(v);
		if (estaVazio()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		}
		else 
		{
			ultimo.proximo = novo;
			ultimo = novo;
		}
	}
	
	// Move para a posi��o indicada
	public void moveParaPosicao(int pos) 
	{
		atual = primeiro;
		for (int i=0; i<pos; i++) 
		{
			atual = atual.proximo;
		}
	}
	
	// Insere um novo objeto na posi��o indicada
	public void insereNaPosicao(int v, int pos) 
	{
		Elemento novo = new Elemento(v);
		moveParaPosicao(pos);
		novo.proximo=atual.proximo;
		atual.proximo=novo;
	}
	
	// Retorna o primeiro elemento da lista
	public int primeiro() 
	{
		return primeiro.valor;
	}
	// Retorna o �ltimo elemento da lista
	public int ultimo() 
	{
		return ultimo.valor;
	}
	// Retorna o elemento na posi��o indicada
	public int elementoNaPosicao(int pos) 
	{
		moveParaPosicao(pos);
		return atual.valor;
	}
	
	// Retorna a posi��o de um elemento na lista.
	//Se n�o existir retorna um n�mero negativo
	public int buscaElemento(int v) 
	{
		int cont = 0;
		atual = primeiro;
		while(atual != null && atual.valor != v) 
		{
			atual = atual.proximo;
			cont ++;
		}
		if (atual != null)
		return cont;
		return -1;
	}
	
	// Remove o primeiro elemento da lista
	public void removePrimeiro() 
	{
		primeiro = primeiro.proximo;
	}
	// Remove o �ltimo elemento da lista
	public void removeUltimo() 
	{
		int pos;
		pos=comprimento()-1;
		moveParaPosicao(pos);
		atual.proximo=null;
		ultimo = atual;
	}
	
	// Remove da lista o elemento indicado
	public void removeElemento(int v) 
	{
		int pos;
		Elemento temp;
		pos=buscaElemento(v);
		if (pos > -1) 
		{
			temp=atual.proximo;
			pos=pos-1;
			moveParaPosicao(pos);
			atual.proximo=temp;
		}
	}
	
	// Remove o elemento da posi��o indicada
	public void removeNaPosicao(int pos) 
	{
		Elemento temp;
		moveParaPosicao(pos);
		temp=atual.proximo;
		pos=pos-1;
		moveParaPosicao(pos);
		atual.proximo=temp;
	}
	
	/*public void removeNaPosicao(int pos) 
	{
		moveParaPosicao(pos-1);
		atual.proximo=atual.proximo.proximo;
	}*/
}
