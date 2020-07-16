package com.acc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.Capacitacion;
import com.acc.beans.Visita;

public class ReporteDao{
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public List<Visita> ListadoVisitasCliente(int id) {
		 return template.query("select * from visitas where cliente_id_cliente= '"+id+"' ORDER BY CLIENTE_ID_CLIENTE",new RowMapper<Visita>(){    
		        public Visita mapRow(ResultSet rs, int row) throws SQLException {    
		        	Visita v=new Visita();    
		        	v.setId_visita(rs.getInt(1));
					v.setDireccion(rs.getString(2));
					v.setCiudad(rs.getString(3));
					v.setFecha(rs.getString(4));
					v.setResumen(rs.getString(5));
					v.setObservaciones(rs.getString(6));
					v.setCliente_id_cliente(rs.getInt(7));
					v.setEmpleado_id_empleado(rs.getInt(8));
		            return v;
		        }    
		    });  
	}
	

	public List<Capacitacion> ListadoCapacitacionesCliente(int id) {
		 return template.query("select * from capacitaciones where VISITAS_ID_VISITA= '"+id+"' ORDER BY id_capacitacion",new RowMapper<Capacitacion>(){    
		        public Capacitacion mapRow(ResultSet rs, int row) throws SQLException {    
		        	Capacitacion c=new Capacitacion();    
		        	c.setId_capacitacion(rs.getInt(1));
					c.setFecha(rs.getString(2));
					c.setHora(rs.getString(3));
					c.setNumasistentes(rs.getInt(4));
					c.setVisitas_id_visita(rs.getInt(5));
		            return c;
		        }    
		    });  
	}
	
	
	public List<Visita> ListadoVisitasClientes() {
		 return template.query("select * from visitas ORDER BY id_visita",new RowMapper<Visita>(){    
		        public Visita mapRow(ResultSet rs, int row) throws SQLException {    
		        	Visita v=new Visita();    
		         	v.setId_visita(rs.getInt(1));
					v.setDireccion(rs.getString(2));
					v.setCiudad(rs.getString(3));
					v.setFecha(rs.getString(4));
					v.setResumen(rs.getString(5));
					v.setObservaciones(rs.getString(6));
					v.setCliente_id_cliente(rs.getInt(7));
					v.setEmpleado_id_empleado(rs.getInt(8));
		            return v;
		        }    
		    }); 
	}
	

	public List<Capacitacion> ListadoCapacitacionesClientes() {
		 return template.query("select * from capacitaciones ORDER BY id_capacitacion",new RowMapper<Capacitacion>(){    
		        public Capacitacion mapRow(ResultSet rs, int row) throws SQLException {    
		        	Capacitacion c = new Capacitacion();
		        	c.setId_capacitacion(rs.getInt(1));
					c.setFecha(rs.getString(2));
					c.setHora(rs.getString(3));
					c.setNumasistentes(rs.getInt(4));
					c.setVisitas_id_visita(rs.getInt(5));;
					return c;
		        }    
		    }); 
	}
	

}
