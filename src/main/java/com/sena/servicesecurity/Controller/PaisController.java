package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.sena.servicesecurity.Entity.Pais;
import com.sena.servicesecurity.IService.IPaisService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/pais")
public class PaisController extends ABaseController<Pais,IPaisService>{
	public PaisController(IPaisService service) {
        super(service, "Pais");
    }
	
}
