package com.senati.eti;
//Importando la librer�a para lecura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		//Creando un objeto sc a partir de la clase Scanner
		Scanner sc= new Scanner(System.in);
		
		//Declara la variable y asginar un valor
		int numero=0;
		
		//Lectura
		System.out.print("Ingrese n�mero: ");
		numero=sc.nextInt();
		
		//Impresi�n
		System.out.println("\nN�mero Ingresado");
		System.out.println("------------------");
		System.out.println("N�mero.....:"+numero);
		

	}

}
