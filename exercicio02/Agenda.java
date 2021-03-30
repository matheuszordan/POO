package br.ucb.lista03.exercicio02;
import java.util.Scanner;
public class Agenda {
	private String NomeDono;
	private String NomeAgenda;
	private float QtdContatos;
	Contato Contato;
	Scanner leia = new Scanner(System.in);
	
	
	

	public String getNomeDono() {
		NomeDono="";
		do {
			System.out.println("Informe o seu nome: ");
			NomeDono=leia.next();
				if(NomeDono=="") {
					System.out.println("Nome invalido, digite novamente: ");
			}
			
		}while(NomeDono=="");
	return NomeDono;
	}
	
	public void setNomeDono(String nomeDono) {
		NomeDono = nomeDono;
	}
	public String getNomeAgenda() {
		NomeAgenda="";
		do {
			System.out.println("Informe o nome da agenda: ");
			NomeAgenda=leia.next();
				if(NomeAgenda=="") {
					System.out.println("Nome invalido, digite novamente: ");
				}
		}while(NomeAgenda=="");
	return NomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		NomeAgenda = nomeAgenda;
	}
	public float getQtdContatos() {
		QtdContatos=0;
		do { 
			System.out.println("Informe a quantidade de contatos da agenda: ");
			QtdContatos=leia.nextFloat();
				if(QtdContatos<=0) {
					System.out.println("Numero invalido, digite novamente: ");
				}
		}while(QtdContatos<=0);
	return QtdContatos;
	}
	
	public void setQtdContatos(int qtdContatos) {
		QtdContatos = qtdContatos;
	}
	
	
	

	
	
}
