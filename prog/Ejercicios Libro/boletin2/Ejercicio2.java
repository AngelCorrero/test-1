package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un n�mero e indicar si es positivo o negativo. El proceso se repetir� hasta que se introduzca un 0.
		
		Scanner teclado=new Scanner(System.in);
		int x=0;
		
		System.out.println("Introduzca un n�mero:");
		x=teclado.nextInt();
		
		while (x!=0) {
			if (x>0) {
				System.out.println("El n�mero "+x+" es positivo");
			}
			else {
				System.out.println("El n�mero "+x+" es negativo");
			}
			System.out.println("Introduzca otro n�mero:");
			x=teclado.nextInt();
		}
		System.out.println("Sesi�n terminada.");
		
		teclado.close();
		
	}

}
