package paquete_github;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir 15 n�meros y escribir la suma total
		
		Scanner teclado=new Scanner(System.in);
		int x=0, i=0, suma=0;
		
		while (i<15) {
			System.out.println("Introduzca un n�mero");
			x=teclado.nextInt();
			suma=suma+x;
			i++;
			
		}
		
		System.out.println("La suma de todos los n�meros es "+suma);
	}

}
