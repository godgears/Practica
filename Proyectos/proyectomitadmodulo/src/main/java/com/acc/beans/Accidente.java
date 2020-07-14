package com.acc.beans;

public class Accidente {

	private int id_accidente;
	private String fecha;
	private String hora;
	private String suceso;
	private String lugar;
	private int cliente_id_cliente;
	
	
	public Accidente() {
		
	}


	public Accidente(int id_accidente, String fecha, String hora, String suceso, String lugar, int cliente_id_cliente) {
		this.id_accidente = id_accidente;
		this.fecha = fecha;
		this.hora = hora;
		this.suceso = suceso;
		this.lugar = lugar;
		this.cliente_id_cliente = cliente_id_cliente;
	}


	public int getId_accidente() {
		return id_accidente;
	}


	public void setId_accidente(int id_accidente) {
		this.id_accidente = id_accidente;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getSuceso() {
		return suceso;
	}


	public void setSuceso(String suceso) {
		this.suceso = suceso;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public int getCliente_id_cliente() {
		return cliente_id_cliente;
	}


	public void setCliente_id_cliente(int cliente_id_cliente) {
		this.cliente_id_cliente = cliente_id_cliente;
	}


	@Override
	public String toString() {
		return "Accidente [id_accidente=" + id_accidente + ", fecha=" + fecha + ", hora=" + hora + ", suceso=" + suceso
				+ ", lugar=" + lugar + ", cliente_id_cliente=" + cliente_id_cliente + "]";
	}
	
	

	
	
	
	
}
