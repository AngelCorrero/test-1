package boletin2;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Una empresa que se dedica a la venta de desinfectantes necesita un programa
		// para gestionar las
		// facturas. En cada factura figura: el código del artículo, la cantidad vendida
		// en litros y el precio por litro.
		// Se pide de 5 facturas introducidas: Facturación total, cantidad en litros
		// vendidos del artículo 1
		// y cuantas facturas se emitieron de más de 600 €.

		Scanner teclado = new Scanner(System.in);
		int cuenta600 = 0, litros = 0, cod = 0, litros_art1 = 0, i = 0;
		double precio_litro = 0, factura = 0, total = 0;

		for (i = 1; i <= 5; i++) {
			System.out.println("Factura número " + i);
			System.out.println("Código de articulo:");
			cod = teclado.nextInt();
			System.out.println("Cantidad vendida en litros:");
			litros = teclado.nextInt();
			System.out.println("Precio por litro:");
			precio_litro = teclado.nextDouble();

			factura = precio_litro * litros;
			total += factura;

			if (cod == 1) {
				litros_art1 += litros;
			}
			if (factura > 600) {
				cuenta600++;
			}
		}

		System.out.println("\nLa facturación total es " + total);
		System.out.println("\nSe han vendido " + litros_art1 + " litros del artículo 1");
		System.out.println("\nSe emitieron " + cuenta600 + " facturas de más de 600€");

	}

}
