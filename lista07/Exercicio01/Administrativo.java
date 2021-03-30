package br.ucb.lista07.Exercicio01;

public class Administrativo extends Funcionario{
	private int dependentes;

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependetes) {
		this.dependentes = dependetes;
	}
	
	
	double getContribuicaoSindical() {
		double contribuicao;
		contribuicao=(getSalario()*1)/100;
		return contribuicao;
	}
	
	String ImpressaoDados() {
		String dados = "Nome: "+getNome();
		dados+= "\nCPF: "+getCpf();
		dados+= "\nSalario: "+getSalario();
		dados+= "\nDependentes: "+getDependentes();
		dados+=" \nContribuicao Sindical: "+getContribuicaoSindical();
		return dados;
	}
	
}
