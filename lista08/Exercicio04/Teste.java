package br.ucb.lista08.Exercicio04;

public class Teste {
	public static void main(String args[]) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Matheus");
		f1.setIdade(22);
		f1.setNomeCargo("Vendedor");
		f1.setSalario(2.500);
		
		Gerente g1 = new Gerente();
		g1.setNome("Joao");
		g1.setIdade(35);
		g1.setNomeCargo("Gerente de vendas");
		g1.setSalario(10000.00);
		
		System.out.println("Salario Gerente: "+g1.getSalario());
	}
}
