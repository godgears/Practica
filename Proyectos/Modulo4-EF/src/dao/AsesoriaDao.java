package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSingleton;
import idao.IAsesoriaDao;
import modelo.Asesoria;

public class AsesoriaDao implements IAsesoriaDao{

	@Override
	public boolean agregar(Asesoria asesoria) {
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO ASESORIAS VALUES (null,'" + asesoria.getDetalle() + "','" + asesoria.getGestion() 
		+ "','" + asesoria.getPropuestas() + "','" + asesoria.getFecha() + "','"+ asesoria.getEspecial()+ 
		"','"+ asesoria.getVisitaid()+"')";
		
	
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase AsesoriaDao, método agregar");
			//e.printStackTrace();
		}
		
		return agregar;
	}
	@Override
	public List<Asesoria> listar() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from ASESORIAS ORDER BY id_asesoria";
		
		List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Asesoria a = new Asesoria();
				a.setIdasesoria(rs.getInt(1));
				a.setDetalle(rs.getString(2));
				a.setGestion(rs.getString(3));
				a.setPropuestas(rs.getString(4));
				a.setFecha(rs.getString(5));
				a.setEspecial(rs.getString(6));
				a.setVisitaid(rs.getInt(7));
				listaAsesoria.add(a);
			}
			stm.close();
			rs.close();
			System.out.println(listaAsesoria.size());
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AsesoriaDao, método listar ");
			e.printStackTrace();
		}
		
		return listaAsesoria;
	}

}
