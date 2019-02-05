package boletin2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un número N, y mostrar todos los números del 1 al N
		
		Scanner teclado=new Scanner(System.in);
		int i=1, n=0;
		
		System.out.println("Introduzca un número N");
		n=teclado.nextInt();
		
		while (i<=n) {
			System.out.println(i);
			i++;
		}
		
	}

}
