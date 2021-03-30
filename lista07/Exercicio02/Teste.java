package br.ucb.lista07.Exercicio02;
import java.util.Scanner;
public class Teste {
	public static void main(String args[]) {
		Scanner leia = new Scanner (System.in);
		
		FiguraGeometrica Retangulo = new FiguraGeometrica();
		Retangulo.setAltura(1.8);
		Retangulo.setBase(5.0);
		
		Retangulo.calculaArea(5.0, 1.8);
		
		FiguraGeometrica TriRetangulo = new FiguraGeometrica();
		TriRetangulo.setAltura(7);
		TriRetangulo.setBase(10);
		
		TriRetangulo.calculaArea(10, 7,0);
		
	}
}
