import javax.swing.JOptionPane;

public class MainLista {

	public static void main(String[] args) {
		
		
		Lista l = new Lista();
		l.insere(0);
		l.insere(1);
		l.insere(2);
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor : "));
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Posição a inserir : " +"\r\n" + "Tamanho Max "+l.tamanho()+"\r\n")) -1;
		int tamanho = l.tamanho() - 1;
		l.insereQualquerPosicao(tamanho,valor, pos);
		while (l.inicioVazio() == false) 
		{
			System.out.println(l.remove());
		}
	}
}
