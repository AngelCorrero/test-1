package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir n�meros hasta que se teclee uno negativo, y mostrar cu�ntos n�meros se han introducido.
		
		Scanner teclado=new Scanner(System.in);
		int x=0, cuentaNumeros=0;
		
		System.out.println("Introduzca un n�mero:");
		x=teclado.nextInt();
		
		while (x>=0) {
			cuentaNumeros++;
			System.out.println("Introduzca otro n�mero:");
			x=teclado.nextInt();
		}
		System.out.println("Se han introducido "+cuentaNumeros+" n�meros.");
		
		teclado.close();
		
	}

}
