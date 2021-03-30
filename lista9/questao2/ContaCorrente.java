package br.ucb.lista9.questao2;

public class ContaCorrente extends ContaBancaria {
	
	private int qtdeTransacoes;
	
	ContaCorrente(){
		qtdeTransacoes = 0;
	}
	
	public int getQtdeTransacoes() {
		return qtdeTransacoes;
	}

	public void setQtdeTransacoes(int qtdeTransacoes) {
		this.qtdeTransacoes = qtdeTransacoes;
	}

	@Override
	double saca(double valor) {
		if(this.getSaldo()>=valor) {
			this.setSaldo(this.getSaldo()-valor);
			setQtdeTransacoes(getQtdeTransacoes()+1);
		}
		return this.getSaldo();
	}

	@Override
	double deposita(double valor) {
		this.setSaldo(this.getSaldo()+valor);
		setQtdeTransacoes(getQtdeTransacoes()+1);
		return this.getSaldo();
	}

	@Override
	void tiraExtrato() {
		// TODO Auto-generated method stub
		System.out.println("Saldo na conta: "+this.getSaldo());
		System.out.println("Quantidade de transações: "+qtdeTransacoes);
	}

}
