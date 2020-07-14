package idao;

import java.util.List;

import modelo.Asesoria;

public interface IAsesoriaDao {
	public boolean agregar (Asesoria asesoria);
	public List<Asesoria> listar();
}
