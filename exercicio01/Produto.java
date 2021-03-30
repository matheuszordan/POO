package br.ucb.lista03.exercicio01;
import java.util.Scanner;
public class Produto {
	private String Nome;
	private double preco;
	private int qtdEstoque;
	Scanner leia = new Scanner(System.in);
	Produto Produto;
	
	
	public String getNome() {
		Nome="";
		Scanner leia = new Scanner(System.in);
			do {
				System.out.println("Informe o nome do produto: ");
				Nome=leia.next();
					if(Nome == "") {
					System.out.println("Produto invalido, digite novamente ");
				}
			
			}while(Nome == "");

		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	public double getPreco() {
		preco=0;
		Scanner leia = new Scanner(System.in);
			do {
				System.out.println("Informe o preço do produto: ");
				preco=leia.nextDouble();
				if(preco<=0) {
					System.out.println("Valor invalido, digite novamente: ");
					
				}
			}while(preco<=0);
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtdEstoque() {
		qtdEstoque=0;
			do {
				System.out.println("Informe a quantidade em estoque: ");
				qtdEstoque=leia.nextInt();
				if(qtdEstoque<=0) {
					System.out.println("Valor invalido, digite novamente: ");
				}
			}while(qtdEstoque<=0);
		return qtdEstoque;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String ImpressaoDadosProduto() {
		String dados = "Produto "+this.Nome;
		dados+= "\n Preço "+this.preco;
		dados+="\n Quantidade em estoque: "+this.qtdEstoque;
		return dados;
	}
	
	
	
	
}
