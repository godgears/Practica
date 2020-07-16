package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.Tasa;


/**
 * @author Alumno
 *
 */
public class TasaDao{
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public List<Tasa> listar(){    
		  return template.query("select cliente_id_cliente, count(id_accidente) as cantAcc, cantidadtrabajadores, (count(id_accidente)/cantidadtrabajadores)*100 as tasa " + 
					"from accidentes a , cliente c " + 
					"where a.cliente_id_cliente=c.id_cliente " + 
					"group by c.id_cliente, a.cliente_id_cliente, c.cantidadtrabajadores",new RowMapper<Tasa>(){    
		        public Tasa mapRow(ResultSet rs, int row) throws SQLException {        
		        	Tasa t = new Tasa();
					t.setCliente_idcliente(rs.getInt(1));
					t.setNumaccidentes(rs.getInt(2));
					t.setNumtrabajadores(rs.getInt(3));
					t.setTasaacc(rs.getFloat(4));
		            return t;
		        }    
		    });
	} 
}





