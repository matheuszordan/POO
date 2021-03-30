package br.ucb.lista07.Exercicio01;

public class Professor extends Funcionario {
	private String titulacao;

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	double getImpostoRenda() {
		double imposto;
		imposto=(getSalario()*23)/100;
		
		return imposto;
	}
	
	String ImpressaoDados() {
		String dados = "Nome: "+getNome();
		dados+= "\nCPF: "+getCpf();
		dados+= "\nSalario: "+getSalario();
		dados+= "\nTituacao: "+getTitulacao();
		dados+= "\nImposto de renda: "+getImpostoRenda();
		return dados;
	}
}
