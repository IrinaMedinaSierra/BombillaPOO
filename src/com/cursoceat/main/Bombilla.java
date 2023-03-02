package com.cursoceat.main;

import javax.swing.plaf.IconUIResource;

public class Bombilla {
	static public boolean interruptorGeneral=true;
	private boolean interruptor;
	
	//constructor vacio, para crear el objeto bombilla en estado apagado
	public Bombilla() {
		this.interruptor = false;
	}
	
	// Metodo que enciende o apaga segun como este el interruptor
	public void encenderOapagar() {
		if (this.interruptor) {
			this.interruptor=false;			
		}else {
			this.interruptor=true;
		}
	}
	/////////////////////////////////////////////////////////////////
	
	//Metodo para encender la bombilla
	public void encender() {
		this.interruptor=true;		
	}
	
	//Metodo para apagar la bombilla
	public void apagar() {
		this.interruptor=false;
	}
	
	//Metodo para  cambiar estado
	public boolean estado() {
		return interruptorGeneral && this.interruptor;		
	}
	
	//Método para mostrar el estado
	
	public String mostrarEstado() {
		return estado()?" Encendido " : " Apagada ";
		
	}
	
}
