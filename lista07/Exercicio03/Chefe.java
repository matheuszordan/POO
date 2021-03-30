package br.ucb.lista07.Exercicio03;

public class Chefe extends Funcionario {
	double gratChefia;

	public double getGratChefia() {
		return gratChefia;
	}

	public void setGratChefia(double gratChefia) {
		this.gratChefia = gratChefia;
	}
	
	@Override
	double fornecaSalarioBruto() {
		double salarioBruto=0;
		
		salarioBruto=this.getSalarioBase();
		
		return salarioBruto;
	}
}
