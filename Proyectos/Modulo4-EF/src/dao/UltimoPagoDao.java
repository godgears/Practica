package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.ConexionSingleton;
import idao.IUltimoPagoDao;

import modelo.Pago;

public class UltimoPagoDao implements IUltimoPagoDao {

	
	public Pago buscar(int clienteid) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "Select * from  (select pagos.id_pago, pagos.mesanio, pagos.montoregular, pagos.montoadicionales, pagos.cliente_id_cliente from pagos where pagos.cliente_id_cliente = '"+ clienteid +"' order by pagos.mesanio desc) where rownum = 1";
		
		Pago pago = new Pago();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				pago.setIdpago(rs.getInt(1));
				pago.setMesanio(rs.getString(2));
				pago.setMontoregular(rs.getInt(3));
				pago.setMontoadicionales(rs.getInt(4));
				pago.setClienteid(rs.getInt(5));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase UltimoPagoDao, método buscar ");
			e.printStackTrace();
		}
		
		return pago;
	}

}
