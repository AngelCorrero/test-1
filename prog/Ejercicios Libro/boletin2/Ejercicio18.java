package boletin2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres
		//productos con precios: 1- 0,6 �/litro, 2- 3 �/litro y 3- 1,25 �/litro.


		Scanner teclado = new Scanner(System.in);
		int cuenta600 = 0, litros = 0, cod = 0, litros_art1 = 0, i = 0;
		double precio_litro = 0, factura = 0, total = 0;

		for (i = 1; i <= 5; i++) {
			System.out.println("Factura n�mero " + i);
			System.out.println("C�digo de articulo:");
			cod = teclado.nextInt();
			System.out.println("Cantidad vendida en litros:");
			litros = teclado.nextInt();
			
			switch(cod) {
			case 1: precio_litro=0.6;
			break;
			case 2: precio_litro=3;
			break;
			case 3: precio_litro=1.25;
			break;
			default: precio_litro=0;
			}
			
			factura = precio_litro * litros;
			total += factura;

			if (cod == 1) {
				litros_art1 += litros;
			}
			if (factura > 600) {
				cuenta600++;
			}
		}

		System.out.println("\nLa facturaci�n total es " + total);
		System.out.println("\nSe han vendido " + litros_art1 + " litros del art�culo 1");
		System.out.println("\nSe emitieron " + cuenta600 + " facturas de m�s de 600�");

	}

}
