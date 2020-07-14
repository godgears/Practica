package com.acc.beans;

public class Capacitacion {

	private int id_capacitacion;
	private String fecha;
	private String hora;
	private int numasistentes;
	private int visitas_idvisita;
	
	
	
	public Capacitacion() {
		// TODO Auto-generated constructor stub
	}

	

	public Capacitacion(int id_capacitacion, String fecha, String hora, int numasistentes, int visitas_idvisita) {
		super();
		this.id_capacitacion = id_capacitacion;
		this.fecha = fecha;
		this.hora = hora;
		this.numasistentes = numasistentes;
		this.visitas_idvisita = visitas_idvisita;
	}



	public int getId_capacitacion() {
		return id_capacitacion;
	}



	public void setId_capacitacion(int id_capacitacion) {
		this.id_capacitacion = id_capacitacion;
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



	public int getNumasistentes() {
		return numasistentes;
	}



	public void setNumasistentes(int numasistentes) {
		this.numasistentes = numasistentes;
	}



	public int getVisitas_idvisita() {
		return visitas_idvisita;
	}



	public void setVisitas_idvisita(int visitas_idvisita) {
		this.visitas_idvisita = visitas_idvisita;
	}



	@Override
	public String toString() {
		return "Capacitacion [id_capacitacion=" + id_capacitacion + ", fecha=" + fecha + ", hora=" + hora
				+ ", numasistentes=" + numasistentes + ", visitas_idvisita=" + visitas_idvisita + "]";
	}
	
	
	
	
}
