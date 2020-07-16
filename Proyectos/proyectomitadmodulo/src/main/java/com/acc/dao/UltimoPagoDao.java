package com.acc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acc.beans.Pago;

public class UltimoPagoDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public Pago getPagoById(int id) {
		String sql="Select * from  (select pagos.id_pago, pagos.mesanio, pagos.montoregular, pagos.montoadicionales, pagos.cliente_id_cliente from pagos where pagos.cliente_id_cliente =? order by pagos.mesanio desc) where rownum = 1";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Pago>(Pago.class));
	}

}
