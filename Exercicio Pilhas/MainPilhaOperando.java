
public class MainPilhaOperando {

	public static void main(String[] args) {
		
		PilhaOperando p = new PilhaOperando();
		p.empilha("2");
		p.empilha("3");
		p.empilha("+");
		p.empilha("5");
		p.empilha("3");
		p.empilha("-");
		p.empilha("*");
		p.empilha("2");
		p.empilha("/");
		System.out.println("Resultado Final "+p.desempilha());
		
		PilhaOperando c = new PilhaOperando();
		c.empilha("5");
		c.empilha("5");
		c.empilha("+");
		c.empilha("2");
		c.empilha("5");
		c.empilha("+");
		c.empilha("+");
		System.out.println("Resultado Final "+c.desempilha());
	}
}
