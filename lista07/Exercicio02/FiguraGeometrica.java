package br.ucb.lista07.Exercicio02;

public class FiguraGeometrica {
	private double base;
	private double altura;
	private double hipotenusa;
	
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	double calculaArea(double base,double altura) {
		double retangulo=0;
		this.base=0;
		this.altura=0;
		retangulo=(this.base*this.altura);
		return retangulo;
	}
	
	double calculaArea(double base,double altura, double hipotenusa) {
		double triRetangulo=0;
		this.base=0;
		this.altura=0;
		this.hipotenusa=0;
		triRetangulo=(this.base*this.altura)/2;
		
		return triRetangulo;
	}
}
