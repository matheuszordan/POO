package br.ucb.lista10.questao3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Turma {
	ArrayList<Aluno> alunos;
	Aluno aluno;
	double somaMedias;
	
	Turma(double s){
		this.somaMedias = s;
		alunos = new ArrayList<Aluno>();
	}
	
	void armazenarAluno() {
		Scanner entrada = new Scanner(System.in);
		aluno = new Aluno();
		try {
			System.out.println("Digite o nome do aluno:");
			aluno.nome = entrada.next();
			System.out.println("Digite 1ª nota:");
			aluno.nota1 = entrada.nextDouble();
			System.out.println("Digite 2ª nota:");
			aluno.nota2 = entrada.nextDouble();
			aluno.calculaMedia();
			alunos.add(aluno);
		}catch(InputMismatchException e) {
			System.err.println("Erro no armazenamento dos dados....");
		}finally{
			System.out.println("Finally.....");
		}
	}
	
	double calculaMediaTurma() {
		for(int i=0;i<alunos.size();i++) {
			somaMedias+=alunos.get(i).media;
		}
		return this.somaMedias/alunos.size();
	}
	
	void exibir() {
		for(int i=0; i<alunos.size();i++)
			System.out.println(toString(i));
	}
	
	public String toString(int i) {
		String texto = "Nome: "+alunos.get(i).nome+"\n"+
				"Nota 1: "+alunos.get(i).nota1+"\n"+
				"Nota 2: "+alunos.get(i).nota2+"\n"+
				"Média: "+alunos.get(i).media+".\n\n";
		return texto;
	}
}
