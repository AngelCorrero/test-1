package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir el radio de una circunferencia y calcular su longitud.
		
		Scanner teclado=new Scanner(System.in);
		double r=0, l=0;
		
		System.out.println("Introduzca el radio de su circunferencia");
		r=teclado.nextDouble();
		
		l=2*r*Math.PI;
		
		System.out.println("La longitud de una circunferencia de radio "+r+" es "+l);
	
	}

}
