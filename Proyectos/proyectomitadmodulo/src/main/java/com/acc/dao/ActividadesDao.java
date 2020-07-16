package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.Visita;

public class ActividadesDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Visita> getActividades(int id){    
	    return template.query("select * from Visitas",new RowMapper<Visita>(){    
	        public Visita mapRow(ResultSet rs, int row) throws SQLException {    
	        	Visita act = new Visita();
				act.setId_visita(rs.getInt(1));
				act.setDireccion(rs.getString(2));
				act.setCiudad(rs.getString(3));
				act.setFecha(rs.getString(4));		
				act.setResumen(rs.getString(5));
				act.setObservaciones(rs.getString(6));
				act.setCliente_id_cliente(rs.getInt(7));
				act.setEmpleado_id_empleado(rs.getInt(8));

	            return act;
	        }    
	    });    
	}
}
