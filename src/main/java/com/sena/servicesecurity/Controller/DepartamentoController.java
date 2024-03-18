package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.sena.servicesecurity.Entity.Departamento;
import com.sena.servicesecurity.IService.IDepartamentoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/departamento")
public class DepartamentoController extends ABaseController<Departamento,IDepartamentoService>{
	public DepartamentoController(IDepartamentoService service) {
        super(service, "Departamento");
    }
	
}
