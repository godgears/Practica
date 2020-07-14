package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSingleton;
import idao.IActividadesDao;
//import modelo.Cliente;
import modelo.Visita;

public class ActividadesDao implements IActividadesDao {

	
	public List<Visita> listarA(int idcliente) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Visitas where cliente_id_cliente='" + idcliente + "' ORDER BY id_visita";
		
		List<Visita> listaActividad= new ArrayList<Visita>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Visita act = new Visita();
				act.setIdvisita(rs.getInt(1));
				act.setDireccion(rs.getString(2));
				act.setCiudad(rs.getString(3));
				act.setFecha(rs.getString(4));		
				act.setResumen(rs.getString(5));
				act.setObservaciones(rs.getString(6));
				act.setClienteid(rs.getInt(7));
				act.setEmpleadoid(rs.getInt(8));
				listaActividad.add(act);				
			}
			stm.close();
			rs.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase ActividadesDao, método listar ");
			e.printStackTrace();
		}
		
		return listaActividad;
	}
}


