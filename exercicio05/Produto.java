package br.ucb.lista03.exercicio05;
import java.util.Scanner;
public class Produto {
	private String nome;
	private float preco;
	private int qtd;
	private float valorPago;
	
	Scanner leia = new Scanner(System.in);
	
	public String getNome() {
		do {
			System.out.println("Informe o nome do produto: ");
			nome=leia.next();
				if(nome=="") {
				  System.out.println("Campo invalido, digite novamente: ");
				}
		}while(nome=="");
	return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco(){
		System.out.println("Informe o preco do produto: ");
		preco=leia.nextFloat();
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getQtd() {
		System.out.println("Informe a quantidade de produtos: ");
		qtd=leia.nextInt();
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public float getValorPago(float preco, int qtd) {
		if(qtd<10) {
			System.out.println("Nao houve desconto");
			return valorPago=preco;
		}else if(qtd>11 && qtd<=20){
			System.out.println("Desconto de 10%");
			return valorPago = (float) (this.preco-(this.preco*0.10));
		}else if(qtd>21 && qtd<=50){
			System.out.println("Desconto de 20%");
			return valorPago=(float) (this.preco-(this.preco*0.20));
		}else if(qtd>50){ 
			System.out.println("Desconto de 25%");
			return valorPago=(float) (this.preco-(this.preco*0.25));
				}
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}
	
	public String impressaoDados() {
		String dados = "Nome do produto: "+this.nome;
		dados += "\nPreco do produto: "+this.preco;
		dados += "\nQuantidade de produtos: "+this.qtd;
		dados += "\nValor com desconto : "+this.valorPago;
		
		return dados;
	}
}
