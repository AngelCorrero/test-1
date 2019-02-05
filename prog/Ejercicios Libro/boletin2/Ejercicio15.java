package boletin2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
		// la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.

		Scanner teclado = new Scanner(System.in);
		int edad = 0, i = 0, alum18 = 0, alum175 = 0, sumaEdad = 0;
		double mediaEdad = 0, mediaEstatura = 0, sumaEstatura = 0, estatura = 0;

		for (i = 1; i <= 5; i++) {
			System.out.println("Introduce edad y altura en metros");
			edad = teclado.nextInt();
			estatura = teclado.nextDouble();
			
			sumaEdad += edad;
			sumaEstatura += estatura;
			
			//Vamos a decir que los que tienen exactamente 18 años son mayores de 18 puesto que ya  son mayores de edad.
			
			if (edad >= 18) {
				alum18++;
			}
			
			//En esta ocasión no vamos a contar a los que miden exactamente 1.75 
			
			if (estatura > 1.75) {
				alum175++;
			}
		}
		mediaEdad = sumaEdad / 5;
		System.out.println("La media de edad es " + mediaEdad + " y hay " + alum18 + " mayores de 18");

		mediaEstatura = sumaEstatura / 5;
		System.out.println("La media de estatura es " + mediaEstatura + " y hay " + alum175 + " que miden más de 1,75");
	}

}
