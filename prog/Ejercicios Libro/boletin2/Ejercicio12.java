package boletin2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12. Pedir un n�mero y calcular su factorial.
		
		Scanner teclado=new Scanner(System.in);
		int n=0, f=1;
		
		System.out.println("Introduce un n�mero para calcular su factorial");
		n=teclado.nextInt();
		
		for (int i=n;i>0;i=i-1) {
			f=f*i;
		}
		System.out.println("El factorial de "+n+" es "+f);
	}

}
