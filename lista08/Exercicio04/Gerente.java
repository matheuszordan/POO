package br.ucb.lista08.Exercicio04;

import br.ucb.lista08.Exercicio03.Funcionario;

public class Gerente extends Funcionario {
	@Override
	public void setSalario( double salario) {
		salario = ((salario*0.25)+salario);
	}
		
}
