package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import conexion.ConexionSingleton;
import idao.IEmpleadoDao;
import modelo.Empleado;

public class EmpleadoDao implements IEmpleadoDao{

	@Override
	public boolean agregar(Empleado empleado) {
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO empleado VALUES (null,'" + empleado.getNombreempleado() + "','" + empleado.getEspecialidad()+"')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método agregar");
			e.printStackTrace();
		}
		
		return agregar;
	}

	@Override
	public List<Empleado> listar() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from empleado ORDER BY id_empleado";
		
		List<Empleado> listaEmpleado = new ArrayList<Empleado>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Empleado e = new Empleado();
				e.setIdempleado(rs.getInt(1));
				e.setNombreempleado(rs.getString(2));
				e.setEspecialidad(rs.getString(3));
				listaEmpleado.add(e);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método listar ");
			e.printStackTrace();
		}
		
		return listaEmpleado;
	}

	@Override
	public boolean actualizar(Empleado empleado) {
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE empleado SET nombre = '" + empleado.getNombreempleado() + "', especialidad = '" + empleado.getEspecialidad() +"'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(Empleado empleado) {
		
		
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM empleado WHERE id_empleado = " + empleado.getIdempleado();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Empleado buscar(int empleadoid) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from empleado WHERE id_empleado= '" + empleadoid + "'";
		
		Empleado emple = new Empleado();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				emple.setIdempleado(rs.getInt(1));
				emple.setNombreempleado(rs.getString(2));
				emple.setEspecialidad(rs.getString(3));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método buscar ");
			e.printStackTrace();
		}
		
		return emple;
	}
	
	
	
	
	

}
