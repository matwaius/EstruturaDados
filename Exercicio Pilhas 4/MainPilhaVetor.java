
public class MainPilhaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lol = new int[]{0,1,2,3,4,5,6,7,8,9};
		
		PilhaVetor p = new PilhaVetor();
		
		for (int i = 0; i < 10; i++) {
			p.empilha(lol[i]);
		}
		
		while (!p.estaVazia()) {
			System.out.println(p.desempilha());			
		}
		

	}		
}
	


	