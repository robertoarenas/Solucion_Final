package com.senati.eti.data;

import java.io.*;
import com.senati.eti.model.Alumno;
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter archivo=null;
		PrintWriter pw=null;
		
		try {
			archivo=new FileWriter("info.txt",true);
			pw=new PrintWriter(archivo);
			String nom="",ape="",gen="";
			int ed=0;
			
			System.out.println("\nREGISTRO DE DATOS");
			System.out.println("-----------------");
			System.out.print("Nombre............: ");
			nom=sc.nextLine();
			System.out.print("Apellido..........: ");
			ape=sc.nextLine();
			System.out.print("G�nero [F-M]......: ");
			gen= sc.nextLine();
			System.out.print("Edad [14-60]......: ");
			ed=sc.nextInt();
			
			Alumno objAlumno=new Alumno(nom,ape,gen,ed);
			
			pw.println("-----------------");
			pw.println("Datos registrados");
			pw.println("-----------------");
			pw.println("Nombre y Apellido......: "+ objAlumno.NombreCompleto());
			pw.println("G�nero.................: "+ objAlumno.MostrarGenero());
	
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally{
			//Cierre del archivo
			try {
				if(archivo!=null) archivo.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}

			
		}


	}

}
