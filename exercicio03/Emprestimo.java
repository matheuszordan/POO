package br.ucb.lista03.exercicio03;
import java.util.Scanner;
public class Emprestimo extends Livro {
	private String locacao;
	private String devolucao;
	boolean disponibilidade;
	Livro Livro;
	
	Scanner leia = new Scanner(System.in);
	
	public String ValidaNome() {
		nome="";
			do { 
				System.out.println("Informe o nome do livro que deseja pegar: ");
				nome=leia.next();
					if(nome=="") {
						System.out.println("Nome invalido, digite novamente: ");
					}
			}while(nome=="");
		
		return nome;
	}
	
	public boolean Disponibilidade(int Qtd) {
		disponibilidade=false;
			if(Qtd<0) {
				System.out.println("Livro indisponivel.");
				return disponibilidade=false;
			}else {
				System.out.println("Livro disponivel");
				return disponibilidade=true;
			}
		
	}
}
