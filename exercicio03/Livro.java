package br.ucb.lista03.exercicio03;
import java.util.Scanner;
public class Livro {
	protected String nome;
	protected int Qtd;
	private int cod;
	Scanner leia = new Scanner(System.in);
	
	
	public String nome() {
		nome="";
			do {
				System.out.println("Informe o nome do livro: ");
				nome=leia.next();
					if(nome=="") {
						System.out.println("Nome invalido, digite novamente: ");
					}
			}while(nome=="");
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		Qtd=0;
			do {
				System.out.println("Informe a quantidade de exemplares disponiveis: ");
				Qtd=leia.nextInt();
					if(Qtd<0) {
						System.out.println("Valor invalido, digite novamente: ");
					}
			}while(Qtd<0);
		return Qtd;
	}
	
	public void setQtd(int qtd) {
		Qtd = qtd;
	}
	public int getCod() {
		cod=0;
			do {
				System.out.println("Informe o codigo do livro: ");
				cod=leia.nextInt();
					if(cod<=0) {
						System.out.println("Valor invalido, digite novamente: ");
					}
			}while(cod<=0);
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	
}
