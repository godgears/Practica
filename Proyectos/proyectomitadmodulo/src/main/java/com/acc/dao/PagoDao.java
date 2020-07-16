package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.Pago;


public class PagoDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Pago p){    
	    String sql="insert into Pagos (mesanio,montoregular,montoadicionales,cliente_id_cliente) "
	    		+ "values('"+p.getMesanio()+"','"+p.getMontoregular()+"','"+p.getMontoadicionales()+"','"+p.getCliente_id_cliente()+"')";
	    return template.update(sql);
	}
	
	public List<Pago> getPagos(){    
	    return template.query("select * from Pagos",new RowMapper<Pago>(){    
	        public Pago mapRow(ResultSet rs, int row) throws SQLException {    
	        	Pago p=new Pago();    
	        	p.setId_pago(rs.getInt(1));
				p.setMesanio(rs.getString(2));
				p.setMontoregular(rs.getInt(3));
				p.setMontoadicionales(rs.getInt(4));
				p.setCliente_id_cliente(rs.getInt(5));
	            return p;
	        }    
	    });    
	}
	
	
	
	public List<Pago> getPago(int idpago){    
	    return template.query("SELECT id_pago,mesanio,montoregular,montoadicionales,id_cliente,nombre FROM cliente c, pagos p where p.cliente_id_cliente='"+idpago+"' and p.cliente_id_cliente = c.id_cliente",new RowMapper<Pago>(){    
	        public Pago mapRow(ResultSet rs, int row) throws SQLException {    
	        	Pago p=new Pago();    
	        	p.setId_pago(rs.getInt(1));
				p.setMesanio(rs.getString(2));
				p.setMontoregular(rs.getInt(3));
				p.setMontoadicionales(rs.getInt(4));
				p.setCliente_id_cliente(rs.getInt(5));
	            return p;
	        }    
	    });    
	}
	
	
}
