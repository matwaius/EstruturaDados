
public class MainPilhaDinamica {

	public static void main(String[] args) {
		
		PilhaDinamica p = new PilhaDinamica();
		p.empilha(1);
		p.empilha(2);
		p.empilha(3);
		while (p.estaVazia() == false) {
			System.out.println(p.desempilha());
		}
	}
}
