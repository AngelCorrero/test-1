package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un juego para adivinar un n�mero. Para ello pedir un n�mero N, y
		// luego ir pidiendo.
		// n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N.
		// El proceso termina cuando el usuario acierta.

		Scanner teclado = new Scanner(System.in);
		int num = 0, n = 0; 

		System.out.println("Introduce el n�mero N a adivinar");
		n = teclado.nextInt();

		System.out.println("Adivina el n�mero");
		num = teclado.nextInt();

		while (num != n) {
			if (num > n) {
				System.out.println("El n�mero " + num + " es mayor que N");
			} else {
				System.out.println("El n�mero " + num + " es menor que N");
			}
			System.out.println("Introduce otro n�mero");
			num = teclado.nextInt();
		}

		System.out.println("Enhorabuena, has acertado.");

		teclado.close();
	}
}