package idao;

import java.util.List;

import modelo.Pago;

public interface IPagosDao {
	public boolean agregar(Pago pago);
	public List<Pago> listar();
	public boolean actualizar(Pago pago);
	public List<Pago> buscar(int idpago);
}
