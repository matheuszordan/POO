package br.ucb.lista9.questao2;

import java.util.Scanner;

public class Executora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ContaBancaria contaC = new ContaCorrente();
		ContaBancaria contaP = new ContaPoupanca(0.9);
		
		contaC.setNumero(1234);
		contaC.setSaldo(100);
		contaC.setSenha("123456");
		
		System.out.println("Numero da conta: "+contaC.getNumero());
		System.out.println("Saldo: "+contaC.getSaldo());
		System.out.println("Senha: "+contaC.getSenha());
		contaC.alteraSenha("654321");
		System.out.println("Senha: "+contaC.getSenha());
		System.out.println("Conta Corrente:");
		contaC.saca(50);
		contaC.tiraExtrato();
		contaC.deposita(30);
		contaC.tiraExtrato();
		
		System.out.println("Conta Poupança:");
		contaP.setNumero(4321);
		contaP.setSaldo(200);
		contaP.setSenha("09876");
		contaP.tiraExtrato();
		contaP.saca(150);
		contaP.tiraExtrato();
		contaP.deposita(33.33);
		contaP.tiraExtrato();
		

	}

}
