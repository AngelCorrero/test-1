package boletin2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
		
		Scanner teclado=new Scanner(System.in);
		int x=0, suma=0;
		
		System.out.println("Introduce un número");
		x=teclado.nextInt();
		
		while (x!=0) {
			suma=suma+x;
			System.out.println("Introduce otro número");
			x=teclado.nextInt();
		}
		System.out.println("La suma de todos los números es "+suma);
		
	}
}