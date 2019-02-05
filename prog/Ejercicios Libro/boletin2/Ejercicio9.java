package boletin2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir todos los números del 100 al 0 de 7 en 7.
		
		Scanner teclado=new Scanner(System.in);
		int i=100;
		
		while(i>0) {
			System.out.println(i);
			i=i-7;
		}
		
		System.out.println(0);
		
	}

}
