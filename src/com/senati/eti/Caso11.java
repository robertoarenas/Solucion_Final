package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese n�mero: ");
		int n=sc.nextInt();
		
		String dia="";
		
		//Condicional m�ltiple
		switch (n) {
		    case 1:
		    	dia="Domingo";
		    	break;
		    case 2:
		    	dia="Lunes";
		    	break;
		    case 3:
		    	dia="Martes";
		    	break;
		    default:
		    	dia="Desconocido";
		    		
		}
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("D�a de la semana.......:" + dia);
		
	}

}
