package exercicio3;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroDigitado;
		System.out.println("at� que n�mero devemos contar?");
		numeroDigitado = teclado.nextInt();
		int contador;
		for (contador = 1; contador <= numeroDigitado; contador++) {
			System.out.println(contador);
		}
	}
}
