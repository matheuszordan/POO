package br.ucb.lista08.Exercicio02;

public class Vendedor {
	String nome;
	double produto;
	
	double venda() {
		double venda=0;
		venda = ((this.produto*0.10)+this.produto);
		
		return venda;
	}
}
