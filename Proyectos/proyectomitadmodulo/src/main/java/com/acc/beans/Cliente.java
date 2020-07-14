package com.acc.beans;

public class Cliente {

	private int id_cliente;
	private String nombre;
	private int telefono;
	private String correoelectronico;
	private String rubro;
	private String direccion;
	private int cantidadtrabajadores;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, int telefono, String correoelectronico, String rubro, String direccion, int cantidadtrabajadores) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
		this.direccion = direccion;
		this.cantidadtrabajadores=cantidadtrabajadores;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadtrabajadores() {
		return cantidadtrabajadores;
	}

	public void setCantidadtrabajadores(int cantidadtrabajadores) {
		this.cantidadtrabajadores = cantidadtrabajadores;
	}

}

	
	