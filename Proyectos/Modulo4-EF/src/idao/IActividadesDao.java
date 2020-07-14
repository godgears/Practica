package idao;

import java.util.List;

import modelo.Visita;

public interface IActividadesDao {

	public List<Visita> listarA(int idcliente);
	
}