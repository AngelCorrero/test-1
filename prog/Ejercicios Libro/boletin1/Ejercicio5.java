package boletin1;

import java.util.Scanner;

import recursividad.Entrada;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un n�mero e indicar si es positivo o negativo
		
		Scanner teclado=new Scanner(System.in);
		int a=0;
		
		System.out.println("Introduce un n�mero");
		a=teclado.nextInt();
		
		if(a!=0) {
			if(a>0) {
				System.out.println("El n�mero es positivo.");
			}
			else {
				System.out.println("El n�mero es negativo.");
			}
		}
		else {
			System.out.println("El n�mero 0 no puede ser positivo ni negativo.");
		}
	}
	
	

}
