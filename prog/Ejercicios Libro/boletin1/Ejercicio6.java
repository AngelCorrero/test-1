package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir dos n�meros y decir si uno es m�ltiplo del otro.
		int a=0, b=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		a=teclado.nextInt();
		System.out.println("Introduce otro n�mero");
		b=teclado.nextInt();
		
		// while(a>0 || b>0) {
		
			if(a!=0 && b!=0){
				
				if (a % b == 0) {
					System.out.println("El n�mero " + a + " es m�ltiplo de " + b);
				} 
				else {
					if (b % a == 0) {
						System.out.println("El n�mero " + b + " es m�ltiplo de " + a);
					}
				
					else {
						System.out.println("Ninguno de los dos n�meros es m�ltiplo del otro");
					}
				}
			}
			else {
				System.out.println("Por favor, introduzca un n�mero distinto de cero");
			}
		/*	System.out.println("Introduce un n�mero");
			a=teclado.nextInt();
			System.out.println("Introduce otro n�mero");
			b=teclado.nextInt();
		}*/
		teclado.close();
	}

}
