package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer n�meros hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		
		Scanner teclado=new Scanner(System.in);
		int x=0;
		
		System.out.println("Introduzca un n�mero:");
		x=teclado.nextInt();
		
		while (x!=0) {
			if (x%2==0) {
				System.out.println("El n�mero "+x+" es par");
			}
			else {
				System.out.println("El n�mero "+x+" es impar");
			}
			System.out.println("Introduzca otro n�mero:");
			x=teclado.nextInt();
		}
		System.out.println("Sesi�n terminada.");
		
		teclado.close();
		
	}
}
