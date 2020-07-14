package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.Empleado;

public class EmpleadoDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}

	public List<Empleado> getEmpleados(){    
	    return template.query("select * from Empleado",new RowMapper<Empleado>(){    
	        public Empleado mapRow(ResultSet rs, int row) throws SQLException {    
	            Empleado e=new Empleado();    
	            e.setId_empleado(rs.getInt(1));    
	            e.setNombre(rs.getString(2));    
	            e.setEspecialidad(rs.getString(3));
	            return e;
	        }    
	    });    
	}    	
	
	
	
}
