package exercicio2;

import java.util.Scanner;

public class imprestimo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		System.out.println("nessa tela verificaremos se voc� � apto ao impr�stimo.");
		System.out.println("digite o valor do seu sal�rio ");
		salario = teclado.nextDouble();
		double prestacao;
		System.out.println("agora digite a presta��o do seu impr�stimo:");
		prestacao = teclado.nextDouble();
		if (prestacao <= salario * 0.3) {
			System.out.println("ok seu impr�stimo foi aprovado.");
		} else {
			System.out.println("n�o , infelismente seu impr�stimo foi negado.");
		}
	}

}
