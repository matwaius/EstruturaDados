
public class Fila {
	
	private Elemento inicio, fim;
	public Fila() {
		inicio = fim = null;
	}

	public boolean vazia() {
		return inicio == null;
		}
	
	public void insere(int v) 
	{
		Elemento novo = new Elemento(v);
		if (vazia()) 
		{
			inicio = novo;
			fim = novo;
		} 
		else 
		{
			fim.proximo = novo;
			fim = novo;
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
		Elemento aux = inicio;
		while (aux != null) 
		{
			tam++;
			aux = aux.proximo;
		}
		return tam;
	}

}
