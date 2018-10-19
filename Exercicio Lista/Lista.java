
public class Lista {
	
	private ElementoLista inicio, fim, atual;
	public Lista() {
		inicio = fim = atual = null;
	}

	public boolean inicioVazio() {
		return inicio == null;
		}
	
	public void insere(int v) 
	{
		ElementoLista novoLista = new ElementoLista(v);
		if (inicioVazio()) 
		{
			inicio = novoLista;
			fim = novoLista;
		} 
		else 
		{
			novoLista.proximo = inicio;
			inicio = novoLista;
		}
	}
	
	public void insereQualquerPosicao(int tamanho,int v, int pos) 
	{
		ElementoLista novoLista = new ElementoLista(v);
		if(pos == 0) //INSERE NO PRIMEIRO
		{
			novoLista.proximo = inicio;
			inicio = novoLista;
		}
		else if(pos == tamanho) //INSERE NO ULTIMO
		{
			fim.proximo =  novoLista;
			fim =  novoLista;
		}
		else //INSERE NA POSICAO
		{
			for (int i = 0; i < tamanho ; i++) 
			{
				atual = inicio.proximo;
				inicio = atual;
				if(pos == tamanho)
				{
					novoLista.proximo = inicio;
				}
			}
		}
	}
	
	// Remove um elemento da fila
	public int remove() 
	{
		int v = inicio.valor;
		inicio = inicio.proximo;
		return v;
	}
	// Retorna o primeiro elemento da fila
	public int frente() 
	{
		return inicio.valor;
	}
	
	// Retorna o tamanho da fila
	public int tamanho() 
	{
		int tam = 0;
		ElementoLista aux = inicio;
		while (aux != null) 
		{
			tam++;
			aux = aux.proximo;
		}
		return tam;
	}

	public ElementoLista getInicio() {
		return inicio;
	}

	public void setInicio(ElementoLista inicio) {
		this.inicio = inicio;
	}

	public ElementoLista getFim() {
		return fim;
	}

	public void setFim(ElementoLista fim) {
		this.fim = fim;
	}

	public ElementoLista getAtual() {
		return atual;
	}

	public void setAtual(ElementoLista atual) {
		this.atual = atual;
	}
	
	

}
