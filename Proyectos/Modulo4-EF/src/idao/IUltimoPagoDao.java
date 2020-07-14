package idao;

import modelo.Pago;

public interface IUltimoPagoDao {
	public Pago buscar(int clienteid);
}
