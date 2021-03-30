package br.ucb.lista03.exercicio01;

public class Teste {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.getNome();
		p1.getPreco();
		p1.getQtdEstoque();
		
		Cliente c1 = new Cliente();
		c1.getNomeCliente();
		c1.getItem();
		c1.getQtdItem();
		c1.getPagamento();
		
		System.out.println(p1.ImpressaoDadosProduto());
		System.out.println(c1.ImpressaoDadosCliente());
		
		
	}

}
