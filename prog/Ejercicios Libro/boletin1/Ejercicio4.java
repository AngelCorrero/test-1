package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir dos números y decir si son iguales o no.

		Scanner teclado = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.println("Introduzca el primer número");
		a = teclado.nextInt();

		System.out.println("Introduzca el segundo número");
		b = teclado.nextInt();

		if (a == b) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números no son iguales");
		}

	}

}
