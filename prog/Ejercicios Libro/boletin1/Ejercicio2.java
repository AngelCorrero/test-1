package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double r=0, area=0;
		
		// Pedir el radio de un círculo y calcular su área (A=PI*r^2)
		
		System.out.println("Introduzca el radio del círculo");
		r=teclado.nextFloat();
			
		area=-Math.PI*Math.pow(r, 2);
	
		System.out.println("El área de un círculo de radio "+r+" es "+area);
	}
}
