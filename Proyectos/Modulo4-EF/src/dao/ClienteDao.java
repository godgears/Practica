package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSingleton;
import idao.IClienteDao;
import modelo.Cliente;

public class ClienteDao implements IClienteDao {

	@Override
	public boolean agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO Cliente VALUES (null,'" + cliente.getNombre() + "','" + cliente.getTelefono() 
		+ "','" + cliente.getCorreoelectronico() + "','" + cliente.getRubro() + "','"+ cliente.getDireccion()
		+ "','"+ cliente.getCantidadtrabajadores() +"')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ClienteDao, método agregar");
			e.printStackTrace();
		}
		
		return agregar;
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Cliente ORDER BY id_cliente";
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setTelefono(rs.getInt(3));
				c.setCorreoelectronico(rs.getString(4));
				c.setRubro(rs.getString(5));
				c.setDireccion(rs.getString(6));
				c.setCantidadtrabajadores(rs.getInt(7));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase ClienteDao, método listar ");
			e.printStackTrace();
		}
		
		return listaCliente;
	}

	@Override
	public boolean actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE Cliente SET nombre = '" + cliente.getNombre() + "', telefono = '" + cliente.getTelefono() + "', correoelectronico = '" + cliente.getCorreoelectronico() + "', rubro = '" + cliente.getRubro() + "', direccion = '" + cliente.getDireccion() + "', cantidadtrabajadores = '" + cliente.getCantidadtrabajadores() + "' WHERE id_cliente = '" + cliente.getIdCliente() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ClienteDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM Cliente WHERE id_cliente = " + cliente.getIdCliente();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ClienteDao, método eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Cliente buscar(int clienteid) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Cliente WHERE id_cliente = '" + clienteid + "'";
		
		Cliente cli = new Cliente();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				cli.setId(rs.getInt(1));
				cli.setNombre(rs.getString(2));
				cli.setTelefono(rs.getInt(3));
				cli.setCorreoelectronico(rs.getString(4));
				cli.setRubro(rs.getString(5));
				cli.setDireccion(rs.getString(6));
				cli.setCantidadtrabajadores(rs.getInt(7));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase ClienteDao, método buscar ");
			e.printStackTrace();
		}
		
		return cli;
	}

}
