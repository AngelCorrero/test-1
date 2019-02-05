package boletin2;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

		Scanner teclado = new Scanner(System.in);
		int num = 0, i = 0;

		System.out.println("Introduce un número del 0 al 10");
		num = teclado.nextInt();
		if (num <= 10 && num >= 0) {
			for (i = 1; i <= 10; i++) {
				System.out.println(i + "x" + num + "=" + i * num);
			}
		} else {
			System.out.println("Número incorrecto");
		}

	}

}
