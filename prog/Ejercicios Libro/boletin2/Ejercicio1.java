package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
		
		Scanner teclado=new Scanner(System.in);
		int x=0, cuadrado=0;
		
		System.out.println("Introduzca un número");
		x=teclado.nextInt();
		
		while (x>=0) {
			cuadrado=(int) Math.pow(x, 2);
			System.out.println("El cuadrado de "+x+" es "+cuadrado);
			System.out.println("Introduzca otro número");
			x=teclado.nextInt();
		}
		System.out.println("Sesión terminada");
		
		teclado.close();
		
	}

}
