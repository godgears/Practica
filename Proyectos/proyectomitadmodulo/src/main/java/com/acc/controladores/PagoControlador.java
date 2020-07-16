package com.acc.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.acc.beans.Pago;
import com.acc.dao.PagoDao;

@Controller
public class PagoControlador {

    @Autowired
    PagoDao daopao;

    static Logger log = Logger.getLogger(PagoControlador.class.getName());

    @RequestMapping("/AgregarPago")    
    public String showform(Model m){
        m.addAttribute("command", new Pago());
        log.info("Ingreso a formulario de creación de pagos");
        return "AgregarPago";
    } 

    @RequestMapping(value="/savepago",method = RequestMethod.POST)    
    public String save(@ModelAttribute("pago") Pago pago){
        daopao.save(pago);
        log.info("Pago creado: " + pago.toString());
        return "redirect:/ListadoPago";
    }
    
    @RequestMapping("/ListadoPago")    
    public String verpago(Model m){    
        List<Pago> list=daopao.getPagos();
        m.addAttribute("list",list);  
        log.error("Listado de Pagos");
        return "ListadoPago";
    }
    
    @RequestMapping("/ListadoPagoCliente/{id}")    
    public String verpago(@PathVariable int id, Model m){    
        List<Pago> list=daopao.getPago(id);
        m.addAttribute("list",list);  
        log.error("Listado de Pagos");
        return "ListadoPago";
    }

    
}
