package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
		
		Scanner teclado=new Scanner(System.in);
		int x=0;
		
		System.out.println("Introduzca un número:");
		x=teclado.nextInt();
		
		while (x!=0) {
			if (x>0) {
				System.out.println("El número "+x+" es positivo");
			}
			else {
				System.out.println("El número "+x+" es negativo");
			}
			System.out.println("Introduzca otro número:");
			x=teclado.nextInt();
		}
		System.out.println("Sesión terminada.");
		
		teclado.close();
		
	}

}
