package br.ucb.lista03.exercicio01;
import java.util.Scanner;
public class Cliente {
	private String NomeCliente;
	private String item;
	private double QtdItem;
	private int pagamento;
	
	Scanner leia = new Scanner(System.in);
	
	
	public String getNomeCliente() {
		NomeCliente="";
		do {
			System.out.println("Informe o nome do cliente: ");
			NomeCliente=leia.next();
			if(NomeCliente=="") {
				System.out.println("Valor invalido, digite Novamente: ");
			}
		}while(NomeCliente=="");
		return NomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public String getItem() {
		item="";
		do {
			System.out.println("Qual item deseja comprar : ");
			item=leia.next();
			if(item=="") {
				System.out.println("Item invalido, digite novamente: ");
			}
		}while(item=="");
	return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public double getQtdItem() {
		QtdItem=0;
		do {
			System.out.println("Quantidade que deseja comprar do item: ");
			QtdItem=leia.nextDouble();
				if(QtdItem<=0) {
					System.out.println("Quantidade invalida, digite novamente: ");
			}
		}while(QtdItem<=0);
	return QtdItem;
	}
	
	public void setQtdItem(double qtdItem) {
		QtdItem = qtdItem;
	}
	public int getPagamento() {
		pagamento=0;
			do {
				
				System.out.println("Informe a forma de pagamento: ");
				System.out.println("1-Dinheiro ");
				System.out.println("2-Cheque ");
				System.out.println("3-Cartao ");
				pagamento=leia.nextInt();
				switch(pagamento) {
				
				case 1: 
					System.out.println("Pagamento realizado no dinheiro !");
				break;
				
				case 2: 
					System.out.println("Pagamento realizado no cheque! ");
				break;
				
				case 3: 
					System.out.println("Pagamento realizado no cartao!");
				break;
				
				default: 
					System.out.println("Opcao invalida, tente novamente.");
				}
			}while(pagamento<=0 || pagamento>3);
		return pagamento;
	}
	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
	public String ImpressaoDadosCliente() {
		String dados = "NomeCliente: "+this.NomeCliente;
		dados+= "\nItem: "+this.item;
		dados+= "\nQuantidade do item: "+this.QtdItem;
		dados+= "\nForma de pagamento: "+this.pagamento;
		
		return dados;
		
	}
	
}
