package boletin1;

import java.util.Scanner;

import recursividad.Entrada;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un número e indicar si es positivo o negativo
		
		Scanner teclado=new Scanner(System.in);
		int a=0;
		
		System.out.println("Introduce un número");
		a=teclado.nextInt();
		
		if(a!=0) {
			if(a>0) {
				System.out.println("El número es positivo.");
			}
			else {
				System.out.println("El número es negativo.");
			}
		}
		else {
			System.out.println("El número 0 no puede ser positivo ni negativo.");
		}
	}
	
	

}
