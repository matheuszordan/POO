package br.ucb.lista10.questao1;

public class TestaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
		}
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Saldo da "+(i+1)+"ª conta = "+contas[i].saldo);
		}

	}

}
