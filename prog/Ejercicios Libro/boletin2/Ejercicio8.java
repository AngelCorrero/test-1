package boletin2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un n�mero N, y mostrar todos los n�meros del 1 al N
		
		Scanner teclado=new Scanner(System.in);
		int i=1, n=0;
		
		System.out.println("Introduzca un n�mero N");
		n=teclado.nextInt();
		
		while (i<=n) {
			System.out.println(i);
			i++;
		}
		
	}

}
