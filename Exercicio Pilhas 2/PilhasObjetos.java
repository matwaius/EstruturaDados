
public class PilhasObjetos {
	public Object[] pilha;
	public int indicePilha;

	public PilhasObjetos() {
		this.indicePilha = -1;
		this.pilha = new Object[100];
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
	
	public Object mostraTopo() {
		if (estaVazia()) {
			return -1;
		} else {
			return pilha[indicePilha];
		}
	}
	
	public Object desempilhar() {
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



