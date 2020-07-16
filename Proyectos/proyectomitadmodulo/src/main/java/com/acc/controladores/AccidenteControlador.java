package com.acc.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.beans.Accidente;
import com.acc.dao.AccidenteDao;

@Controller
public class AccidenteControlador {

	@Autowired
	AccidenteDao accdao;
	static Logger log = Logger.getLogger(AccidenteControlador.class.getName());
	
	   @RequestMapping("/FormularioAccidente")    
	    public String showform(Model m){
	        m.addAttribute("command", new Accidente());
	        log.info("Ingreso a formulario de creación de accidentes");
	        return "FormularioAccidente";
	    } 
	   
	 @RequestMapping(value="/ProcesarAccidente",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("a") Accidente a){    
	        accdao.save(a);
	        log.info("Accidente agregado: " + a.toString());
	        return "redirect:/MostrarAccidente";
	    }
	
	  @RequestMapping("/MostrarAccidente")    
	    public String viewacc(Model m){    
	        List<Accidente> list=accdao.getAccidentes();
	        m.addAttribute("listadoaccidente",list);  
	        log.info("Listado de Accidentes");
	        return "MostrarAccidente";
	    }
	    
	
}
