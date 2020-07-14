package modelo;

public class Pago {

	private int idpago;
	private String mesanio;
	private int montoregular;
	private int montoadicionales;
	private int clienteid;
	
	public Pago() {
		// TODO Auto-generated constructor stub
	}
	
	public Pago(String mesanio, int montoregular, int montoadicional, int clienteid) {
		this.mesanio = mesanio;
		this.montoregular = montoregular;
		this.montoadicionales = montoadicional;
		this.clienteid = clienteid;
	}


	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
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

	public int getClienteid() {
		return clienteid;
	}

	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}

	@Override
	public String toString() {
		return "Pago [idpago=" + idpago + ", mesanio=" + mesanio + ", montoregular=" + montoregular
				+ ", montoadicional=" + montoadicionales + ", clienteid=" + clienteid + "]";
	}
	
}
