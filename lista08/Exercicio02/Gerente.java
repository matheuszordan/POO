package br.ucb.lista08.Exercicio02;

public class Gerente extends Vendedor {

	
	double venda() {
		double venda=0;
		venda = ((this.produto*0.15)+this.produto);
		
		return venda;
	}
}
