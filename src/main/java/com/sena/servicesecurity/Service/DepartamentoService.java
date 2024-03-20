package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.Department;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IDepartmentRepository;
import com.sena.servicesecurity.IService.IDepartmentService;

@Service
public class DepartamentoService  extends ABaseService<Department> implements IDepartmentService{

	@Override
	protected IBaseRepository<Department, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
	@Autowired
	public IDepartmentRepository repository;
}
