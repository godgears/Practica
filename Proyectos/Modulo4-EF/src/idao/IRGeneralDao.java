package idao;

import java.util.List;

import modelo.Capacitacion;
import modelo.Visita;

public interface IRGeneralDao {
	
	public List<Visita> listarv();
	public List<Capacitacion> listarc();
}
