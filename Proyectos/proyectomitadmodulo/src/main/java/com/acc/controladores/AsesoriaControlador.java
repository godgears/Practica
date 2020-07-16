package com.acc.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.beans.Asesoria;
import com.acc.dao.AsesoriaDao;

@Controller
public class AsesoriaControlador {
	@Autowired
	AsesoriaDao daoasesoria;

	static Logger log = Logger.getLogger(AsesoriaControlador.class.getName());

	@RequestMapping("/AgregarAsesoria")    
    public String showform(Model m){
        m.addAttribute("command", new Asesoria());
        log.info("Ingreso a formulario de creación de Asesorias");
        return "AgregarAsesoria";
    } 

    @RequestMapping(value="/Guardarasesoria",method = RequestMethod.POST)    
    public String save(@ModelAttribute("asesoria") Asesoria asesoria){
    	daoasesoria.save(asesoria);
        log.info("Asesoria creada: " + asesoria.toString());
        return "redirect:/AgregarAsesoria";
    }
    
    @RequestMapping("/ListadoAsesoria")    
    public String verasesoria(Model m){    
        List<Asesoria> list=daoasesoria.getAsesorias();
        m.addAttribute("list",list);  
        log.error("Listado de Asesorias");
        return "ListadoAsesoria";
    }
    
}
