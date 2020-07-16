package com.acc.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.acc.beans.Tasa;
import com.acc.dao.TasaDao;

@Controller
public class TasaControlador {
	@Autowired
	TasaDao tasadao;
	static Logger log = Logger.getLogger(TasaControlador.class.getName());

@RequestMapping("/MostrarTasa")    
public String viewacc(Model m){    
    List<Tasa> list=tasadao.listar();
    m.addAttribute("listatasa",list);  
    log.info("Listado de Accidentes");
    return "Tasa";
}
}