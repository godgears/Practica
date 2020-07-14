package com.acc.beans;

public class Visita {

	private int id_visita;
	private String direccion;
	private String ciudad;
	private String fecha;
	private String resumen;
	private String observaciones;
	private int cliente_id_cliente;
	private int empleado_id_empleado;
	
	public Visita() {
		// TODO Auto-generated constructor stub
	}
	
	public Visita(String direccion, String ciudad, String fecha, String resumen, String observaciones, int cliente_id_cliente,
			int empleado_id_empleado) {
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.resumen = resumen;
		this.observaciones = observaciones;
		this.cliente_id_cliente = cliente_id_cliente;
		this.empleado_id_empleado = empleado_id_empleado;
	}

	public int getId_visita() {
		return id_visita;
	}

	public void setId_visita(int id_visita) {
		this.id_visita = id_visita;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getCliente_id_cliente() {
		return cliente_id_cliente;
	}

	public void setCliente_id_cliente(int cliente_id_cliente) {
		this.cliente_id_cliente = cliente_id_cliente;
	}

	public int getEmpleado_id_empleado() {
		return empleado_id_empleado;
	}

	public void setEmpleado_id_empleado(int empleado_id_empleado) {
		this.empleado_id_empleado = empleado_id_empleado;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Visita [id_visita=" + id_visita + ", direccion=" + direccion + ", ciudad=" + ciudad + ", fecha=" + fecha
				+ ", resumen=" + resumen + ", observaciones=" + observaciones + ", cliente_id_cliente=" + cliente_id_cliente
				+ ", empleado_id_empleado=" + empleado_id_empleado + "]";
	}
	
}
