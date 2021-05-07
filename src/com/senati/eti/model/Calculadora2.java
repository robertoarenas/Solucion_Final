package com.senati.eti.model;

public class Calculadora2 {
	private float numero1;
	private float numero2;
	public float getNumero1() {
		return this. numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return this.numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	public Calculadora2() {
		
	}
	public Calculadora2(float n1,float n2) {
		this.numero1=n1;
		this.numero2=n2;
	}
	public float Calcular(int opc) {
		float rp=0;
		
		switch (opc) {
		case 1:
			rp=this.numero1+this.numero2;
			break;
		case 2:
			rp=this.numero1-this.numero2;
			break;
		case 3:
			rp=this.numero1*this.numero2;
			break;
		case 4:
			if (this.numero2 != 0) {
				rp=this.numero1/this.numero2;
			}else
				rp = 0;
			break;
		case 5:
			if (this.numero2 != 0) {
				rp=this.numero1%this.numero2;
			}else
				rp = 0;
			break;
			
		case 6:
			rp=(this.numero1+this.numero2)/2;
			break;
		case 7:
			rp=(this.numero1*this.numero1)+(this.numero2*this.numero2);
			break;
		case 8:
			rp=((this.numero2-this.numero1)/this.numero1)*100;
			break;
		case 9:
			if (this.numero1> this.numero2)
				rp=this.numero1;
			else
				rp=this.numero2;
			break;
		case 10:
			if (this.numero1< this.numero2)
				rp=this.numero1;
			else
				rp=this.numero2;
			break;
				
						
		}
			
		return rp;
	}

	
}
