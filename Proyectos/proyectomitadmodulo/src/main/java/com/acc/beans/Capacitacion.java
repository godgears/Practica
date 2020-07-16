package com.acc.beans;

public class Capacitacion {

	private int id_capacitacion;
	private String fecha;
	private String hora;
	private int numasistentes;
	private int visitas_id_visita;
	
	
	
	public Capacitacion() {
		// TODO Auto-generated constructor stub
	}

	

	public Capacitacion(int id_capacitacion, String fecha, String hora, int numasistentes, int visitas_id_visita) {
		super();
		this.id_capacitacion = id_capacitacion;
		this.fecha = fecha;
		this.hora = hora;
		this.numasistentes = numasistentes;
		this.visitas_id_visita = visitas_id_visita;
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

	public int getVisitas_id_visita() {
		return visitas_id_visita;
	}



	public void setVisitas_id_visita(int visitas_id_visita) {
		this.visitas_id_visita = visitas_id_visita;
	}



	@Override
	public String toString() {
		return "Capacitacion [id_capacitacion=" + id_capacitacion + ", fecha=" + fecha + ", hora=" + hora
				+ ", numasistentes=" + numasistentes + ", visitas_id_visita=" + visitas_id_visita + "]";
	}
	
	
	
	
}
