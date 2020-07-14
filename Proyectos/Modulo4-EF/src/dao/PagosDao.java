package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSingleton;
import idao.IPagosDao;
import modelo.Pago;

public class PagosDao implements IPagosDao{

	@Override
	public boolean agregar(Pago pago) {
		Connection con = null;
		Statement stm = null;
		
		boolean agregar = false;
		
		String sql = "Insert into Pagos Values(null,'"+pago.getMesanio()+"', '"+pago.getMontoregular()+"', '"+pago.getMontoadicionales()+"', '"+pago.getClienteid()+"')";
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase PagosDao, método agregar");
			e.printStackTrace();
		}
		return agregar;
	}

	@Override
	public List<Pago> listar() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		//String sql = "select * from pagos ORDER BY id_pago";
       String sql ="SELECT id_pago,mesanio,montoregular,montoadicionales,id_cliente,nombre FROM cliente c, pagos p where p.cliente_id_cliente = c.id_cliente and p.cliente_id_cliente = c.id_cliente";
		List<Pago> listaPago = new ArrayList<Pago>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Pago p = new Pago();
				p.setIdpago(rs.getInt(1));
				p.setMesanio(rs.getString(2));
				p.setMontoregular(rs.getInt(3));
				p.setMontoadicionales(rs.getInt(4));
				p.setClienteid(rs.getInt(5));
				listaPago.add(p);
				
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase PagosDao, método listar ");
			e.printStackTrace();
		}
		
		return listaPago;
	}

	@Override
	public boolean actualizar(Pago pago) {
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE Pagos SET mesanio = '" + pago.getMesanio() + "', montoregular = '"
		+ pago.getMontoregular() + "', montoadicionales = '" + pago.getMontoadicionales() + "', cliente_id_cliente = '" + pago.getClienteid() +"' WHERE id_pago = '" + pago.getIdpago() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase PagosDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public List<Pago> buscar(int idpago) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		//String sql = "select * from pagos ORDER BY id_pago";
       String sql ="SELECT id_pago,mesanio,montoregular,montoadicionales,id_cliente,nombre FROM cliente c, pagos p where p.cliente_id_cliente='"+idpago+"' and p.cliente_id_cliente = c.id_cliente";
		List<Pago> listaPago = new ArrayList<Pago>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Pago p = new Pago();
				p.setIdpago(rs.getInt(1));
				p.setMesanio(rs.getString(2));
				p.setMontoregular(rs.getInt(3));
				p.setMontoadicionales(rs.getInt(4));
				p.setClienteid(rs.getInt(5));
				listaPago.add(p);
				
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase PagosDao, método listar ");
			e.printStackTrace();
		}
		
		return listaPago;
	}


}

	