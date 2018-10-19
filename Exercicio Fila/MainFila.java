
public class MainFila {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		f.insere(1);
		f.insere(2);
		f.insere(3);
		while (f.vazia() == false) {
			System.out.println(f.remove());
		}
	}
}
