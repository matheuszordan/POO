package br.ucb.lista03.exercicio04;

public class Principal {
	public static void main(String args []) {
		Cliente c1 = new Cliente ();
		c1.setNome("Matheus");
		c1.setValorInvestido(100);
		c1.setTaxaJuros(10);
		c1.setQtdMeses(12);
		
		System.out.println(c1.calculaJuros(100,10,12));
		
		
	}
}
