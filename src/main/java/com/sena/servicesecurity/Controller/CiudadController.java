package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.sena.servicesecurity.Entity.Ciudad;
import com.sena.servicesecurity.IService.ICiudadService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/ciudad")
public class CiudadController extends ABaseController<Ciudad,ICiudadService>{
	public CiudadController(ICiudadService service) {
        super(service, "Ciudad");
    }
	
}
