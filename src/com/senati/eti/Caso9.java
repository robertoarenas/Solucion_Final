package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int base, altura, perimetro, area;
		
		System.out.println("Ingresar lado 1: ");
		base= sc.nextInt();
		
		System.out.println("Ingresar lado 2: ");
		altura= sc.nextInt();
		
		perimetro=2* (base + altura);
		area= base * altura;
		
		System.out.println("El area es........: " + area);
		System.out.println("El perimetro es...: " + perimetro);
		
		



	}

}