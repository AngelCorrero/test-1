package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un juego para adivinar un número. Para ello pedir un número N, y
		// luego ir pidiendo.
		// números indicando “mayor” o “menor” según sea mayor o menor con respecto a N.
		// El proceso termina cuando el usuario acierta.

		Scanner teclado = new Scanner(System.in);
		int num = 0, n = 0; 

		System.out.println("Introduce el número N a adivinar");
		n = teclado.nextInt();

		System.out.println("Adivina el número");
		num = teclado.nextInt();

		while (num != n) {
			if (num > n) {
				System.out.println("El número " + num + " es mayor que N");
			} else {
				System.out.println("El número " + num + " es menor que N");
			}
			System.out.println("Introduce otro número");
			num = teclado.nextInt();
		}

		System.out.println("Enhorabuena, has acertado.");

		teclado.close();
	}
}