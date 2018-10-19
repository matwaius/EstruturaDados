
public class ElementoLista {

	int valor;
	ElementoLista proximo;
	
	public ElementoLista(int v) {
		this.valor = v;
		this.proximo = null;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public ElementoLista getProximo() {
		return proximo;
	}

	public void setProximo(ElementoLista proximo) {
		this.proximo = proximo;
	}
	
	

}
