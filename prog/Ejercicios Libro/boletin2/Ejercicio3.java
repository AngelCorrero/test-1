package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		
		Scanner teclado=new Scanner(System.in);
		int x=0;
		
		System.out.println("Introduzca un número:");
		x=teclado.nextInt();
		
		while (x!=0) {
			if (x%2==0) {
				System.out.println("El número "+x+" es par");
			}
			else {
				System.out.println("El número "+x+" es impar");
			}
			System.out.println("Introduzca otro número:");
			x=teclado.nextInt();
		}
		System.out.println("Sesión terminada.");
		
		teclado.close();
		
	}
}
