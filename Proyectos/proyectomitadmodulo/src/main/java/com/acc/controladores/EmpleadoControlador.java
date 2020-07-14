package com.acc.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acc.beans.Empleado;
import com.acc.dao.EmpleadoDao;

@Controller
public class EmpleadoControlador {

	@Autowired
	EmpleadoDao daoemp;
	
    @RequestMapping("/viewemp")    
    public String viewemp(Model m){
        List<Empleado> list=daoemp.getEmpleados();
        m.addAttribute("list",list);  
        return "viewemp";
    }	
	
	
}
