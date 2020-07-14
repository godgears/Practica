package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSingleton;
import idao.IAccidentesDao;
import modelo.Accidente;
//import modelo.Cliente;


public class AccidenteDao implements IAccidentesDao{

	public boolean registrar(Accidente accidentes) {
		// TODO Auto-generated method stub
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO accidentes VALUES (null,'" + accidentes.getFecha() + "','" + accidentes.getHora() +"'"
				+ ",'" + accidentes.getSuceso() +"','" + accidentes.getLugar() +"','" + accidentes.getClienteid()+"')";
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase AccidentesDao, método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}
	
	public List<Accidente> listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select id_accidente, fecha, hora, suceso, lugar, cliente_id_cliente from Accidentes ORDER BY id_accidente desc";
		
		List<Accidente> listaAccidente = new ArrayList<Accidente>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Accidente c = new Accidente();
				c.setIdaccidente(rs.getInt(1));
				c.setFecha(rs.getString(2));
				c.setHora(rs.getString(3));
				c.setSuceso(rs.getString(4));
				c.setLugar(rs.getString(5));
				c.setClienteid(rs.getInt(6));
				listaAccidente.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AccidenteDao, método listar ");
			e.printStackTrace();
		}
		
		return listaAccidente;
	}
}

