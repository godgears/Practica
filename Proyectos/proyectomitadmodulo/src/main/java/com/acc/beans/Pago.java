package com.acc.beans;

public class Pago {

	private int id_pago;
	private String mesanio;
	private int montoregular;
	private int montoadicionales;
	private int id_cliente;
	
	public Pago() {
		// TODO Auto-generated constructor stub
	}
	
	public Pago(String mesanio, int montoregular, int montoadicional, int id_cliente) {
		this.mesanio = mesanio;
		this.montoregular = montoregular;
		this.montoadicionales = montoadicional;
		this.id_cliente = id_cliente;
	}


	public int getId_pago() {
		return id_pago;
	}

	public void setId_pago(int idpago) {
		this.id_pago = idpago;
	}

	public String getMesanio() {
		return mesanio;
	}

	public void setMesanio(String mesanio) {
		this.mesanio = mesanio;
	}

	public int getMontoregular() {
		return montoregular;
	}

	public void setMontoregular(int montoregular) {
		this.montoregular = montoregular;
	}

	public int getMontoadicionales() {
		return montoadicionales;
	}

	public void setMontoadicionales(int montoadicional) {
		this.montoadicionales = montoadicional;
	}

	public int getId_Cliente() {
		return id_cliente;
	}

	public void setId_Cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	@Override
	public String toString() {
		return "Pago [idpago=" + id_pago + ", mesanio=" + mesanio + ", montoregular=" + montoregular
				+ ", montoadicional=" + montoadicionales + ", clienteid=" + id_cliente + "]";
	}
	
}
