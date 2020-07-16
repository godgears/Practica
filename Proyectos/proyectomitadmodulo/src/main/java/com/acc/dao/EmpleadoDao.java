package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.Empleado;

public class EmpleadoDao {


	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int GuardarEmpleado(Empleado e){    
	    String sql="insert into Empleado (nombre,especialidad) values('"+e.getNombre()+"','"+e.getEspecialidad()+"')";
	    return template.update(sql);
	}
	
	public int ActualizarEmpleado(Empleado e){    
		String sql="update Empleado set nombre='"+e.getNombre()+"', especialidad='"+e.getEspecialidad()+"' where id_empleado="+e.getId_empleado()+"";
		return template.update(sql);    
	}   
	
	public int eliminarEmpleado(int id){    
	    String sql="delete from Empleado where id_empleado="+id+"";
	    return template.update(sql);
	}    

	public Empleado getEmpById(int id){    
	    String sql="select * from Empleado where id_empleado=?";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Empleado>(Empleado.class));    
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
