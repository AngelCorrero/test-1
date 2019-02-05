package boletin2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
		//la cantidad de ceros.
		
		Scanner teclado=new Scanner(System.in);
		int sumaP=0, sumaN=0, cuentaP=0, cuentaN=0, ceros=0, n=0;
		double mediaP=0, mediaN=0;
		
		for (int i=1; i<=10; i++)  {
			System.out.println("Introduzca un número");
			n=teclado.nextInt();
			if(n>0) {
				sumaP=sumaP+n;
				cuentaP++;
			}
			else {
				if (n<0) {
					sumaN=sumaN+n;
					cuentaN++;
				}
				else {
					ceros++;
				}
			}
		}
		if(cuentaP==0) {
			System.out.println("No se puede hacer la cuenta de los positivos");
		}
		else {
			mediaP=sumaP/cuentaP;
			System.out.println("La media de los números positivos es "+mediaP);
		}
		if(cuentaN==0) {
			System.out.println("No se puede hacer la cuenta de los negativos");
		}
		else {
			mediaN=sumaN/cuentaN;
			System.out.println("La media de los números negativos es "+mediaN);
		}
		System.out.println("Se han introducido "+ceros+" ceros");
	}

}
