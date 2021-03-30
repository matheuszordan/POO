package br.ucb.lista08.Exercicio01;

public class ContaEspecial extends Conta {
	double limite;

	ContaEspecial(double limite){
		this.limite = limite;
	}
	void sacar(double valor) {
		if(valor<=getSaldo()+limite) {
			if(getSaldo()<valor)
				this.limite -= valor;
			setSaldo(getSaldo()-valor);
			System.out.println("Limite é de "+this.limite);
		}else
			System.out.println("Limite insuficiente.");
	}

}