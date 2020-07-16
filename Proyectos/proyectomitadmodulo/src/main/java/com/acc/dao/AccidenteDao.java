package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.Accidente;


public class AccidenteDao {

JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Accidente a){    
		String sql = "INSERT INTO accidentes VALUES (null,'" + a.getFecha() + "','" + a.getHora() +"'"
				+ ",'" + a.getSuceso() +"','" + a.getLugar() +"','" + a.getCliente_id_cliente() +"')";
	    return template.update(sql);
	}
	
	public List<Accidente> getAccidentes(){    
	    return template.query("select * from Accidentes",new RowMapper<Accidente>(){    
	        public Accidente mapRow(ResultSet rs, int row) throws SQLException {    
	        	Accidente a=new Accidente();    
	        	a.setId_accidente(rs.getInt(1));
				a.setFecha(rs.getString(2));
				a.setHora(rs.getString(3));
				a.setSuceso(rs.getString(4));
				a.setLugar(rs.getString(5));
				a.setCliente_id_cliente(rs.getInt(6));
	            return a;
	        }    
	    });    
	}   
}
