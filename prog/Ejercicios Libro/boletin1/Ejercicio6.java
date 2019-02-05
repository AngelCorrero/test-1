package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir dos números y decir si uno es múltiplo del otro.
		int a=0, b=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		a=teclado.nextInt();
		System.out.println("Introduce otro número");
		b=teclado.nextInt();
		
		// while(a>0 || b>0) {
		
			if(a!=0 && b!=0){
				
				if (a % b == 0) {
					System.out.println("El número " + a + " es múltiplo de " + b);
				} 
				else {
					if (b % a == 0) {
						System.out.println("El número " + b + " es múltiplo de " + a);
					}
				
					else {
						System.out.println("Ninguno de los dos números es múltiplo del otro");
					}
				}
			}
			else {
				System.out.println("Por favor, introduzca un número distinto de cero");
			}
		/*	System.out.println("Introduce un número");
			a=teclado.nextInt();
			System.out.println("Introduce otro número");
			b=teclado.nextInt();
		}*/
		teclado.close();
	}

}
