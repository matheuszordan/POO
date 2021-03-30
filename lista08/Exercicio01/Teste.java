package br.ucb.lista08.Exercicio01;


public class Teste {

	public static void main(String[] args) {
		
		Conta cc = new ContaEspecial(1000);
		
		cc.setSaldo(10);
		System.out.println("Saldo da conta "+cc.getSaldo());
		cc.sacar(10);
		System.out.println("Saldo da conta "+cc.getSaldo());
	}

}
