package com.senati.eti;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DATOS DEL EMPLEADO");
		System.out.println("------------------");
		System.out.print("Nombre...............: ");
		String nombre=sc.nextLine();
		System.out.print("Nivel[1-4]...........: ");
		int nivel=sc.nextInt();
		System.out.print("Ingrese sueldo.......: ");
		float sueldo=sc.nextFloat();
		
		float incremento=0;
		
		switch (nivel) {
		    case 1: 
		    	incremento=0.45f;
		    	break;
		    case 2:
		    	incremento=0.06f;
		    	break;
		    case 3:
		    	incremento=0.085f;
		    	break;
		    case 4:
		    	incremento=0.11f;
		    	break;
		    default:
		    	incremento=0; 	
		}
		System.out.println("\nResultados");
	    System.out.println("------------");
		System.out.println("Empleado.......:" + nombre);  
		System.out.println("Nivel..........:" + nivel); 
		System.out.println("Sueldo.........:" + sueldo); 
		System.out.println("Incremento.....:" + (incremento*100)+"%");
		System.out.println("Nuevo sueldo...:" +((sueldo*incremento)+sueldo)); 

	}

}
