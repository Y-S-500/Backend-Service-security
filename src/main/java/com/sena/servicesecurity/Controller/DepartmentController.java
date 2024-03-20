package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.sena.servicesecurity.Entity.Department;
import com.sena.servicesecurity.IService.IDepartmentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/departamento")
public class DepartmentController extends ABaseController<Department,IDepartmentService>{
	public DepartmentController(IDepartmentService service) {
        super(service, "Departamento");
    }
	
}
