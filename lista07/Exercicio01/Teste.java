package br.ucb.lista07.Exercicio01;
import java.util.Scanner;
public class Teste {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		Administrativo a1 = new Administrativo();
		Professor p1 = new Professor();
		
		System.out.println("Qual tipo de funcionario deseja informar: ");
		System.out.println("\nP - Professor ");
		System.out.println("\nA - Administrativo: ");
		char op = leia.next().charAt(0);
		switch(op) {
		case 'p':
			System.out.println("\nFuncionario Professor Selecionado");
			System.out.println("Informe o nome do professor: ");
			p1.setNome(leia.next());
			System.out.println("Informe o CPF: ");
			p1.setCpf(leia.next());
			System.out.println("Informe o salario: ");
			p1.setSalario(leia.nextFloat());
			System.out.println("Informe a titulacao do professor: ");
			p1.setTitulacao(leia.next());
			p1.getImpostoRenda();
			break;
		case 'a':
			System.out.println("\nFuncionario Administrativo selecionado");
			System.out.println("Informe o nome do Administrativo: ");
			a1.setNome(leia.next());
			System.out.println("Informe o CPF: ");
			a1.setCpf(leia.next());
			System.out.println("Informe o salario: ");
			a1.setSalario(leia.nextFloat());
			System.out.println("Informe quantos dependentes: ");
			a1.setDependentes(leia.nextInt());
			a1.getContribuicaoSindical();
			break;
		default :
			System.out.println("Opcao invalida ");
		}
		
		System.out.println(p1.ImpressaoDados());
		System.out.println(a1.ImpressaoDados());
		
		
		
	}
}
