package com.acc.beans;

public class Pago {

	private int id_pago;
	private String mesanio;
	private int montoregular;
	private int montoadicionales;
	private int cliente_id_cliente;
	
	public Pago() {
		// TODO Auto-generated constructor stub
	}

	public int getId_pago() {
		return id_pago;
	}

	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
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

	public void setMontoadicionales(int montoadicionales) {
		this.montoadicionales = montoadicionales;
	}

	public int getCliente_id_cliente() {
		return cliente_id_cliente;
	}

	public void setCliente_id_cliente(int cliente_id_cliente) {
		this.cliente_id_cliente = cliente_id_cliente;
	}

	public Pago(int id_pago, String mesanio, int montoregular, int montoadicionales, int cliente_id_cliente) {
		super();
		this.id_pago = id_pago;
		this.mesanio = mesanio;
		this.montoregular = montoregular;
		this.montoadicionales = montoadicionales;
		this.cliente_id_cliente = cliente_id_cliente;
	}

	@Override
	public String toString() {
		return "Pago [id_pago=" + id_pago + ", mesanio=" + mesanio + ", montoregular=" + montoregular
				+ ", montoadicionales=" + montoadicionales + ", cliente_id_cliente=" + cliente_id_cliente + "]";
	}
	
	

	
}
