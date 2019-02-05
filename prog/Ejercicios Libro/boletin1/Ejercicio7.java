package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir dos números y decir cual es el mayor
		int a=0, b=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		a=teclado.nextInt();
		System.out.println("Introduce otro número");
		b=teclado.nextInt();
		
		if (a==b) {
			System.out.println("Los dos números son iguales");
		} 
		else {
			if (a>b) {
				System.out.println("El número " + a + " es mayor que " + b);
			}
			
			else {
				System.out.println("El número " + b + " es mayor que " + a);
			}
		}
	}

}