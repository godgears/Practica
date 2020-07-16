package com.acc.controladores;

import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.beans.Visita;
import com.acc.dao.ActividadesDao;

@Controller
public class ActividadControlador {

	@Autowired
	ActividadesDao actdao;
	static Logger log = Logger.getLogger(ActividadControlador.class.getName());
	
	@RequestMapping(value="/VerActividades/{id}",method = RequestMethod.GET)
	public String viewact(@PathVariable int id, Model m) {
//	public String viewact(Model m){
//		Visita visita =dao.get(id);
//        m.addAttribute("command",cli);
        List<Visita> list=actdao.getActividades(id);
        m.addAttribute("listadovisitas",list);  
        log.info("Listado de Actividades");
        return "VerActividades";
    }
	
}
