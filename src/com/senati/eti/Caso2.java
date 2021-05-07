package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n=sc.nextInt();
		
		int x=1;
		int suma=0;
		
		while (x<=n) {
			suma+=x;
			if(x<n)
				System.out.print(x+"+");
			else
				System.out.print(x+"="+suma);
			x++;
		}
		
		
		
		/*
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Sumatoria....: "+ suma);*/

	}

}
