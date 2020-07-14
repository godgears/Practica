package modelo;

public class RCliente {
	
	private int idvisita;
	private String direccion;
	private String ciudad;
	private String fechavi;
	private String resumen;
	private String observaciones;
	private int clienteid;
	private int empleadoid;
	private int idcapacitacion;
	private String fechaca;
	private String hora;
	private int numasistentes;
	private int visitaid;
	
	
	
	public RCliente() {
		// TODO Auto-generated constructor stub
	}

	public RCliente(int idvisita, String direccion, String ciudad, String fechavi, String resumen, String observaciones,
			int clienteid, int empleadoid, int idcapacitacion, String fechaca, String hora, int numasistentes,
			int visitaid) {
		super();
		this.idvisita = idvisita;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.fechavi = fechavi;
		this.resumen = resumen;
		this.observaciones = observaciones;
		this.clienteid = clienteid;
		this.empleadoid = empleadoid;
		this.idcapacitacion = idcapacitacion;
		this.fechaca = fechaca;
		this.hora = hora;
		this.numasistentes = numasistentes;
		this.visitaid = visitaid;
	}

	public int getIdvisita() {
		return idvisita;
	}



	public void setIdvisita(int idvisita) {
		this.idvisita = idvisita;
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



	public String getFechavi() {
		return fechavi;
	}



	public void setFechavi(String fechavi) {
		this.fechavi = fechavi;
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



	public int getClienteid() {
		return clienteid;
	}



	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}



	public int getEmpleadoid() {
		return empleadoid;
	}



	public void setEmpleadoid(int empleadoid) {
		this.empleadoid = empleadoid;
	}



	public int getIdcapacitacion() {
		return idcapacitacion;
	}



	public void setIdcapacitacion(int idcapacitacion) {
		this.idcapacitacion = idcapacitacion;
	}



	public String getFechaca() {
		return fechaca;
	}



	public void setFechaca(String fechaca) {
		this.fechaca = fechaca;
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



	public int getVisitaid() {
		return visitaid;
	}



	public void setVisitaid(int visitaid) {
		this.visitaid = visitaid;
	}




	@Override
	public String toString() {
		return "RCliente [idvisita=" + idvisita + ", direccion=" + direccion + ", ciudad=" + ciudad + ", fechavi="
				+ fechavi + ", resumen=" + resumen + ", observaciones=" + observaciones + ", clienteid=" + clienteid
				+ ", empleadoid=" + empleadoid + ", idcapacitacion=" + idcapacitacion + ", fechaca=" + fechaca
				+ ", hora=" + hora + ", numasistentes=" + numasistentes + ", visitaid=" + visitaid + "]";
	}
	
	
	

}
