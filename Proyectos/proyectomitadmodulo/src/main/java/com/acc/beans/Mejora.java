package com.acc.beans;

public class Mejora {

	private int id_mejora;
	private String fecha;
	private String motivo;
	private String actividades;
	private String estado;
	private int cliente_idcliente;
	
	
	public Mejora() {

	}


	public Mejora(int id_mejora, String fecha, String motivo, String actividades, String estado,
			int cliente_idcliente) {
		super();
		this.id_mejora = id_mejora;
		this.fecha = fecha;
		this.motivo = motivo;
		this.actividades = actividades;
		this.estado = estado;
		this.cliente_idcliente = cliente_idcliente;
	}


	public int getId_mejora() {
		return id_mejora;
	}


	public void setId_mejora(int id_mejora) {
		this.id_mejora = id_mejora;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getActividades() {
		return actividades;
	}


	public void setActividades(String actividades) {
		this.actividades = actividades;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getCliente_idcliente() {
		return cliente_idcliente;
	}


	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}


	@Override
	public String toString() {
		return "Mejora [id_mejora=" + id_mejora + ", fecha=" + fecha + ", motivo=" + motivo + ", actividades="
				+ actividades + ", estado=" + estado + ", cliente_idcliente=" + cliente_idcliente + "]";
	}
	
	
}
