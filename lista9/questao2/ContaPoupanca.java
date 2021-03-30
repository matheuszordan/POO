package br.ucb.lista9.questao2;

public class ContaPoupanca extends ContaBancaria {
	
	private double taxaRend;
	
	ContaPoupanca(double taxa){
		this.taxaRend = taxa;
	}

	public double getTaxaRend() {
		return taxaRend;
	}

	public void setTaxaRend(double taxaRend) {
		this.taxaRend = taxaRend;
	}

	@Override
	double saca(double valor) {
		if(this.getSaldo()>=valor) 
			this.setSaldo(this.getSaldo()-valor);
		return this.getSaldo();
	}

	@Override
	double deposita(double valor) {
		this.setSaldo(this.getSaldo()+valor);
		return this.getSaldo();
	}

	@Override
	void tiraExtrato() {
		// TODO Auto-generated method stub
		System.out.println("Saldo na conta: "+this.getSaldo());
		System.out.println("Taxa de rendimento: "+taxaRend);
	}

}
