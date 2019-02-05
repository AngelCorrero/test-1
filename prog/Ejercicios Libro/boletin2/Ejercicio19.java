package boletin2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4)
		// y suspensos

		Scanner teclado = new Scanner(System.in);
		int i = 0, aprob = 0, cond = 0, susp = 0, nota = 0;

		for (i = 1; i <= 6; i++) {
			System.out.println("Introduzca la nota del alumno:");
			nota = teclado.nextInt();
			if (nota >= 5) {
				aprob++;
			} else if (nota == 4) {
				cond++;
			} else {
				susp++;
			}

		}

		System.out.println("Hay " + aprob + " alumnos aprobados");
		System.out.println("Hay " + cond + " alumnos condicionados");
		System.out.println("Hay " + susp + " alumnos suspensos");

	}

}
