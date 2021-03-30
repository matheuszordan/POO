package br.ucb.lista08.Exercicio01;

public class Conta {
	private double saldo;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	void sacar(double valor) {
		if(valor<=saldo)
			saldo-=valor;
		else
			System.out.println("Saldo insuficiente.");
	}

}