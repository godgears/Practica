package idao;

import java.util.List;

import modelo.Capacitacion;
import modelo.Visita;

public interface IRClienteDao {
	
	public List<Visita> listarv(int id);
	public List<Capacitacion> listarc(int id);

}
