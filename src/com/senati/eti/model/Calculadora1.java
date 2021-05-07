package com.senati.eti.model;

public class Calculadora1 {
	//Atributos
	private float numero1;
	private float numero2;
	
	//Definir m�todos Getters y Setters
	public float getNumero1() {
		return this.numero1;
	}
	
	public void setNumero1(float n1) {
		this.numero1=n1;
	}
	public float getNumero2() {
		return this.numero2;
	}
	public void setNumero2(float n2) {
		this.numero2=n2;
	}
	//Definir los constructores
	
	//Constructorr vac�o
	public Calculadora1() {
		
	
	}
	
	//Constructor con par�metro de entrada
	public Calculadora1(float n1,float n2) {
		this.numero1=n1;
		this.numero2=n2;
	}
	
	//M�todos personalizados
	
	public float Suma() {
		return this.numero1+this.numero2;
	}
	public float Resta() {
		return this.numero1-this.numero2;
	}
	public float Producto() {
		return this.numero1 * this.numero2;
	}
	
	public float Division() {
		float r=0;
		if (this.numero2 != 0) {
			return this.numero1 / this.numero2;
		}
		return r;
		}
	
	public float Resto_Entero() {
		float r=0;
		if (this.numero2 != 0) {
			return this.numero1 % this.numero2;
		}
		
		return r;
			
	}
	
	
	
	
}
