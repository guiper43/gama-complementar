package exercicio1;

import java.util.Scanner;

public class mediaNota {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite  a sua primeira nota");
		double nota1;
		nota1 = teclado.nextDouble();
		System.out.println("digite a sua segunda nota ");
		double nota2;
		nota2 = teclado.nextDouble();
		double media;
		media = (nota1 + nota2) / 2;
		System.out.println("sua média é " + media);
	}
}
