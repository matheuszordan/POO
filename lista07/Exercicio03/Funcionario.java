package br.ucb.lista07.Exercicio03;

public class Funcionario extends Pessoa {

	private double salarioBase;
	private double grat;
	private int nDependentes;
	Pessoa Pessoa;
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getGrat() {
		return grat;
	}
	public void setGrat(double grat) {
		this.grat = grat;
	}
	public int getnDependentes() {
		return nDependentes;
	}
	public void setnDependentes(int nDepentendes) {
		this.nDependentes = nDepentendes;
	}
	
	double fornecaDesconto() {
		double desconto=0;
		if(this.salarioBase<=1000) {
			desconto = 0;
		}
		else if(this.salarioBase>1000 && this.salarioBase<=1800) {
			desconto = this.salarioBase*0.10;
		}
		else if(this.salarioBase>1800) {
			desconto = this.salarioBase*0.25;
		}
		
		return desconto;
	}
	
	double fornecaSalarioBruto() {
		double salarioBruto=0;
		
		salarioBruto=this.salarioBase;
		
		return salarioBruto;
	}
	
	double forcecaSalarioLiquido() {
		double salarioLiquido=0;
		
		salarioLiquido=this.salarioBase-fornecaDesconto();
		
		return salarioLiquido;
		
	}
	
	
}
