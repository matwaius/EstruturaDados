import javax.swing.JOptionPane;

public class MainPareImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilhaPar p = new PilhaPar();
		PilhaImpar i = new PilhaImpar();
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite um número.\n\n 0 = Fim."));
			if (op!=0) {
				if (op%2 == 0) {
					p.empilha(op);
				}
				if (op%2 == 1) {
					i.empilha(op);
				}
			}
		} while (op != 0);
		
		int cont = 0;
		
		while (!p.estaVazia() || !i.estaVazia()) {
			if (cont%2 == 1) {
				System.out.println(p.desempilha());
			} else {
				System.out.println(i.desempilha());
			}
			cont ++;
		}
		
		
	}

}
