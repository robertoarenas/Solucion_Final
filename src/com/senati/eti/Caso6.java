package com.senati.eti;

import java.util.Scanner;

public class Caso6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String nombre="",rpta="S",estado="";
		int nr=0,na=0,edad=0;
		
		while (rpta.equals("S") || rpta.equals("s")) {
			nr++;
			System.out.println("----------------");
			System.out.println("REGISTRO"+nr+": ");
			System.out.println("----------------");
			
			System.out.print("Nombre..............:");
			nombre=sc.nextLine();
			System.out.print("Edad................:");
			edad=sc.nextInt();
			
			
			if (edad>=18) {
				estado="Apto para votar";
			    na++;
			}
			else
				estado="Menor de edad";
			
			System.out.println("Estado.....:"+estado);
			
			sc.nextLine();
			
			System.out.print("¿Registrar otro? <S/N>: ");
			rpta=sc.nextLine();
		}
		System.out.println("-------------");
		System.out.println("R E S U M E N");
		System.out.println("Participantes registados "+nr);
		System.out.println("Cantidad de participantes aptos para votar "+na);
	
		
		

	}

}
