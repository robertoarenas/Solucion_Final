package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float num1=0,num2=0;
		
		System.out.println("Primero n�mero...:");
		num1=sc.nextFloat();
		
		System.out.println("Segundo n�mero...:");
		num2=sc.nextFloat();
		
		float suma=num1+num2;
		float resta=num1-num2;
		float producto=num1*num2;
		float division=num1/num2;
		float restoentero=num1%num2;
		
		System.out.println("\nN�mero Ingresados");
		System.out.println("------------------");
		System.out.println("Suma....: "+suma);
		System.out.println("Resta...: "+resta);
		System.out.println("Producto.:"+producto);
		System.out.println("Divisi�n.:"+division);
		System.out.println("Resto Entero.:"+restoentero);
		
		
				

	}

}