package br.ucb.lista10.questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Executora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Turma turma = new Turma(0);
		do {
			turma.armazenarAluno();
			System.out.println("Pressione 's' para novo aluno:");
		}while(entrada.next().charAt(0)=='s');
		
		System.out.println("A m�dia da turma � "+turma.calculaMediaTurma());
		System.out.println("A quantidade de alunos na turma � de "+turma.alunos.size());
	
		turma.exibir();
	}

}
