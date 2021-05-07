package com.senati.eti.data;

import java.util.Scanner;

import com.senati.eti.model.Calculadora1;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora1 objCalc=new Calculadora1();
		
		float n1=0,n2=0;
		
		System.out.println("LECTURA DE N�MEROS");
		System.out.println("------------------");
		System.out.print("N�mero 1: ");
		n1=sc.nextFloat();
		System.out.print("N�mero 2: ");
		n2=sc.nextFloat();
		
		objCalc.setNumero1(n1);
		objCalc.setNumero2(n2);
		
		System.out.println("\nR E S U L T A D O S");
		System.out.println("-------------------");
		System.out.println("1. Suma......: "+objCalc.Suma());
		System.out.println("1. Resta.....: "+objCalc.Resta());
		System.out.println("3. Producto.......: " + objCalc.Producto());
		
		if(objCalc.getNumero2() !=0) {
			System.out.println("4. Divisi�n...........: " + objCalc.Division());
			System.out.println("5. Resto entero.......: " + objCalc.Resto_Entero());
		} 
		else{
			System.out.println("4. Divisi�n...........: No es posible" );
			System.out.println("5. Resto entero.......: No es posible" );
		}
	}
}
