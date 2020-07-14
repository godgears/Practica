package idao;

import java.util.List;

import modelo.Accidente;
//import modelo.Cliente;

public interface IAccidentesDao {

	public boolean registrar (Accidente accidentes);
	public List<Accidente> listar();
}
