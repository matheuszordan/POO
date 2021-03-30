package br.ucb.lista08.Exercicio02;
import java.util.Scanner;
public class Teste {
	public static void main(String Args[]) {
		Scanner leia = new Scanner(System.in);
		Vendedor v1 = new Vendedor();
		System.out.println("Informe o nome do vendedor: ");
		v1.nome=leia.next();
		System.out.println("Informe o valor do produto: ");
		v1.produto=leia.nextDouble();
		
		System.out.println("Valor de venda do produto pelo vendendor: "+v1.venda());
		
		Gerente g1 = new Gerente();
		System.out.println("Informe o nome do Gerente: ");
		g1.nome=leia.next();
		System.out.println("Informe o valor do produto: ");
		g1.produto=leia.nextDouble();
		
		System.out.println("Valor de venda do produto pelo Gerente: "+v1.venda());
	}
}
