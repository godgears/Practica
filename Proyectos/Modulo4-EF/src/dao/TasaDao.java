package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSingleton;


import idao.ITasaDao;
//import modelo.Accidente;
import modelo.Tasa;

public class TasaDao implements ITasaDao {

	
	public List<Tasa> listar() {
	Statement stm = null;
	Connection con = null;
	ResultSet rs = null;
	
	String sql = "select cliente_id_cliente, count(id_accidente) as cantAcc, cantidadtrabajadores, (count(id_accidente)/cantidadtrabajadores)*100 as tasa " + 
			"from accidentes a , cliente c " + 
			"where a.cliente_id_cliente=c.id_cliente " + 
			"group by c.id_cliente, a.cliente_id_cliente, c.cantidadtrabajadores";
	
//select cliente_idcliente, count (*) as Numaccidentes from accidentes groupby cliente_idcliente
	
	List<Tasa> listaTasa = new ArrayList<Tasa>();
	
	try {
		con = ConexionSingleton.getConnection();
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
		
		
		while (rs.next()) {
			Tasa t = new Tasa();
			t.setCliente_idcliente(rs.getInt(1));
			t.setNumaccidentes(rs.getInt(2));
			t.setNumtrabajadores(rs.getInt(3));
			t.setTasaacc(rs.getFloat(4));
			listaTasa.add(t);
		}
		stm.close();
		rs.close();
			
	} catch(SQLException e) {
			System.out.println("Error: Clase ClienteDao, método agregar");
			e.printStackTrace();
		
}
	return listaTasa;
	}
}
	


