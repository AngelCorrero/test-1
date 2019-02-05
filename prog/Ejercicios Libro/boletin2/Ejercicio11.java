package boletin2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11. Diseñar un programa que muestre el producto de los 10 primeros números impares.
		
		Scanner teclado=new Scanner(System.in);
		
		
		//FORMA 1
		/*int i=0, x=0, p=1;
		
		while(i<10) {
			if (x%2!=0) {
				p=p*x;
				x=x+2;
				i++;
			}
			else {
				x=x+1;
			}
		
		}
		
		System.out.println("Producto="+p); */
		
		//FORMA 2
		
		int i=0, x=1, p=1;
		
		for(i=0;i<10;i++) {
			if (x%2!=0) {
				p=p*x;
				x=x+2;
			}
			else {
				x=x+1;
				i=i-1;
			}
		}
		System.out.println("Producto="+p);	
	}
}
