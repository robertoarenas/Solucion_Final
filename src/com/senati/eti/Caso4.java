package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int x=1,n=0,nm=0, aux=0,c=1;
		
		while(x<=4) {
			System.out.print("Ingrese n�mero "+x+": ");
			n=sc.nextInt();
			if (x==1) 
				aux=n;
			else
				if (aux==n)
					c++;
			if (n>nm)
				nm=n;
			x++;
		}
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("N�mero mayor....: "+ nm);
		
		if(c==4)
			System.out.println("Los n�meros son iguales...");
			

	}

}
