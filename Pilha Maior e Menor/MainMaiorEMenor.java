
public class MainMaiorEMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilhaDinamica p = new PilhaDinamica();
		p.empilha(10);
		p.empilha(4);
		p.empilha(5);
		p.empilha(8);
		
		int menor = 9999;
		int maior = 0;
		double total = 0;
		int qtd = 0;
		
		while (!p.estaVazia()) {
			int atual = p.desempilha();
			if (atual > maior) {
				maior = atual;
			} else if (atual < menor) {
				menor = atual;
			}
			total+= atual;
			qtd++;
		}
		total = total/qtd;
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("O média aritmética é : " + total);
		
	}

}
