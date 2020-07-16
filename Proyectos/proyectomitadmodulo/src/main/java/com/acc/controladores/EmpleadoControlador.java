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

import com.acc.beans.Empleado;
import com.acc.dao.EmpleadoDao;

@Controller
public class EmpleadoControlador {

	@Autowired
	EmpleadoDao empdao;
	static Logger log = Logger.getLogger(EmpleadoControlador.class.getName());
	
    @RequestMapping("/ListadoEmpleados")    
    public String viewemp(Model m){
        List<Empleado> list=empdao.getEmpleados();
        m.addAttribute("listaempleados",list);  
        return "ListadoEmpleados";
    }
    
    @RequestMapping("/CrearEmpleado")    
    public String showform(Model m){
        m.addAttribute("command", new Empleado());
        log.info("Ingreso a formulario de creación de Empleado");
        return "CrearEmpleado";
    } 

    @RequestMapping(value="/AgregarEmpleado",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cli") Empleado emp){    
    	empdao.GuardarEmpleado(emp);
        log.warn("Empleado creado: " + emp.toString());
        return "redirect:/ListadoEmpleados";
    }
    
    @RequestMapping(value="/EditarEmpleado/{id}")    
    public String edit(@PathVariable int id, Model m){    
    	Empleado emp=empdao.getEmpById(id);
        m.addAttribute("command",emp);
        log.info("Ingreso a edición de Empleado");
        return "EditarEmpleado";
    }

    @RequestMapping(value="/GuardarEditarEmpleado",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("emp") Empleado emp){
    	empdao.ActualizarEmpleado(emp);
        log.warn("Procesando edición de Empleado");
        return "redirect:/ListadoEmpleados";
    }

    @RequestMapping(value="/EliminarEmpleado/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
    	empdao.eliminarEmpleado(id);
        log.warn("Empleado eliminado");
        return "redirect:/ListadoEmpleados";
    }
	
	
}
