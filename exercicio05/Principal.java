package br.ucb.lista03.exercicio05;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.getNome();

		p1.getValorPago(p1.getPreco(),p1.getQtd());
		
		System.out.println(p1.impressaoDados());
		
		
	}

}
