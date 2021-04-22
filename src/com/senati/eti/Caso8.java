package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese lado del cuadrado: ");
		int lado=sc.nextInt();
		
		int area=(int)Math.pow(lado, 2);
		int perimetro=lado*4;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Área del cuadrado.............: " + area);
		System.out.println("Perímetro del cuadrado.............: " + perimetro);
				
				

	}

}
