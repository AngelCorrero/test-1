package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir dos n�meros y decir si son iguales o no.

		Scanner teclado = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.println("Introduzca el primer n�mero");
		a = teclado.nextInt();

		System.out.println("Introduzca el segundo n�mero");
		b = teclado.nextInt();

		if (a == b) {
			System.out.println("Los n�meros son iguales");
		} else {
			System.out.println("Los n�meros no son iguales");
		}

	}

}
