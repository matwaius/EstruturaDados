
public class PilhaDeInteiros {
	public int[] pilha;
	public int indicePilha;

	public PilhaDeInteiros() {
		this.indicePilha = -1;
		this.pilha = new int[100];
	}
	
	public boolean estaVazia() {
		if (indicePilha == -1) {
			return true;
		}
		return false;
	}

	public int tamanho() {
		if (estaVazia()) {
			return -1;
		}
		return indicePilha + 1;
	}
	
	public int mostraTopo() {
		if (estaVazia()) {
			return -1;
		} else {
			return pilha[indicePilha];
		}
	}
	
	public int desempilhar() {
		if (estaVazia()) {
			return -1;
		}
		return pilha[indicePilha--];
	} 
	
	public void empilhar(int valor) {
		indicePilha++;
		pilha[indicePilha] = valor;
	}
	
}



