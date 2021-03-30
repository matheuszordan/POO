package br.ucb.lista03.exercicio03;
import java.util.Scanner;
public class Pessoa {
	private String nome;
	private float cpf;
	private float telefone;
	
	Scanner leia = new Scanner (System.in);
	
	public String getNome() {
		nome = "";
			do {
				System.out.println("Informe o seu nome: ");
				nome=leia.next();
					if(nome=="") {
						System.out.println("Campo invalido, digite novamente: ");
					}
			}while(nome=="");
		
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getCpf() {
		cpf=0;
			do {
				System.out.println("Informe o seu cpf: ");
				cpf=leia.nextFloat();
					if(cpf<=01000000000) {
						System.out.println("Valor invalido, digite novamente: ");
					}
			}while(cpf<=01000000000);
		return cpf;
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	public float getTelefone() {
		telefone=0;
			do {
				System.out.println("Informe o seu telefone: ");
				telefone=leia.nextFloat();
					if(telefone<=0 );
						System.out.println("Valor invalido, digite novamente: ");
						
			}while(telefone<=0);
		return telefone;
	}
	public void setTelefone(float telefone) {
		this.telefone = telefone;
	}
	
	
	
}
