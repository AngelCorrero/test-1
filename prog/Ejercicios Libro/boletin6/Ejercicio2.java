package boletin6;

import java.util.Scanner;

public class Ejercicio2 {

	 public static void main(String[] args) {
		 int num;
		 Scanner teclado=new Scanner(System.in);
		 System.out.print("Introduzca un numero: ");
		 num=teclado.nextInt();
		 System.out.println("---------------------------");
		 mostrar(num);
		 System.out.println("---------------------------");
		 }
		 static void mostrar(int num){
		 for (int i=0;i<num;i++){
		 System.out.println("Módulo ejecutándose");
		 }
		 }
}