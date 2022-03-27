package exercicio2;

import java.util.Scanner;

public class imprestimo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		System.out.println("nessa tela verificaremos se você é apto ao impréstimo.");
		System.out.println("digite o valor do seu salário ");
		salario = teclado.nextDouble();
		double prestacao;
		System.out.println("agora digite a prestação do seu impréstimo:");
		prestacao = teclado.nextDouble();
		if (prestacao <= salario * 0.3) {
			System.out.println("ok seu impréstimo foi aprovado.");
		} else {
			System.out.println("não , infelismente seu impréstimo foi negado.");
		}
	}

}
