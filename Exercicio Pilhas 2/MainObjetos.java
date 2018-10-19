
public class MainObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilhaDeInteiros p = new PilhaDeInteiros();
		p.empilhar(1);
		p.empilhar(2);
		p.empilhar(3);
		p.empilhar(4);
		p.empilhar(5);
		while (p.estaVazia() == false) {
			System.out.println(p.desempilhar());
		}
	}

}
