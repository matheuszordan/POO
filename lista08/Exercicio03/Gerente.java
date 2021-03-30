package br.ucb.lista08.Exercicio03;

public class Gerente extends Funcionario {
	@Override
	public void setSalario( double salario) {
		salario = ((salario*0.25)+salario);
	}
		
}
