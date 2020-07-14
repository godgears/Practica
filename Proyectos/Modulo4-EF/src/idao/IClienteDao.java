package idao;

import java.util.List;

import modelo.Cliente;

public interface IClienteDao {

	public boolean agregar(Cliente cliente);
	public List<Cliente> listar();
	public boolean actualizar(Cliente cliente);
	public boolean eliminar (Cliente cliente);
	public Cliente buscar(int clienteid);
}
