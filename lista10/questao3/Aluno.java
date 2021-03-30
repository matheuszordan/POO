package br.ucb.lista10.questao3;

public class Aluno {
	
	String nome;
	double nota1, nota2;
	double media;
	
	void calculaMedia() {
		this.media = (this.nota1+this.nota2)/2;
	}

}
