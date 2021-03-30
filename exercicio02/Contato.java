package br.ucb.lista03.exercicio02;
import java.util.Scanner;

public class Contato extends Agenda {
	private String NomeContato;
	private double numero;
	
	Scanner leia = new Scanner(System.in);
	
	

	public String getNomeContato() {
		NomeContato="";
		do {
			System.out.println("Informe o nome do contato: ");
			NomeContato=leia.next();
			if(NomeContato=="") {
				System.out.println("Valor invalido, digite Novamente: ");
			}
		}while(NomeContato=="");
		return NomeContato;
	}

	public void setNomeContato(String nomeContato) {
		NomeContato = nomeContato;
	}

	public double getNumero() {
		numero=0;
		do {
			System.out.println("Informe o numero do contato: ");
			numero=leia.nextDouble();
				if(numero<=0) {
					System.out.println("Numero invalido, digite novamente: ");
				}
		}while(numero<=0);
	return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}


	public String ImpressaoDados() {
		String dados = "Nome do Dono :"+this.getNomeDono();
		dados += "Nome da agenda : "+this.getNomeAgenda();
		dados += "Quantidade de contatos: "+this.getQtdContatos();
		dados += "Nome Contato :"+this.NomeContato;
		dados += "Numero do contato: "+this.numero;
		return dados;
	
	}
}