package boletin6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Realizar una funci�n, a la que se le pase como par�metro un n�mero N, y muestre por pantalla N
		//veces, el mensaje: �M�dulo ejecut�ndose�

		Scanner teclado=new Scanner(System.in);
		int num=0;
	
		System.out.println("Introduzca un n�mero:");
		num=teclado.nextInt();
		System.out.println("---------------------------");
		mostrar(num);
		System.out.println("---------------------------");
	}
	static void mostrar(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("M�dulo ejecut�ndose");
		}
	}
	
}
