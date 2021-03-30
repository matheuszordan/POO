package br.ucb.lista03.exercicio04;

public class Cliente {
	private String nome;
	private float ValorInvestido;
	private float taxaJuros;
	private int qtdMeses;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorInvestido() {
		return ValorInvestido;
	}
	public void setValorInvestido(float valorInvestido) {
		ValorInvestido = valorInvestido;
	}
	public float getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public int getQtdMeses() {
		return qtdMeses;
	}
	
	public void setQtdMeses(int qtdMeses) {
		this.qtdMeses = qtdMeses;
	}
	
	public float calculaJuros(float ValorInvestido, float taxaJuros, int qtdMeses) {
		float soma = 0;
		float total=0;
			soma = (ValorInvestido*taxaJuros)/100;
			total = soma*this.qtdMeses;
		return total;
	}
	
}
