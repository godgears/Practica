package com.acc.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.acc.beans.Visita;
import com.acc.beans.Capacitacion;
import com.acc.dao.ReporteDao;

@Controller
public class ReporteControlador {
	
	@Autowired
	ReporteDao repodao;
	
	static Logger log = Logger.getLogger(ReporteControlador.class.getName());
	
    @RequestMapping("/ListaReporteGeneral") 
    public String listarVisitasyCapacitaciones(Model m){
        List<Visita> list=repodao.ListadoVisitasClientes();
        List<Capacitacion> list2=repodao.ListadoCapacitacionesClientes();
        m.addAttribute("listareportev",list);
        m.addAttribute("listareportec",list2);
        log.info("Listado de Capacitaciones");
        log.info("Listado de Visitas");
        return "MostrarReporteG";
    }
    
    
    @RequestMapping(value="/ListadoReporteCliente/{id}", method = RequestMethod.GET) 
    public String listarVisitasyCapacitacionesCliente(@PathVariable int id, Model m){
    	List<Visita> list=repodao.ListadoVisitasCliente(id);
        m.addAttribute("listareportev",list);
        log.info("Listado de Capacitaciones");
        log.info("Listado de Visitas");
        return "ListaReporteCliente";
    }
    
    
    @RequestMapping(value="/ListadoReporteCliente/{idc}/{idv}", method = RequestMethod.POST) 
    public String listarVisitasyCapacitacionesClienteCapa(@PathVariable(value="idc")int idc,@PathVariable(value="idv")int idv,Model m){
    	List<Visita> list=repodao.ListadoVisitasCliente(idc);
        List<Capacitacion> list2=repodao.ListadoCapacitacionesCliente(idv);
        m.addAttribute("listareportev",list);
        m.addAttribute("listareportec",list2);
        log.info("Listado de Capacitaciones");
        log.info("Listado de Visitas");
        return "ListaReporteCliente";
    }
    	
}