package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese n�mero: ");
		int n=sc.nextInt();
		
		String mensaje="";
		
		if(n%2==0)
			mensaje="N�mero es par";
		else
			mensaje="N�mero es impar";
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Mensaje....: "+ mensaje);

	}

}
