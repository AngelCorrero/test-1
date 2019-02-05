package boletin2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir números hasta que se introduzca uno negativo, y calcular la media.
		
		Scanner teclado=new Scanner(System.in);
		double x=0, media=0, acumulador=0;
		int cuentaNumeros=0;
		
		System.out.println("Introduzca un número");
		x=teclado.nextDouble();
		
		while(x>=0) {
			cuentaNumeros++;
			acumulador=acumulador+x;
			media=acumulador/cuentaNumeros;
			System.out.println("Introduzca otro número");
			x=teclado.nextDouble();	
		}
		System.out.println("La media de los números introducidos es "+media);
	}
}
