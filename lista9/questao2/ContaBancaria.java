package br.ucb.lista9.questao2;

import java.util.Scanner;

public abstract class ContaBancaria {
	
	private String senha;
	private int numero;
	private double saldo;
	
	abstract double saca(double valor);
	abstract double deposita(double valor);
	abstract void tiraExtrato();
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	void alteraSenha(String senha) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha atual:");
		if(entrada.next().equals(this.senha))
			this.senha = senha;
		else
			System.out.println("A senha atual incorreta.");		
		
	}

}
