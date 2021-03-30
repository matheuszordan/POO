package br.ucb.lista07.Exercicio03;

public class Apoio extends Funcionario{

	double fornecaDesconto() {
		double desconto=0;
		if(this.getSalarioBase()<=1000) {
			desconto = 0;
		}
		else if((getSalarioBase()>1000) && (getSalarioBase()<=1800)) {
			desconto = getSalarioBase()*0.10;
		}
		else if(getSalarioBase()>1800) {
			desconto = getSalarioBase()*0.25;
		}
		
		return desconto;
	}
	
	double fornecaSalarioBruto() {
		double salarioBruto=0;
		
		salarioBruto=getSalarioBase();
		
		return salarioBruto;
	}
	
	double fornecaAuxilioEducacao(){
		double auxEducacao = 0;
		int dep = 0;
		dep = getnDependentes();
		if(dep>5) {
			dep = 5;
		}
		auxEducacao = dep*60.00;
		
		return auxEducacao;
	}
}
