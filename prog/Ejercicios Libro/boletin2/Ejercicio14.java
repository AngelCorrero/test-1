package boletin2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
		
		Scanner teclado=new Scanner(System.in);
		double sueldo=0, sumaS=0;
		int i=0, miles=0;
		
		for(i=1;i<=10;i++) {
			System.out.println("Introduce un sueldo");
			sueldo=teclado.nextDouble();
			sumaS+=sueldo;
			if(sueldo>1000) {
				miles++;
			}
		}
		
		System.out.println("La suma de los sueldos es "+sumaS+", y hay "+miles+" sueldos por encima de los 1000€");
	}

}
