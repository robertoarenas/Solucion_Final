package com.senati.eti;

import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese edad: ");
		int edad=sc.nextInt();
		
		String mensaje="Menor de edad";
		
		//Condicional simple
		if(edad>=18)
			mensaje="Mayor de edad";
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Condición....: "+ mensaje);

	}

}
