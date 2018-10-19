public class PilhaOperando {
	
	private double n2 = 0;
	private double n1 = 0;
	private DadosOperando topo = null;
	
	public PilhaOperando() {
	}
	
	
	public boolean estaVazia() {
		return topo == null;
	}
	
	public void empilha(String v) {
		
		DadosOperando novo = new DadosOperando(v);
		if (topo == null)
		{
			topo = novo;
		}	
		else 
		{
			switch (v) {
			case "-":
				n2 = desempilha();
				n1 = desempilha();
				novo.valor = Double.toString(n1-n2);
				novo.proximo = topo;
				topo = novo;
				break;
			case "+":
				n2 = desempilha();
				n1 = desempilha();
				novo.valor = Double.toString(n1+n2);
				novo.proximo = topo;
				topo = novo;
				break;
			case "*":
				n2 = desempilha();
				n1 = desempilha();
				novo.valor = Double.toString(n1*n2);
				novo.proximo = topo;
				topo = novo;
				break;
			case "/":
				n2 = desempilha();
				n1 = desempilha();
				novo.valor = Double.toString(n1/n2);
				novo.proximo = topo;
				topo = novo;
				break;
			default:
				novo.proximo = topo;
				topo = novo;
				break;
			}
		}
	}
	
	public double desempilha() {
		double retVal = Double.parseDouble(topo.valor);
		topo = topo.proximo;
		return retVal;
	}

}
