package com.acc.beans;



public class Tasa {
	int cliente_idcliente = 0;
	int numaccidentes = 0;
	int numtrabajadores = 0;
	float tasaacc = 0;

	public Tasa(int numaccidentes, int numtrabajadores, float tasaacc) {
		this.numaccidentes = numaccidentes;
		this.numtrabajadores = numtrabajadores;
		this.tasaacc = tasaacc;
	}

	public Tasa() {
		// TODO Auto-generated constructor stub
	}


	public int getNumaccidentes() {
		return numaccidentes;
	}

	public void setNumaccidentes(int numaccidentes) {
		this.numaccidentes = numaccidentes;
	}

	public int getNumtrabajadores() {
		return numtrabajadores;
	}

	public void setNumtrabajadores(int numtrabajadores) {
		this.numtrabajadores = numtrabajadores;
	}

	public float getTasaacc() {
		return tasaacc;
	}

	public void setTasaacc(float tasaacc) {
		this.tasaacc = tasaacc;
	}

	public int getCliente_idcliente() {
		return cliente_idcliente;
	}

	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}



		
	}


	
	

