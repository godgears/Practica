package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import conexion.ConexionSingleton;
import idao.IRClienteDao;
import modelo.Capacitacion;
import modelo.Visita;

public class RClienteDao implements IRClienteDao{

	public List<Visita> listarv(int id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from visitas where cliente_id_cliente= '"+id+"' ORDER BY CLIENTE_ID_CLIENTE";
		
		List<Visita> listavisitas = new ArrayList<Visita>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Visita v = new Visita();
				v.setIdvisita(rs.getInt(1));
				v.setDireccion(rs.getString(2));
				v.setCiudad(rs.getString(3));
				v.setFecha(rs.getString(4));
				v.setResumen(rs.getString(5));
				v.setObservaciones(rs.getString(6));
				v.setClienteid(rs.getInt(7));
				v.setEmpleadoid(rs.getInt(8));
				listavisitas.add(v);
				
			}
			System.out.println(listavisitas.size());
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AccidenteDao, método listar ");
			e.printStackTrace();
		}
		
		return listavisitas;
	}
	
	public List<Capacitacion> listarc(int id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from capacitaciones where VISITAS_ID_VISITA= '"+id+"' ORDER BY id_capacitacion";
		
		List<Capacitacion> listacapaci = new ArrayList<Capacitacion>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Capacitacion c = new Capacitacion();
				c.setIdcapacitacion(rs.getInt(1));
				c.setFecha(rs.getString(2));
				c.setHora(rs.getString(3));
				c.setNumasistentes(rs.getInt(4));
				c.setIdvisita(rs.getInt(5));
				listacapaci.add(c);
			}
			System.out.println(listacapaci.size());
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AccidenteDao, método listar ");
			e.printStackTrace();
		}
		
		return listacapaci;
	}

}
