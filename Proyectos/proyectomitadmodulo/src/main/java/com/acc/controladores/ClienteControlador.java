package com.acc.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

import com.acc.beans.Cliente;
import com.acc.dao.ClienteDao;   

@Controller
public class ClienteControlador {

	@Autowired
	ClienteDao cliedao;
	
	static Logger log = Logger.getLogger(ClienteControlador.class.getName());
	
    @RequestMapping("/CrearCliente")    
    public String showform(Model m){
        m.addAttribute("command", new Cliente());
        log.info("Ingreso a formulario de creación de clientes");
        return "CrearCliente";
    } 

    @RequestMapping(value="/AgregarCliente",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cli") Cliente cli){    
    	cliedao.save(cli);
        log.warn("Cliente creado: " + cli.toString());
        return "redirect:/ListadoClientes";
    }
    
    @RequestMapping("/ListadoClientes")    
    public String viewcli(Model m){    
        List<Cliente> list=cliedao.getClientes();
        m.addAttribute("listaclientes",list);  
        log.info("Listado de clientes");
        return "ListadoClientes";
    }
    
    @RequestMapping(value="/EditarCliente/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Cliente cli=cliedao.getCliById(id);
        m.addAttribute("command",cli);
        log.info("Ingreso a edición de clientes");
        return "EditarCliente";
    }

    @RequestMapping(value="/GuardarEditarCliente",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("cli") Cliente cli){
    	cliedao.update(cli);
        log.warn("Procesando edición de clientes");
        return "redirect:/ListadoClientes";
    }

    @RequestMapping(value="/EliminarCliente/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
    	cliedao.delete(id);
        log.warn("Cliente eliminado");
        return "redirect:/ListadoClientes";
    }

}
